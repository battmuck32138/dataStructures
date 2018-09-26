/*
Mathew Buck 
CIS 27 Lab 1
 */
package genericstacksques;

import java.util.Arrays;

public class UnionFindQuickFind {
    
    private int[] id; //access to component id (site indx)
    private int count; //number of components
    
    //initialize component id array to 0,1,2,...
    public UnionFindQuickFind(int numComps){
        count = numComps;
        id = new int[numComps];
        
        for (int i = 0; i < numComps; i++){
            id[i] = i;
        }
    }
    
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    
    public int count(){
        return count;
    }
    
    //finds whats in the element 
    public int find(int p){
        return id[p];
    }
    
    //changes the contents of p to the contents of q,
    //and also changes every element with the same contents as p
    //to match the contents of q
    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);
        
        //already p u Q
        if (pID == qID){
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
                count--;
            }
        }
    }
    
    public String toString(){
        return "id[]: " + Arrays.toString(id) + "\n";
    }
//end class
}
