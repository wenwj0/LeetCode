package leetcodeTest;

public class P58 {
    public int lengthOfLastWord(String s) {
    	int len = s.length();
    	int count=0;
    	String[] strs = new String[len+1];
    	for(String str:s.split(" ")) {
    		if(str.length()!=0)
    			count = str.length();
    	}
//    	boolean flag = false;
//    	
//    	for(int i=0;i<len;i++) {
//    		if(s.charAt(i)!=' ') {
//    			count++;
//    			flag = true;
//    		}
//    		else if(s.charAt(i+1))
//    			count = 0;
//    	}
//    	
//    	
//    	
//    	
//    	if(!flag)
//    		return 0;
        return count;
    	
    }
}
