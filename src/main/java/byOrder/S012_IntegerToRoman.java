package java.byOrder;

public class S012_IntegerToRoman {
    public String intToRoman(int num) {
        int[] number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res = new StringBuilder();
        for(int i=0;i<number.length;i++){
            while(num > number[i]){
                num -= number[i];
                res.append(symbol[i]);
            }
        }
        return res.toString();
    }
}
