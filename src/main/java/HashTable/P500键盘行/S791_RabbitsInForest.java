package HashTable.P500键盘行;

import java.util.Arrays;

public class S791_RabbitsInForest {
    public static void main(String[] args) {
        S791_RabbitsInForest test = new S791_RabbitsInForest();
        System.out.println(test.numRabbits(new int[]{
//                1, 0, 1, 0, 0
//                1, 1, 1, 2
                10,10,10
        }));
    }

    public int numRabbits(int[] answers) {
        if (answers == null || answers.length == 0)
            return 0;
        Arrays.sort(answers);
        int tempCnt = answers[0];
        int cnt = 1 + tempCnt--;
        for (int i = 1; i < answers.length; i++) {
            if (answers[i] != answers[i - 1] || tempCnt < 0) {
                tempCnt = answers[i];
                cnt += tempCnt + 1;
            }
            tempCnt--;
        }
        return cnt;
    }
}
