package string;

public class S709_ToLowerCase {
    public String toLowerCase(String str){
        if(str==null || str.length()==0)
            return str;
        char[] s = str.toCharArray();
        for(int i=0;i<s.length;i++){
            if(s[i]>='A' && s[i]<='Z'){
                s[i] += 'a' - 'A';
            }
        }
        return String.valueOf(s);
    }
}
