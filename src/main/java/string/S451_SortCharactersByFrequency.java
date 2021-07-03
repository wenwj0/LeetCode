package string;

import java.util.*;

public class S451_SortCharactersByFrequency {
    public static void main(String[] args) {
        S451_SortCharactersByFrequency test = new S451_SortCharactersByFrequency();
        System.out.println(test.frequencySort("tree"));
    }

    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Character c : list){
            for (int i=0;i< map.get(c);i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
