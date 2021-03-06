package java.array.P240在二维数组中搜索n升级版;

public class P240 {
	public boolean searchMatrix(int[][] matrix,int target) {
		if(matrix.length==0)
			return false;
		int row = 0,col = matrix[0].length-1;
		while(row<matrix.length && col>=0) {
			if(target==matrix[row][col])
				return true;
			else if(target > matrix[row][col])
				row ++;
			else 
				col --;
		}
		return false;
	}
}
 