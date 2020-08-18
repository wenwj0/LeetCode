public class S405_ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if(num==0) return "0";
        char[] letter = new String("0123456789abcdef").toCharArray();
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int tmp = num & 15;
            sb.append(letter[tmp]);
            num = num >>> 4;
        }
        return sb.reverse().toString();
    }
}
