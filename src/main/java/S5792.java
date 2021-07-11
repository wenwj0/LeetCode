public class S5792 {
    public int countTriples(int n) {
        int cnt = 0;
        for (int a=1;a<=n;a++){
            for (int b=1;b<=n;b++){
                for (int c=1;c<=n;c++){
                    if (match(a,b,c)){
                    cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public boolean match(int a,int b,int c){
        if (a*a + b*b == c * c)
            return true;
        return false;
    }
}
