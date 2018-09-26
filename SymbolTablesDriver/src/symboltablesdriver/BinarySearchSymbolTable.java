/*
Mathew Buck
CIS 27 Lab 3
 */
package symboltablesdriver;

//Also known as half-interval search. 
//Far better than sequential search.  Is the method of choice. 
//Search / get() is O(lgN)
//Insert / put() is O(2N)
public class BinarySearchSymbolTable<Key extends Comparable<Key>, Value> {

    private Key[] keys;
    private Value[] vals;
    private int size;

    public BinarySearchSymbolTable(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Compare key with the key in the middle of the sorted array.  If it's 
    //equal, return it's index; if it's <, look in the left half of the 
    //array, if it's >, look in the right half. 
    public int rank(Key key) {
        int lo = 0;
        int hi = size - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0) {
                hi = mid - 1;
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }

    public Value get(Key key) {
        if (isEmpty()) {
            return null;
        }
        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            return vals[i];
        } else {
            return null;
        }
    }

    public void put(Key key, Value val) {
        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            vals[i] = val;
            return;
        }
        for (int j = size; j > i; j--) {
            keys[j] = keys[j - 1];
            vals[j] = vals[j - 1];
        }
        keys[i] = key;
        vals[i] = val;
        size++;
    }

    public void displayTable() {
        if (size == 0) {
            System.out.println("Empty list.");
            return;
        }
        System.out.print("keys[");
        for (int i = 0; i < size; i++) {
            System.out.print(keys[i]);
            if (keys[i + 1] != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]  ");

        System.out.print("Vals[");
        for (int i = 0; i < size; i++) {
            System.out.print(vals[i]);
            if (vals[i + 1] != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]  ");
    }

//end class    
}
