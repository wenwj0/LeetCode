package array;

public class S621_TaskScheduler {
    public static void main(String[] args) {
        S621_TaskScheduler s621_taskScheduler = new S621_TaskScheduler();
        char[] tasks = new char[]{'A','A','A','B','B','B'};
        int n = 2;
        int res =s621_taskScheduler.leastInterval(tasks,n);
        System.out.println(res);
    }
    public int leastInterval(char[] tasks, int n) {
        if (tasks==null || tasks.length==0)
            return 0;
        int i=0,j;
        int sum = 0;
        int len = tasks.length;
        char[] res = new char[len];
        boolean flag[]  = new boolean[tasks.length];
        char temp = tasks[0];
        while(i<tasks.length){
            if (!flag[i]){

            }
        }
        return sum;
    }
}
