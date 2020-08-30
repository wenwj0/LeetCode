package bitManipulation;

public class P476 {
	public int findComplement(int num) {
		int[] A = new int[34];
		int i=0;
		while(num>0) {
			A[i++]= num % 2>0?0:1;
			num /= 2;
		}
		int sum = 0;
		for(int j=0;j<i;j++) {
			sum += Math.pow(2,j)*A[j];
		}
		return sum;
	}
}
