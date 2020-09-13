package string;

public class S657_RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
		int[] num = new int[26];

		char[] chars = moves.toCharArray();
		for(char c:chars){
			num[c -'A']++;
		}
		return (num[3]==num[20] && num[11]==num[17]);
	}
	public boolean judgeCircle0(String moves) {
		int t = 0;
		char[] s= moves.toCharArray();
		for(int i=0;i<s.length;i++) {
			if(s[i]=='L') {
				t+=1;
			}else if(s[i]=='R')
				t -= 1;
			else if(s[i]=='U')
				t += 1000;
			else if(s[i]=='D')
				t -= 1000;
		}
		if (t==0)
			return true;
		
		return false;
	}
}
