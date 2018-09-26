/*
Mathew Buck
Generic Stack
Single Linked List
 */
package genericstacksques;

public class StackLL<T> {
    
    private Node first = null; //top of stack
    public int size = 0;
   
    //default constructor
    StackLL(){
        first = null;
        size = 0;
    }
    
    //pops data of the top of the stack
    public Object pop(){
        Object data = first.data;
        first = first.next;
        size--;
        return data;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public int size(){
        return size;
    }
    
    //pushes item onto the top of stack
    public void push(T data){
        Node oldfirst = first;
        first = new Node(data);
        first.data = data;
        first.next = oldfirst;
        size++;
    }
    
    public void displayList() {
        Node current = first;
        System.out.print("Size: " + size + ": ");
        while(current != null) {
            current.displayNode();
            if (current.next != null){
            System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }
    
    //helper class///////////////////////////////////////////////////////////
    private class Node<T>{
        private T data = null;
        private Node<T> next = null;
        
        public Node(T data){
            this.data = data;
        }
        
        public void displayNode() {
            System.out.print(data + " ");
        }
        
        public String toString() {
            return data.toString();
        }
    }/////////////////////////////////////////////////////////////////////
}
