/*
Mathew Buck
CIS 27 Lab 1
 */
package genericstacksques;
import java.util.ArrayList;
import java.util.Random;

//program generates a maze using the union find algorithm
//trace out the unions to see the path through the maze
public class UnionFindMaze {

    private int x = 10;
    private int y = 10;
    UnionFindWeightedQuickUnion mz
            = new UnionFindWeightedQuickUnion(x * y);
    
    //default constructor
    UnionFindMaze(int x, int y){
        this.x = x;
        this.y = y;
        UnionFindWeightedQuickUnion mz
            = new UnionFindWeightedQuickUnion(x * y);
    }

    //displays the contents of the maze in grid form
    public void displayMaze() {
        System.out.println();
        System.out.println("Maze:  x = " + x + "   y = " + y);
        int elemCount = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (mz.getId(elemCount) < 10) {
                    System.out.print("0");
                }
                System.out.print(mz.getId(elemCount) + " ");
                elemCount++;
            }
            System.out.println();
        }
    }

    //generates the path through the maze
    public void solveMaze() {
        ArrayList<Integer> ps = getWallsP();
        ArrayList<Integer> qs = getWallsQ();
        int totWalls = ps.size();
        int[] ranArr = new int[totWalls];

        //initalize an aray to normal index 0,1,2,...
        for (int i = 0; i < totWalls; i++) {
            ranArr[i] = i;
        }
        //randomize the contents
        shuffleArray(ranArr);

        //connect elements if they are not connected already
        for (int i = 0; i < totWalls; i++) {
            if (!mz.connected(ps.get(ranArr[i]), qs.get(ranArr[i]))) {
                mz.union(ps.get(ranArr[i]), qs.get(ranArr[i]));
            }
        }
    }

    //collects the p values of the (p, q) pairs 
    //assosiated with removable walls of the maze
    public ArrayList<Integer> getWallsP() {
        int size = x * y;
        int numHzWalls = size - x;
        ArrayList<Integer> pList = new ArrayList<>(size);

        // get p values of vert walls
        //initalize list to regular index 0,1,2,...
        for (int i = 0; i < size; i++) {
            pList.add(i);
        }
        //remove the p values of vertical walls at the end of a rows
        for (int i = 0; i < pList.size(); i++) {
            if ((pList.get(i) + 1) % x == 0) {
                pList.remove(i);
            }
        }
        //add the p values of all the HZ walls that can be removed
        for (int i = 0; i < numHzWalls; i++) {
            pList.add(i);
        }
        return pList;
    }

    //collects the q values of the (p, q) pairs 
    //assosiated with removable walls of the maze
    public ArrayList<Integer> getWallsQ() {
        int size = x * y;
        int numHzWalls = size - x;
        ArrayList<Integer> qList = new ArrayList<>(size);

        // get p values of vert walls
        //initalize list to regular index 0,1,2,...
        for (int i = 0; i < size - 1; i++) {
            qList.add(i + 1);
        }
        //remove the p values of vertical walls that can't be erased (ends)
        for (int i = 0; i < qList.size(); i++) {
            if (qList.get(i) % x == 0) {
                qList.remove(i);
            }
        }
        //add the p values of all the HZ walls that can be removed
        for (int i = 0; i < numHzWalls; i++) {
            qList.add(i + x);
        }
        return qList;
    }

    //randomizes the contents of an array
    private static void shuffleArray(int[] array) {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
    }
//end class
}
