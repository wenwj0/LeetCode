import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class S5793 {
        public static void main(String[] args) {
        S5793 test = new S5793();
//        char[][] maze = {{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};
//        int[] entrance = new int[]{1, 2};
        char[][] maze = {{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};
        int[] entrance = new int[]{1, 0};
        System.out.println(test.nearestExit(maze, entrance));
    }
    class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int ei = entrance[0];
        int ej = entrance[1];
        int[][] direc = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] dis = new int[m][n];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(ei, ej));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int ci = pair.a;
            int cj = pair.b;
            if ((ci == 0 || ci == m - 1 || cj == 0 || cj == n - 1) && dis[ci][cj]!=0) {
                return dis[ci][cj];
            }
            for (int k = 0; k < 4; k++) {
                int ni = ci + direc[k][0];
                int nj = cj + direc[k][1];
                if (ni < 0 || ni >= m || nj < 0 || nj >= n || maze[ni][nj] == '+')
                    continue;
                if (ni==ei && nj==ej)
                    continue;
                if (dis[ni][nj]!=0)
                    continue;
                queue.add(new Pair(ni, nj));
                dis[ni][nj] = dis[ci][cj] + 1;
            }
        }
        return -1;
    }
}
