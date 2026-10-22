
import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {

        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < ops.length; i++) {

            if (ops[i].equals("C")) {
                scores.remove(scores.size() - 1);
            }
            else if (ops[i].equals("D")) {
                int last = scores.get(scores.size() - 1);
                scores.add(last * 2);
            }
            else if (ops[i].equals("+")) {
                int last = scores.get(scores.size() - 1);
                int secondLast = scores.get(scores.size() - 2);
                scores.add(last + secondLast);
            }
            else {
                scores.add(Integer.parseInt(ops[i]));
            }
        }

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        return sum;
    }
}
