package java.byOrder;

import java.util.LinkedList;
import java.util.List;

public class S006_ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> list = new LinkedList<>();
        for(int i=0;i<Math.min(numRows,s.length());i++){
            list.add(new StringBuilder());
        }
        boolean goingDown =false;
        int row = 0;
        for(char c:s.toCharArray()){
            list.get(row).append(c);
            if(row==0 || row==numRows-1){
                goingDown = !goingDown;
            }
            row += goingDown?1:-1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : list){
            res.append(sb);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(new S006_ZigZagConversion().convert(s,numRows));
        //PAHNAPLSIIGYIR
    }
}
