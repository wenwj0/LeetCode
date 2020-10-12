package array;

import java.util.LinkedList;
import java.util.List;

public class S1002_FindCommonCharacters {
    public static List<String> commonChars(String[] A) {
        List<String> list = new LinkedList<>();
        char[][] charArray = new char[A.length][26];
        int index = 0;
        for (String string : A) {
            char[] letterArray = string.toCharArray();
            for (char letter : letterArray) {
                charArray[index][letter - 'a']++;
            }
            index++;
        }
        for (int j = 0; j < 26; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                if (charArray[i][j]<min)
                    min = charArray[i][j];
            }
            while(min-->0){
                list.add(String.valueOf((char)('a'+j)));
            }
        }


        return list;
    }

    public static void main(String[] args) {
        String[] input = {"bella","label","roller"};
        for (String a : commonChars(input)) {
            System.out.print(a + " ");
        }
    }
}
