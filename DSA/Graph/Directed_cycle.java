import java.util.*;
public class Directed_cycle {
    //Path visiting concept is necessary to keep in mind while going through a path
    // if a node occurs again within the same path or say as a part of same path then cycle occurs
    //in directed graph else it will not be considered as a cycle.
    public static boolean ifCycle(ArrayList<Integer>[]g,int v){
        boolean []vis=new boolean[v+1];
        boolean []path=new boolean[v+1];
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                vis[i]=true;
                path[i]=true;
                if(dfs(i,g,vis,path)){
                    System.out.println(i);
                    return true;
                }
                path[i]=false;
            }
        }
        return false;
    }
    public static boolean dfs(int pos,ArrayList<Integer>g[],boolean []vis,boolean []path){
        for(int i:g[pos]){
            if(!vis[i]){
                vis[i]=true;
                path[i]=true;
                if(dfs(i,g,vis,path)) return true;
                path[i]=false;
            }else if(path[i]){
                return true;
            }
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String []args){
        int v=10;
        ArrayList<Integer>g[]=new ArrayList[v+1];
        for(int i=0;i<=v;i++){
            g[i]=new ArrayList<Integer>();
        }
        g[1].add(2);
        g[2].add(3);
        g[3].add(4);g[3].add(7);
        g[4].add(5);
        g[5].add(6);
        g[7].add(5);
        g[8].add(9);
        g[9].add(10);
        g[10].add(8);
        System.out.println("Graph has a cylce:"+ifCycle(g, v));
    }
    
}
