package leetcodeTest;

public class P461 {
	public int hammingDistance(int x,int y) {
		int cnt = 0;
		while(x!=0 || y!=0) {
			int a = x%2;
			int b = y%2;
			if(a!=b) {
				cnt ++;
			}
			x /=2;
			y /=2;
		}		
		return cnt;
	}
}
