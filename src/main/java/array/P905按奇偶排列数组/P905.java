package java.array.P905按奇偶排列数组;

public class P905 {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int i=0,j=1;
        while(i<len && j<len) {
        	while(i<len&&A[i]%2==0  ) {        		
        		
        	   		i+=2;       	
        	}	
        	while(j<len && A[j]%2==1 ) {        		
        		
        			j+=2;     	
        	}
        	if(i<len && j<len){
            	int temp;
            	temp = A[i];
            	A[i] = A[j];
            	A[j] = temp;
            }
        }
        return A;       
    }  
}
