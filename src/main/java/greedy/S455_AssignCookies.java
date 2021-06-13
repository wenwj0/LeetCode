package greedy;

import java.util.Arrays;

public class S455_AssignCookies {
    public static void main(String[] args) {
        S455_AssignCookies test = new S455_AssignCookies();
        System.out.println(test.findContentChildren(new int[]{1,2,3},new int[]{1,1}));
        System.out.println(test.findContentChildren(new int[]{1,2},new int[]{1,2,3}));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int indexG = 0;
        int indexS = 0;
        int cnt = 0;
        while (indexS <s.length && indexG <g.length) {
            if (s[indexS] >= g[indexG]) {
                indexG++;
                cnt++;
            }
            indexS++;
        }
        return cnt;
    }
}
