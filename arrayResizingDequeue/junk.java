public class junk {
    public static void main (String[] args) {
        ArrayDeque e = new ArrayDeque<Integer>();

        e.addFirst(0);
        e.addFirst(1);
        e.addLast(2);
        e.addFirst(3);
        e.addLast(4);
        e.get(1);
        e.addFirst(6);
        e.addFirst(7);
        e.removeFirst();
        e.get(3);

    }

}
