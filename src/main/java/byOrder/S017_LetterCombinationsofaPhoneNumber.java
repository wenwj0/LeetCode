package java.byOrder;

import java.util.LinkedList;
import java.util.List;

public class S017_LetterCombinationsofaPhoneNumber {
    public char[][] digitsChar = {
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return res;
    }

    public List<String> res = new LinkedList<>();

    public void backtrack(String combination, String next_digits) {
        if (next_digits.length() <= 0) {
            res.add(combination);
        } else {
            int digit = Integer.valueOf(next_digits.substring(0, 1));
            int len = digitsChar[digit].length;
            for (int i = 0; i < len; i++) {
                backtrack(combination + digitsChar[digit][i], next_digits.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        List<String> res = new S017_LetterCombinationsofaPhoneNumber().letterCombinations("23");
        for (String str : res) {
            System.out.print(str + " ");
        }
    }
}
