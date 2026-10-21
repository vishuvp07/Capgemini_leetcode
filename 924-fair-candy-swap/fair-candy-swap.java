
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int y : bobSizes) {
            sumB += y;
        }

        int diff = (sumB - sumA) / 2;

        for (int x : aliceSizes) {
            for (int y : bobSizes) {
                if (y - x == diff) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{};
    }
}
