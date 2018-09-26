/*
Mathew Buck
CIS 27 Lab 3
 */
package symboltablesdriver;

//Much slower than Binary Search.
//Search / get() is O(n)
//Insert / put() is O(n)
public class SequentialSearchSymbolTable<Key, Value> {

    private Node first;//First node in the linked list.

    //Search for key, return the associated value.
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.val;
            }
        }
        return null;
    }

    //Search for key. Update value if fournd; grow table if new. 
    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next) {
            //The search hit: update the value.
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        //The search missed: add new node. 
        first = new Node(key, val, first);
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.key + " " + current.val);
            if (current.next != null) {
                System.out.print(" | ");
            }
            current = current.next;
        }
        System.out.println();
    }

    //------------------------------------------------------------------------
    //Helper class
    //------------------------------------------------------------------------
    private class Node {

        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }

        //end helper class
    }

//end class
}
