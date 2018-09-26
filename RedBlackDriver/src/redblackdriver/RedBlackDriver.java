/*
Mathew Buck
CIS 27 Lav 3
 */
package redblackdriver;

public class RedBlackDriver {

    public static void main(String[] args) {

        RedBlackBST rbt = new RedBlackBST();

        rbt.put(1, 1);
        rbt.put(2, 2);
        rbt.put(3, 3);
        rbt.put(4, 4);
        rbt.put(5, 5);
        rbt.put(6, 6);
        rbt.put(7, 7);
        rbt.put(8, 8);
        rbt.put(9, 9);
        rbt.put(10, 10);
        rbt.put(11, 11);
        rbt.put(12, 12);
        rbt.put(13, 13);
        rbt.put(14, 14);
        rbt.put(15, 15);
        rbt.put(16, 16);
        rbt.put(17, 17);
        rbt.put(18, 18);
        rbt.put(19, 19);
        rbt.put(20, 20);
        rbt.put(21, 21);
        rbt.put(22, 22);
        rbt.put(23, 23);
        rbt.put(24, 24);
        rbt.put(25, 25);
        rbt.put(26, 26);
        rbt.put(27, 27);
        rbt.put(28, 28);
        rbt.put(29, 29);
        rbt.put(30, true);
        rbt.put(31, 32);
        rbt.put(33, 33);
        rbt.put(34, 34);
        rbt.put(35, 35);
        rbt.put(36, 36);
        rbt.put(37, 37);
        rbt.put(38, '$');
        rbt.put(39, 39);
        rbt.put(40, 40);
        rbt.put(41, 41);
        rbt.put(42, 42);
        rbt.put(43, 43);
        rbt.put(44, 44);
        rbt.put(45, 45);
        rbt.put(46, 46);
        rbt.put(47, 47);
        rbt.put(48, 48);
        rbt.put(49, 49);
        rbt.put(50, "Sting that goes with key 50");
        rbt.put(51, 51);
        rbt.put(52, 52);
        rbt.put(53, 53);
        rbt.put(54, 54);
        rbt.put(55, 55);
        rbt.put(56, 56);
        rbt.put(57, 57);
        rbt.put(58, 58);
        rbt.put(59, 59);
        rbt.put(60, 60);
        System.out.println("Get value assosiated with key 50-"
                + "  (50, " + rbt.get(50) + ")");
        System.out.println("Get value assosiated with key 30-"
                + "  (30, " + rbt.get(30) + ")");
        System.out.println("Get value assosiated with key 1-"
                + "  (1, " + rbt.get(1) + ")");
        rbt.deleteMin();
        System.out.println("After deleteing the minimum: ");
        System.out.println("Get value assosiated with key 1-"
                + "  (1, " + rbt.get(1) + ")");
        System.out.println("Minimum was deleted.");
        System.out.println("Get value assosiated with key 2-"
                + "  (2, " + rbt.get(2) + ")");
        System.out.println("2 is the new minimum.");

    }
}

//Output

/*
run:
Get value assosiated with key 50-  (50, Sting that goes with key 50)
Get value assosiated with key 30-  (30, true)
Get value assosiated with key 1-  (1, 1)
After deleteing the minimum: 
Get value assosiated with key 1-  (1, null)
Minimum was deleted.
BUILD SUCCESSFUL (total time: 0 seconds)
*/
