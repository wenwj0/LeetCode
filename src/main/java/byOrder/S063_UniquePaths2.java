package java.byOrder;

public class S063_UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] sum = new int[m + 1][n + 1];
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                flag = true;
            }
            sum[i + 1][1] = flag == true ? 0 : 1;
        }
        flag = false;
        for(int j=0;j<n;j++){
            if(obstacleGrid[0][j]==1)   flag = true;
            sum[1][j+1] = flag==true?0:1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    sum[i + 1][j + 1] = 0;
                } else {
                    sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j];
                }
            }
        }
        return sum[m][n];
    }
}
