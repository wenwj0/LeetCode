import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Automaton {
    public int signed = 1;
    public int state = 0;
    public long ans = 0;

    public int[][] table = {
            {0, 1, 2, 3},
            {3, 3, 2, 3},
            {3, 3, 2, 3},
            {3, 3, 3, 3},
    };

    private int get_col(char c) {
        if (c == ' ') return 0;
        if (c == '+' || c == '-') return 1;
        if (Character.isDigit(c)) return 2;
        return 3;
    }

    public void get(char c) {
        state = table[state][get_col(c)];
        if (state == 2) {
            ans = 10 * ans + Integer.valueOf(c - '0');
            ans = signed==1? Math.min(ans,Integer.MAX_VALUE):Math.min(ans,Integer.MAX_VALUE+1L);
        } else if (state == 1) {
            signed = c=='-'?-1:1;
        }
    }
}

public class S008_StringToInteger {

    public int myAtoi(String str) {
        Automaton automaton = new Automaton();
        for (char c : str.toCharArray()) {
            automaton.get(c);
        }
        int ans = (int)automaton.ans;
        return automaton.signed==1?ans:ans*-1;
    }


    public int myAtoi0(String str) {
        if (str == null || str.length() == 0)
            return 0;
        char[] chs = str.toCharArray();
        int res = 0;
        boolean isMinus = false;
        int first = 0;
        while (first < str.length() && chs[first] == ' ')
            first++;
        for (int i = first; i < chs.length; i++) {
            if (i == first && (chs[i] == '-' || chs[i] == '+')) {
                isMinus = chs[i] == '-' ? true : false;
            } else if (chs[i] < '0' || chs[i] > '9') {
                break;
            } else {
                int num = Integer.valueOf(chs[i] - '0');
                if (res >= Integer.MAX_VALUE / 10) {
                    if (!isMinus) {
                        if (res > Integer.MAX_VALUE / 10 || num > 7)
                            return Integer.MAX_VALUE;
                    } else {
                        if (res > Integer.MAX_VALUE / 10 || num > 8)
                            return Integer.MIN_VALUE;
                    }
                }
                res = res * 10 + num;
            }
        }

        return isMinus ? res * -1 : res;
    }

    public int myAtoi1(String str) {
        str = str.trim();
        if (str == null || str.length() == 0)
            return 0;
        char[] chs = str.toCharArray();
        long res = 0;
        boolean isMinus = false;
        for (int i = 0; i < chs.length; i++) {
            if (i == 0 && (chs[i] == '-' || chs[i] == '+')) {
                isMinus = chs[i] == '-' ? true : false;
            } else if (!Character.isDigit(chs[i])) {
                break;
            } else {
                int num = Integer.valueOf(chs[i] - '0');
                res = res * 10 + num;
                if (!isMinus && res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (isMinus && res > Integer.MAX_VALUE + 1L) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return isMinus ? (int) res * -1 : (int) res;
    }

    public static void main(String[] args) {
        String str = "-91283472332";
        System.out.println(new S008_StringToInteger().myAtoi("  +-2147483647"));
    }
}
