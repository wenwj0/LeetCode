import java.util.*;

public class S473_MatchsticksToSquare {
    public static void main(String[] args) {
        S473_MatchsticksToSquare test = new S473_MatchsticksToSquare();
        System.out.println(test.makesquare(new int[]{1, 1, 2, 2, 2}));
        System.out.println(test.makesquare(new int[]{10, 6, 5, 5, 5, 3, 3, 3, 2, 2, 2, 2}));
        System.out.println(test.makesquare(new int[]{5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3}));
        System.out.println(test.makesquare(new int[]{3, 3, 3, 3, 4}));
    }

    public boolean makesquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4)
            return false;
        int sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            sum += matchsticks[i];
        }
        if (sum % 4 != 0)
            return false;
        edgeSum = sum / 4;
        int len = matchsticks.length;
        list = new ArrayList<>();
        bucket = new int[4];
        for (int i : matchsticks) list.add(i);
        Collections.sort(list, Collections.reverseOrder());
        return dfs(0);
    }

    private List<Integer> list;
    private int[] bucket;
    private int edgeSum;

    public boolean dfs(int index) {
        if (index == list.size()) {
            return bucket[0] == bucket[1] && bucket[1] == bucket[2] && bucket[2] == bucket[3];
        }
        int element = list.get(index);
        for (int i = 0; i < 4; i++) {
            if (bucket[i] + element <= edgeSum) {
                bucket[i] += element;
                if (dfs(index + 1)) return true;
                bucket[i] -= element;
            }
        }
        return false;
    }
}
