package greedy;

import java.util.Arrays;

public class S1833_MaximumIceCreamBars {
    public static void main(String[] args) {
        S1833_MaximumIceCreamBars test = new S1833_MaximumIceCreamBars();
        System.out.println(test.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }

    public int maxIceCream(int[] costs, int coins) {
        int res = 0;
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i];
                res++;
            } else {
                break;
            }
        }
        return res;
    }
}
