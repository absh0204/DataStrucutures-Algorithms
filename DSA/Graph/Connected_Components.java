import java.util.*;

public class Connected_Components {
    public static void DFS(int pos,boolean []vis,ArrayList<Integer>g[]){
        System.out.print(pos+" ");
        vis[pos]=true;
        for(int i:g[pos]){
            if(!vis[i]){
                DFS(i,vis,g);
            } 
        }

    }
    public static void count_component(boolean []vis,ArrayList<Integer>g[]){
        int count=0;
        for(int i=0;i<g.length;i++){
            for(int j:g[i]){
                if(!vis[j]){
                    DFS(j,vis,g);
                    System.out.println();
                    count++;
                }
            }
        }
        System.out.println("Connected Components:"+count);
        
    }
    public static void main(String []args){
        int n=8;
        ArrayList<Integer>g[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<>();
        }
        g[1].add(2);g[2].add(1);g[1].add(3);g[3].add(1);g[2].add(4);g[4].add(2);g[4].add(3);g[3].add(4);
        g[5].add(6);g[6].add(5);g[6].add(7);g[7].add(6);g[5].add(7);g[7].add(5);

        boolean vis[]=new boolean[n];
        count_component(vis, g);

    }
}
