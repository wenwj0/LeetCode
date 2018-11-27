package leetcodeTest;

public class P657 {
	public boolean judgeCircle(String moves) {
		int t = 0;
		for(int i=0;i<moves.length();i++) {
			if(moves.charAt(i)=='L') {
				t+=1;
			}else if(moves.charAt(i)=='R')
				t -= 1;
			else if(moves.charAt(i)=='U')
				t += 1000;
			else if(moves.charAt(i)=='D') 
				t -= 1000;
		}
		if (t==0)
			return true;
		
		return false;
	}
}
