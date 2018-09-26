/**
 * A generic array based deque with circular topology and
 * re-sizing capabilities.
 */
public class ArrayDeque<T> {
    private T[] items;
    private int size;
    private int first;
    private int last;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        size = 0;
        first = 4;
        last = 4;
    }

    public void addFirst(T item) {
        resizeArray();
        int insertAt = first - 1;
        if (insertAt == -1) {
            insertAt = items.length - 1;
        }
        items[insertAt] = item;
        first = insertAt;
        if (size == 0) {
            last = first;
        }
        size++;
    }

    public void addLast(T item) {
        resizeArray();
        int insertAt = last + 1;
        if (insertAt == items.length) {
            insertAt = 0;
        }
        items[insertAt] = item;
        last = insertAt;
        if (size == 0) {
            first = last;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T removeFirst() {
        resizeArray();
        if (size == 0) {
            return null;
        }
        T firstItem = items[first];
        items[first] = null;
        first += 1;
        if (first == items.length) {
            first = 0;
        }
        if (size == 1) {
            last = 4;
            first = 4;
        }
        size--;
        return firstItem;
    }

    public T removeLast() {
        resizeArray();
        if (size == 0) {
            return null;
        }
        T lastItem = items[last];
        items[last] = null;
        last -= 1;
        if (size == 1) {
            first = 4;
            last = 4;
        }
        if (last == -1) {
            last = items.length - 1;
        }
        size--;
        return lastItem;
    }

    public T get(int index) {
        if (index >= size) {
            return null;
        }
        if (index == 0) {
            return items[first];
        }
        if (index == size -1) {
            return items[last];
        }

        int i = first;
        int ct = 0;
        while (ct < index) {
            i++;
            ct++;
            if (i == items.length) {
                i = 0;
            }
        }
        return items[i];
    }

    public void printDeque() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    //Helper Methods///////////////////////////////////////////////////

    //Returns true if array usage is < 0.25
    private boolean reduceArray() {
        if (items.length >= 16) {
            float usageFactor = (float) size / items.length;
            if (usageFactor < 0.25) {
                return true;
            }
        }
        return false;
    }

    //Re-sizes the items array when full.
    private void resizeArray() {
        if (size == items.length) {
            T[] bigArr = (T[]) new Object[size * 2];
            transferArray(bigArr);
        }
        if (reduceArray()) {
            T[] smallArr = (T[]) new Object[items.length / 2];
            transferArray(smallArr);
        }
    }

    //Transfers the contents of items to either a bigger or smaller array.
    //The contents of the old array will be centered in the new array.
    private void transferArray(T[] newArr) {
        int newFirst = newArr.length / 4;
        int newLast = newFirst + size - 1;
        int j = 0;
        for (int i = newFirst; i <= newLast; i++) {
            newArr[i] = get(j);
            j++;
        }
        items = newArr;
        first = newFirst;
        last = newLast;

    }

}


