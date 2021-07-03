import java.util.ArrayList;
import java.util.List;

public class LCP_07 {
    public static void main(String[] args) {
        LCP_07 test = new LCP_07();
        System.out.println(test.numWays(5,new int[][]{
                {0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}
        },3));
    }
    private int res;
    public int numWays(int n, int[][] relation, int k) {
        res = 0;
        Player[] players = new Player[n];
        for (int i=0;i<n;i++){
            players[i] = new Player(i);
        }
        for (int i=0;i< relation.length;i++){
            int a = relation[i][0];
            int b = relation[i][1];
            players[a].friends.add(b);
        }
        search(0,k,0,n-1,players);
        return res;
    }
    public void search(int time,int k,int id,int n,Player[] players){
        if (time>=k){
            if (id==n){
                res ++;
            }
            return;
        }
        for (Integer i:players[id].friends){
            search(time+1,k,i,n,players);
        }
    }
}
class Player{
    int id;
    List<Integer> friends;
    Player(int id){
        this.id = id;
        this.friends = new ArrayList<>();
    }
}
