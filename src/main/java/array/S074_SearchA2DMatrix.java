package array;


public class S074_SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0||matrix[0].length==0)
			return false;
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i <row;i++) {
			if (matrix[i][col-1] == target) {
				return true;
			} else if (matrix[i][col-1] > target) {
				for (int j = col-2; j >=0;j--) {
					if (target == matrix[i][j])
						return true;
				}
				return false;
			}
		}
		return false;
	}
	public boolean searchMatrix0(int[][] matrix, int target) {
		if (matrix.length == 0)
			return false;
		int rowIndex = 0;// �����±�
		int colIndex = matrix[0].length - 1;// �����±�
		while (rowIndex < matrix.length && colIndex >= 0) {
			if (target == matrix[rowIndex][colIndex])
				return true;
			else if (target > matrix[rowIndex][colIndex])
				rowIndex++;
			else
				colIndex--;
		}
		return false;
	}
}
