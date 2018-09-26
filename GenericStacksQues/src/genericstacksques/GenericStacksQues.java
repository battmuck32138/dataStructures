/*
Mathew Buck
CIS 27 Lab 1
Test Code for Lab 1
DeQue, Infix to Postfix Evaluator, Union Search
 */
package genericstacksques;
import java.util.Scanner;

//test class
public class GenericStacksQues {

    //driver////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner (System.in);
        String input;
        System.out.print("Enter data: ");
        input = keyboard.nextLine();
        String infix1 = "( ( 7 / 3 ) + ( ( 2 * 4 ) - 5 ) )";
        String infix2 = "((1+2)*(3-4))";
        String infix3 = "((1+(2-3)+4))";
        String infix4 = "(1+  ((2+3)*(4*5)))";
        String infix5 = "(15+(24*3000))";
        String infix6 = "((1+2)*3)";
        String infix7 = "(11+(22*   33))";
    
       //DeQue test code
       System.out.println();
       System.out.println("DEQUE OUTUT");
       DeQue testQue = new DeQue();
       System.out.println(testQue.isEmpty());
       testQue.addLast(5);
       testQue.addFirst(3.0);
       testQue.addFirst(2);
       testQue.addFirst(input);
       testQue.addLast("last");
       testQue.displayQue();
       testQue.insertBefore(4, 4);
       testQue.insertAfter(1, "2nd node");
       testQue.displayQue();
       testQue.addLast("Move me to the front, then delete me!");
       testQue.removeNode(2);
       testQue.removeFirst();
       testQue.displayQue();
       testQue.moveFront(6);
       testQue.insertAfter(3, "Delete me from the middle.");
       testQue.removeLast();
       testQue.displayQue();
       testQue.removeNode(4);
       testQue.removeNode(1);
       testQue.insertAfter(2, "Move me to the back!");
       testQue.displayQue();
       testQue.moveEnd(3);
       testQue.insertBefore(1, '1');
       testQue.displayQue();
       System.out.println();
       
       //Stacks-Evaluating Expressions test code
       System.out.println("STACKS EVALUATING EXPRESSIONS OUTPUT");
       ArithmeticExpressionEvaluator aExE = 
               new ArithmeticExpressionEvaluator();
       aExE.evaluateInfix(infix1);
       aExE.evaluateInfix(infix2);
       aExE.evaluateInfix(infix3);
       aExE.evaluateInfix(infix4);
       aExE.evaluateInfix(infix5);
       aExE.evaluateInfix(infix6);
       aExE.evaluateInfix(infix7);
       
       //Quck-Find
       System.out.println("QUICK-FIND OUTPUT");
       UnionFindQuickFind qf = new UnionFindQuickFind(17);
       qf.union(1,2);
       qf.union(3,4);
       qf.union(1,7);
       qf.union(3,6);
       qf.union(8,9);
       qf.union(1,8);
       qf.union(3,10);
       qf.union(3,11);
       qf.union(3,12);
       qf.union(3,13);
       qf.union(14,15);
       qf.union(16,0);
       qf.union(14,16);
       qf.union(1,3);
       qf.union(1,14);
       System.out.println(qf.toString());
       
       //Quck-Union
       System.out.println("QUICK-UNION OUTPUT");
       UnionFindQuickUnion qu = new UnionFindQuickUnion(17);
       qu.union(1,2);
       qu.union(3,4);
       qu.union(1,7);
       qu.union(3,6);
       qu.union(8,9);
       qu.union(1,8);
       qu.union(3,10);
       qu.union(3,11);
       qu.union(3,12);
       qu.union(3,13);
       qu.union(14,15);
       qu.union(16,0);
       qu.union(14,16);
       qu.union(1,3);
       qu.union(1,14);
       System.out.println(qu.toString());
       
