package codeWars;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Permutations {
    @Test
    public void example2() {
        assertEquals(new ArrayList<String>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        List<String> list = singlePermutations("ab").stream().sorted().collect(Collectors.toList());
        System.out.println(list);
    }

    public static List<String> result;
    public static Set<String> set;

    public static List<String> singlePermutations(String s) {
        if (s == null || s.isEmpty())
            return null;
        char[] chars = s.toCharArray();
        result = new ArrayList<>();
        set = new HashSet<>();
        permutation(chars, 0);
        result.addAll(set);
        return result;
    }

    public static void permutation(char[] chars, int index) {
        if (index >= chars.length) {
            set.add(String.valueOf(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permutation(chars, index + 1);
            swap(chars, index, i);
        }
    }

    public static void swap(char[] chars, int a, int b) {
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
    }
}
