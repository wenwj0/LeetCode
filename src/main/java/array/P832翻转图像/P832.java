package java.array.P832翻转图像;

public class P832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        for(int i=0;i<len;i++) {
        	swap(A[i]);
        }
        for(int j=0;j<len;j++) {
        	reverse(A[j]);
        }
    	return A;
    }
    int[] swap(int[] B) {
    	int i=0,j=B.length-1;
    	while(i<j) {
    		int temp = B[i];
    		B[i] = B[j];
    		B[j] = temp;
    		i++;
    		j--;
    	}
    	return B;
    }
    int[] reverse(int[] C) {
    	for(int i=0;i<C.length;i++) {
    		if(C[i]==0)
    			C[i]=1;
    		else
    			C[i]=0;
    	}
    	return C;
    }
}
