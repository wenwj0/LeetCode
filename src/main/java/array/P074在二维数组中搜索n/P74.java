package java.array.P074在二维数组中搜索n;

public class P74 {
	public boolean searchMatrix(int[][] matrix, int target) {
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
