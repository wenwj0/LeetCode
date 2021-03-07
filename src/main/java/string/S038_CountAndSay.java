package string;

public class S038_CountAndSay {
    public static void main(String[] args) {
        S038_CountAndSay s028_countAndSay = new S038_CountAndSay();
        System.out.println(s028_countAndSay.countAndSay(4));
    }
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        String num = countAndSay(n-1);
        char[] chars = num.toCharArray();
        int cnt =1;
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<chars.length;i++){
            if (chars[i]!=chars[i-1]){
                sb.append(cnt);
                sb.append(chars[i-1]);
                cnt = 1;
            }else {
                cnt++;
            }
        }
        sb.append(cnt);
        sb.append(chars[chars.length-1]);
        return sb.toString();
    }
}
