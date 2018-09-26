/*
Mathew Buck
CIS 27 Lab 3
 */
package symboltablesdriver;

public class SymbolTablesDriver {

    public static void main(String[] args) {

        BinarySearchSymbolTable bsst = new BinarySearchSymbolTable(13);
        SequentialSearchSymbolTable ssst = new SequentialSearchSymbolTable();

        System.out.println("Sequential Search Symbol Table");
        System.out.println();
        ssst.put("E", 0);
        ssst.displayList();
        ssst.put("A", 1);
        ssst.displayList();
        ssst.put("S", 2);
        ssst.displayList();
        ssst.put("Y", 3);
        ssst.displayList();
        ssst.put("Q", 4);
        ssst.displayList();
        ssst.put("U", 5);
        ssst.displayList();
        ssst.put("E", 6);
        ssst.displayList();
        ssst.put("S", 7);
        ssst.displayList();
        ssst.put("T", 8);
        ssst.displayList();
        ssst.put("I", 9);
        ssst.displayList();
        ssst.put("O", 10);
        ssst.displayList();
        ssst.put("N", 11);
        ssst.displayList();
        System.out.println();
        System.out.println("Get value assosiated with key E: "
                + ssst.get("E"));
        System.out.println();
        System.out.println("-----------------------------------------------"
                + "-----------------");

        System.out.println();
        System.out.println("Binary Search Symbol Table");
        System.out.println("");
        bsst.put("E", 0);
        bsst.displayTable();
        System.out.println();
        bsst.put("A", 1);
        bsst.displayTable();
        System.out.println();
        bsst.put("S", 2);
        bsst.displayTable();
        System.out.println();
        bsst.put("Y", 3);
        bsst.displayTable();
        System.out.println();
        bsst.put("Q", 4);
        bsst.displayTable();
        System.out.println();
        bsst.put("U", 5);
        bsst.displayTable();
        System.out.println();
        bsst.put("E", 6);
        bsst.displayTable();
        System.out.println();
        bsst.put("S", 7);
        bsst.displayTable();
        System.out.println();
        bsst.put("T", 8);
        bsst.displayTable();
        System.out.println();
        bsst.put("I", 9);
        bsst.displayTable();
        System.out.println();
        bsst.put("O", 10);
        bsst.displayTable();
        System.out.println();
        bsst.put("N", 11);
        bsst.displayTable();
        System.out.println();
        System.out.println("Get value assosiated with key E: "
                + bsst.get("E"));
        System.out.println();

        System.out.println("Get value assosiated with key S: "
                + bsst.get("S"));
        System.out.println();
    }

}

/*
OUTPUT

run:
Sequential Search Symbol Table

E 0
A 1 | E 0
S 2 | A 1 | E 0
Y 3 | S 2 | A 1 | E 0
Q 4 | Y 3 | S 2 | A 1 | E 0
U 5 | Q 4 | Y 3 | S 2 | A 1 | E 0
U 5 | Q 4 | Y 3 | S 2 | A 1 | E 6
U 5 | Q 4 | Y 3 | S 7 | A 1 | E 6
T 8 | U 5 | Q 4 | Y 3 | S 7 | A 1 | E 6
I 9 | T 8 | U 5 | Q 4 | Y 3 | S 7 | A 1 | E 6
O 10 | I 9 | T 8 | U 5 | Q 4 | Y 3 | S 7 | A 1 | E 6
N 11 | O 10 | I 9 | T 8 | U 5 | Q 4 | Y 3 | S 7 | A 1 | E 6

Get value assosiated with key E: 6

----------------------------------------------------------------

Binary Search Symbol Table

keys[E]  
Vals[0]  

keys[A, E]  
Vals[1, 0]  

keys[A, E, S]  
Vals[1, 0, 2]  

keys[A, E, S, Y]  
Vals[1, 0, 2, 3]  

keys[A, E, Q, S, Y]  
Vals[1, 0, 4, 2, 3]  

keys[A, E, Q, S, U, Y]  
Vals[1, 0, 4, 2, 5, 3]  

keys[A, E, Q, S, U, Y]  
Vals[1, 6, 4, 2, 5, 3]  

keys[A, E, Q, S, U, Y]  
Vals[1, 6, 4, 7, 5, 3]  

keys[A, E, Q, S, T, U, Y]  
Vals[1, 6, 4, 7, 8, 5, 3]  

keys[A, E, I, Q, S, T, U, Y]  
Vals[1, 6, 9, 4, 7, 8, 5, 3]  

keys[A, E, I, O, Q, S, T, U, Y]  
Vals[1, 6, 9, 10, 4, 7, 8, 5, 3]  

keys[A, E, I, N, O, Q, S, T, U, Y]  
Vals[1, 6, 9, 11, 10, 4, 7, 8, 5, 3]  

Get value assosiated with key E: 6

Get value assosiated with key S: 7

BUILD SUCCESSFUL (total time: 0 seconds)


*/
