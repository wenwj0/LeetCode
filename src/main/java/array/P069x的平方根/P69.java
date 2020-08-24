package java.array.P069x的平方根;

public class P69 {
	public int mySqrt(int x) {
		int left = 1;
		int right = x;
		int mid;
		while(true) {
			mid = left + (right - left)/2;
			if(mid>x/mid) {
				right = mid - 1;
			}else {
				if((mid+1)>x/(mid+1)) {
					return mid;
				}
				left = mid + 1;
			}
		}
		
		
	}
}
