/*
Mathew Buck
CIS 27 Lab 3
 */
package binarysearchtreedriver;

public class BinarySearchTreeDriver {

    public static void main(String[] args) {
     
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.put("S", 0);
        bst.put("E", 1);
        bst.put("A", 2);
        bst.put("R", 3);
        bst.put("C", 4);
        bst.put("H", 5);
        bst.put("E", 6);
        bst.put("X", 7);
        System.out.println("Get Key E: " + bst.get("E"));
        System.out.println("Get Key Z: " + bst.get("Z"));
        System.out.println("Get Key C: " + bst.get("C"));
        
        
        
        
    }//end main
    
}//end class
