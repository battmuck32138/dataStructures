/*
Mathew Buck
CIS 27 Lab 1
*/
package genericstacksques;

import java.util.Arrays;

public class UnionFindWeightedQuickUnion {
    
    private int[] id;
    private int[] sz;
    private int count;
    
    //constructor
    public  UnionFindWeightedQuickUnion(int numComps){
        count = numComps;
        id = new int[numComps];
        sz = new int[numComps];
        
        //initalize to index 0,1,2,...
        for (int i = 0; i < numComps; i++){
            id[i] = i;
        }
        //initalize sizes to 1
        for (int i = 0; i < numComps; i++){
            sz[i] = 1;
        }
    }
    
    //follow links to find a root
    private int find(int p){
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }
    
   public void union(int p, int q){
       int i = find(p);
       int j = find(q);
       
       if(i == j){
           return;
       }
       //make smaller root point to larger root
       if (sz[i] < sz[j]){
           id[i] = j;
           sz[j] += sz[i];
       }
       else{
           id[j] = i;
           sz[i] += sz[j];
       }
       count--;
       System.out.print(p + " U " + q + ", ");//displays all unions
   }
   
   public int count(){
       return count;
   }
    
   public boolean connected(int p, int q){
       return find(p) == find(q);
   }
   
   public String toString() {
        return "id[]: " + Arrays.toString(id) + "\n";
    }
   
   public int getId(int element){
       return id[element];
   }
   
   public int getSz(int element){
       return sz[element];
   }
 //end class   
}