       //Weighted Quck-Union
       System.out.println("WEIGHTED QUICK-UNION OUTPUT");
       UnionFindWeightedQuickUnion wq = new UnionFindWeightedQuickUnion(17);
       wq.union(1,2);
       wq.union(3,4);
       wq.union(1,7);
       wq.union(3,6);
       wq.union(8,9);
       wq.union(1,8);
       wq.union(3,10);
       wq.union(3,11);
       wq.union(3,12);
       wq.union(3,13);
       wq.union(14,15);
       wq.union(16,0);
       wq.union(14,16);
       wq.union(1,3);
       wq.union(1,14);
       System.out.println();
       System.out.println(wq.toString());
       //maze test code
       UnionFindMaze mz = new UnionFindMaze(7,5);
       System.out.print("Original Grid before the unions.");
       mz.displayMaze();
       System.out.println();
       System.out.print("Unions for the maze: ");
       mz.solveMaze();
       System.out.println();
       System.out.println();
       System.out.print("Contents of the maze after unions"
               + " (see attched for path through the maze).");
       mz.displayMaze();
       System.out.println();
       
       UnionFindMaze mz1 = new UnionFindMaze(10,10);
       System.out.print("Original Grid before the unions.");
       mz1.displayMaze();
       System.out.println();
       System.out.print("Unions for the maze: ");
       mz1.solveMaze();
       System.out.println();
       System.out.println();
       System.out.print("Contents of the maze after unions"
               + " (see attched for path through the maze).");
       mz1.displayMaze();
       System.out.println();
       
    //end main  
    }
 //end GenericStacksQues
}

