/*
Mathew Buck
CIS 27 Lab 3
 */
package binarysearchtreedriver;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node root;//Root of the BST
    
    public Value get(Key key) {
        return get(root, key);
    }

    //Helper method for get(Key key).
    //Return value associated with key in the subtree rooted at x.
    //Return null if the key is not found in the subtree rooted at x.
    private Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.val;
        }
    }

    //Search for key. Update value if found; Grow tree if new. 
    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    //Helper for put(Key key, Value val)
    //Change key's value to val if key in subtree rooted at x.
    //Otherwise, add new Node to subtree associateing key with value.
    private Node put(Node x, Key key, Value val) {
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.val = val;
        }
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    public int size() {
        return size(root);
    }

    //Helper method for size()
    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }
    
     


    //--------------------------------------------------------------------
    //Helper Class
    //--------------------------------------------------------------------
    private class Node {

        private Key key;
        private Value val;
        private Node left;//link to left child
        private Node right;//link to right child
        private int size;

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
        
        public void displayNode(){
            System.out.print(key + "" + val + " ");
        }

    }//end helper class

}//end class
