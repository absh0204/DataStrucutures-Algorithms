import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class RottenOranges{
    static class Pair{
        int a;
        int b;
        int c;
        public Pair(int a,int b,int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        // public T1 getFirst() {
        //     return first;
        // }
        // public T2 getSecond() {
        //     return second;
        // }
        
    }
    public static int rot(int [][]g,int [][]vis,Queue<Pair>q,int cntFresh){
        int n=g.length;
        int m=g[0].length;
        int tm=0;
        int []row={0,0,-1,1};
        int []col={-1,1,0,0};
        int cnt=0;
        while (!q.isEmpty()) {
            int r=q.peek().a;
            int c=q.peek().b;
            int t=q.peek().c;
            tm=Math.max(tm,t);
            q.poll();
            for(int i=0;i<4;i++){
                int nrow=r+row[i];
                int ncol=c+col[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<n &&  vis[nrow][ncol]==0 && g[nrow][ncol]==1 ){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntFresh) return -1;
        return tm;
    }
    public static void main(String args[]){
        int [][]g={
            {0,1,2},
            {0,1,1},
            {2,1,1}
        };
        int cntFresh=0;
        int[][]vis=new int[g.length][g[0].length];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==2){
                    vis[i][j]=2;
                    Pair p=new Pair(i,j,0);
                    q.add(p);
                }else{
                    vis[i][j]=0;
                }
                if(g[i][j]==1) cntFresh++;

            }
        }

        
        System.out.print(rot(g,vis,q,cntFresh));;
        
        
    }
}