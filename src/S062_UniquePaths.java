public class S062_UniquePaths {
    public int uniquePaths(int m,int n){
        int[][] res = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(i==1){
                    res[i][j] = 1;
                }else if(j==1){
                    res[i][j] = 1;
                }else{
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
            }
        }
        return res[m][n];
    }
}
