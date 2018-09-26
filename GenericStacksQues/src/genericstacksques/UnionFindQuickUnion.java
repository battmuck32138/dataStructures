/*

 */
package genericstacksques;
import java.util.Arrays;

public class UnionFindQuickUnion {

    private int[] id; //access to component id (site indx)
    private int count; //number of components

    //initialize component id array to 0,1,2,...
    public UnionFindQuickUnion(int numComps) {
        count = numComps;
        id = new int[numComps];
        
        for (int i = 0; i < numComps; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }

    //finds whats in the element 
    private int find(int p) {
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }

    //changes the contents of p to the contents of q,
    //and also changes every element with the same contents as p
    //to match the contents of q
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        
        //already p u Q
        if (pRoot == qRoot) {
            return;
        }
        id[pRoot] = qRoot;
        count--; 
    }

    public String toString() {
        return "id[]: " + Arrays.toString(id) + "\n";
    }
//end class
}
