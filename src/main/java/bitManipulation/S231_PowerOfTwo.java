package bitManipulation;

public class S231_PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if(n<0)
            return false;
        return ((n-1) & n)==0;
    }
}
