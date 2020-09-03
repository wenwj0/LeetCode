package string;

public class S557_ReverseWordsInAString {
    public String reverseWords(String s){
        if(s==null || s.length()==0)
            return s;
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            if(i!=0)
                sb.append(" ");
            sb.append(reverseWord(strs[i]));
        }
        return sb.toString();
    }
    public String reverseWord(String s){
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;
        while(left<right){
            char tmp = c[left];
            c[left] = c[right];
            c[right] = tmp;
            left++;right--;
        }
        return String.valueOf(c);
    }
}
