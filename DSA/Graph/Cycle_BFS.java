import java.util.*;
public class Cycle_BFS {
    static class Pair{
        int n;
        int p;
        public Pair(int n,int p){
            this.p=p;
            this.n=n;
        }
    }
    public static boolean ifCycle(ArrayList<Integer>[]g, boolean []vis){
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,-1));
        while (!q.isEmpty()) {
            Pair p=q.poll();
            for(int i:g[p.n]){
                if(!vis[i]){
                    vis[i]=true;
                    q.add(new Pair(i,p.n));
                }else if(p.n!=i){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String []args){
        int n=8;
        ArrayList<Integer>[]g=new ArrayList[n];
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<Integer>();
        }
        g[0].add(1);g[0].add(2);g[1].add(0);g[2].add(0);
        g[1].add(3);g[3].add(1);        
        g[3].add(4);g[4].add(3);
        g[2].add(5);g[5].add(2);
        g[5].add(6);g[6].add(5);
        g[6].add(7);g[7].add(6);
        for(int i=0;i<g.length;i++){
            System.out.print(i+"->");
            for(int k:g[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        String res=(ifCycle(g, new boolean[n]))?"Yes":"No";
        System.out.print("isCycle:"+res);
    
    }
}
