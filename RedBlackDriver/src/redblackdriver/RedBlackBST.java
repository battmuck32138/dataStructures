/*
Mathew Buck
CIS 27 Lab 3
 */
package redblackdriver;

public class RedBlackBST <Key extends Comparable<Key>, Value> {
    private Node root;
    private static final boolean red = true;
    private static final boolean black = false;
    
    private Node moveRedLeft(Node h){
        flipColors(h);
        if(isRed(h.right.left)){
            h.right = rotateRight(h.right);
            h = rotateLeft(h);
        }
        return h;
    }
    
    public void deleteMin() {
        if (!isRed(root.left) && !isRed(root.right)) {
            root.color = red;
        }
        root = deleteMin(root);
        if (!isEmpty()) {
            root.color = black;
        }
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    private Node deleteMin(Node h){
        if(h.left == null){
            return null;
        }
        if(!isRed(h.left) && !isRed(h.left.left)){
            h = moveRedLeft(h);
        }
            h.left = deleteMin(h.left);
            return balance(h);
    }
    
    private Node balance(Node h){
        if (isRed(h.right)){
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)){
            h = rotateRight(h);
        }
        if(isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }
        return h;
    }
    
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

    public void put(Key key, Value val){
      root = put(root, key, val);
      root.color = black;
    }
    
    private Node put(Node h, Key key, Value val) {
        if (h == null) {
            return new Node(key, val, 1, red);
        }
        int cmp = key.compareTo(h.key);
        if (cmp < 0) {
            h.left = put(h.left, key, val);
        }
        else if(cmp > 0){
            h.right = put(h.right, key, val);
        }
        else{
            h.val = val;
        }
        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }
        if(isRed(h.left) && isRed(h.right)){
            h = rotateRight(h);
        }
        if(isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }
        h.size = size(h.left) + size(h.right) + 1;
        return h;
    }
   
    void flipColors(Node h){
        h.color = red;
        h.left.color = black;
        h.right.color = black;
    }
    
    Node rotateRight(Node h){
       Node x = h.left;
       h.left = x.right;
       x.right = h;
       x.color = h.color;
       h.color = red;
       x.size = h.size;
       h.size = 1 + size(h.left) + size(h.right);
       return x;
    }
    
    Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = red;
        x.size = h.size;
        h.size = 1 + size(h.left) + size(h.right);
        return x;
    }
    
    private boolean isRed(Node x){
        if (x == null){
            return false;
        }
        return x.color == red;
    }
    
    public int size(){
        return size(root);
    }
    
    private int size(Node x){
        if(x == null){
            return 0;
        }
        else{
            return x.size;
        }
    }
    
    
    //------------------------------------------------------------------------
    //Helper Class
    //------------------------------------------------------------------------
    private class Node {
        Key key;
        Value val;
        Node left;
        Node right;
        int size;
        boolean color;
        
        Node(Key key, Value val, int size, boolean color){
            this.key = key;
            this.val = val;
            this.size = size;
            this.color = color;
        }
    }//end helper class
    
}//end class