//////////OUTPUT/////// All code for lab 1 tested here//////////////////////
/*

run:
Enter data: Matt's Data

DEQUE OUTUT
true
Size 5: Matt's Data, 2, 3.0, 5, last
Size 7: Matt's Data, 2nd node, 2, 3.0, 4, 5, last
Size 6: 2, 3.0, 4, 5, last, Move me to the front, then delete me!
Size 6: Move me to the front, then delete me!, 2, 3.0, 
Delete me from the middle., 4, 5
Size 5: 2, 3.0, Move me to the back!, 4, 5
Size 6: 1, 2, 3.0, 4, 5, Move me to the back!

STACKS EVALUATING EXPRESSIONS OUTPUT
Infix:   ( ( 7 / 3 ) + ( ( 2 * 4 ) - 5 ) )
Postfix: 7 3 / 2 4 * 5 - + 
Result:  5.333333333333334

Infix:   ((1+2)*(3-4))
Postfix: 1 2 + 3 4 - * 
Result:  -3.0

Infix:   ((1+(2-3)+4))
Postfix: 1 2 3 - 4 + + 
Result:  4.0

Infix:   (1+  ((2+3)*(4*5)))
Postfix: 1 2 3 + 4 5 * * + 
Result:  101.0

Infix:   (15+(24*3000))
Postfix: 15 24 3000 * + 
Result:  72015.0

Infix:   ((1+2)*3)
Postfix: 1 2 + 3 * 
Result:  9.0

Infix:   (11+(22*   33))
Postfix: 11 22 33 * + 
Result:  737.0

QUICK-FIND OUTPUT
id[]: [0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

QUICK-UNION OUTPUT
id[]: [0, 2, 7, 4, 6, 5, 10, 9, 9, 13, 11, 12, 13, 0, 15, 0, 0]

WEIGHTED QUICK-UNION OUTPUT
1 U 2, 3 U 4, 1 U 7, 3 U 6, 8 U 9, 1 U 8, 3 U 10, 3 U 11, 3 U 12, 3 U 13, 
14 U 15, 16 U 0, 14 U 16, 1 U 3, 1 U 14, 
id[]: [16, 3, 1, 3, 3, 5, 3, 1, 1, 8, 3, 3, 3, 3, 3, 14, 14]

Original Grid before the unions.
Maze:  x = 7   y = 5
00 01 02 03 04 05 06 
07 08 09 10 11 12 13 
14 15 16 17 18 19 20 
21 22 23 24 25 26 27 
28 29 30 31 32 33 34 

Unions for the maze: 21 U 28, 30 U 31, 19 U 26, 15 U 22, 22 U 29, 26 U 27,
7 U 14, 33 U 34, 3 U 10, 6 U 13, 26 U 33, 3 U 4, 32 U 33, 24 U 25, 1 U 2,
10 U 11, 2 U 9, 11 U 12, 10 U 17, 18 U 19, 25 U 26, 20 U 27, 24 U 31,1 U 8,
15 U 16, 23 U 30, 5 U 6, 12 U 19, 22 U 23, 14 U 21, 2 U 3, 28 U 29,
5 U 12, 0 U 1, 

Contents of the maze after unions (see attched for path through the maze).
Maze:  x = 7   y = 5
19 19 01 19 03 06 19 
19 01 01 03 03 03 06 
07 19 15 03 19 19 19 
07 15 19 19 24 19 19 
21 15 19 30 19 19 33 

Original Grid before the unions.
Maze:  x = 10   y = 10
00 01 02 03 04 05 06 07 08 09 
10 11 12 13 14 15 16 17 18 19 
20 21 22 23 24 25 26 27 28 29 
30 31 32 33 34 35 36 37 38 39 
40 41 42 43 44 45 46 47 48 49 
50 51 52 53 54 55 56 57 58 59 
60 61 62 63 64 65 66 67 68 69 
70 71 72 73 74 75 76 77 78 79 
80 81 82 83 84 85 86 87 88 89 
90 91 92 93 94 95 96 97 98 99 

Unions for the maze: 71 U 81, 13 U 14, 48 U 58, 0 U 1, 39 U 49, 53 U 63,
0 U 10, 95 U 96, 52 U 62, 10 U 20, 26 U 36, 60 U 70, 34 U 35, 19 U 29,
76 U 77, 56 U 57, 94 U 95, 84 U 94, 88 U 98, 29 U 39, 48 U 49, 76 U 86,
11 U 12, 44 U 54, 5 U 6, 3 U 4, 31 U 41, 53 U 54, 49 U 59, 2 U 3, 16 U 26,
1 U 11, 11 U 21, 73 U 83, 62 U 72, 5 U 15, 2 U 12, 26 U 27, 91 U 92, 27 U 28,
22 U 23, 89 U 99, 82 U 92, 40 U 50, 88 U 89, 15 U 25, 77 U 78, 44 U 45,
70 U 71, 40 U 41, 45 U 55, 61 U 62, 30 U 40, 92 U 93, 57 U 58, 31 U 32,
83 U 84, 80 U 90, 68 U 78, 55 U 56, 22 U 32, 84 U 85, 90 U 91, 87 U 88,
28 U 38, 35 U 36, 66 U 76, 6 U 7, 38 U 48, 93 U 94, 87 U 97, 14 U 15,
60 U 61, 73 U 74, 21 U 31, 81 U 82, 55 U 65, 50 U 60, 63 U 64, 41 U 51, 
32 U 42, 65 U 75, 42 U 43, 63 U 73, 7 U 8, 47 U 48, 59 U 69, 23 U 33,
17 U 18, 77 U 87, 46 U 56, 18 U 28, 8 U 18, 75 U 76, 69 U 79, 57 U 67,
37 U 38, 14 U 24, 9 U 19, 

Contents of the maze after unions (see attched for path through the maze).
Maze:  x = 10   y = 10
95 00 03 00 03 95 05 05 05 95 
00 00 11 05 13 05 26 95 17 95 
00 00 40 22 95 05 19 26 26 19 
40 40 40 95 26 34 26 95 26 19 
00 31 95 95 53 53 95 95 19 39 
40 95 60 19 44 53 19 56 48 19 
95 52 52 53 19 19 76 95 76 95 
60 60 52 95 95 19 95 76 76 95 
91 71 91 73 95 95 76 88 76 88 
80 95 91 91 95 95 95 88 88 89 

BUILD SUCCESSFUL (total time: 24 seconds)

*/