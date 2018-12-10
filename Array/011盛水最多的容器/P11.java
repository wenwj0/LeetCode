package leetcode;

public class P11 {
	public int maxArea(int[] height) {
		int max = 0;
		int i=0,j = height.length-1;
		while(i<j) {
			int len = j - i;
			int temp = Math.min(height[i], height[j])*len;
			if(temp>max)
				max = temp;
			if(height[i]<=height[j])
				i++;
			else
				j--;
		}
		
		return max;
	}
}
