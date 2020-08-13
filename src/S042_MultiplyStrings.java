public class S042_MultiplyStrings {
    public String multiply(String num1, String num2) {
        if("0".equals(num1)||"0".equals(num2))
            return "0";
        StringBuilder sb = new StringBuilder();
        int[] res = new int[num1.length() + num2.length()];
        int t = 0;
        int k=t ;
        int temp = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            k = t;
            int b = Integer.valueOf(num2.charAt(i) - '0');
            for (int j = num1.length() - 1; j >= 0; j--) {
                int a = Integer.valueOf(num1.charAt(j) - '0');
                temp = res[k] + a * b;
                res[k] = temp % 10;
                res[k + 1] += temp / 10;
                k++;
            }
            t++;
        }
        for(int i=k;i>=0;i--){
            if(i==k && res[i]==0)
                continue;
            sb.append(res[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new S042_MultiplyStrings().multiply("0", "0"));
    }
}
