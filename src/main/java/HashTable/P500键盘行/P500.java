package java.HashTable.P500键盘行;

import java.util.LinkedList;
import java.util.List;

public class P500 {
    public static String[] findWords(String[] words){
        List<String> list = new LinkedList<>();
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";
        outter:for(String word : words){
            char[] charArray = word.toLowerCase().toCharArray();
            String line;
            if(line1.indexOf(charArray[0])!=-1){
                line = line1;
            }else if(line2.indexOf(charArray[0])!=-1){
                line = line2;
            }else {
                line = line3;
            }
            for(char c:charArray){
                if(line.indexOf(c)==-1){
                    continue outter;
                }
            }
            list.add(word);
        }

        String[] res = new String[list.size()];
        return list.toArray(res);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        for(String s : findWords(words)){
            System.out.print(s + " ");
        }
    }
}
