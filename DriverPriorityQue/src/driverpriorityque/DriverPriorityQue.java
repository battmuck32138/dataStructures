/*
Mathew Buck
Java II Lab A
 */
package driverpriorityque;

public class DriverPriorityQue {
    
    public static void main(String[] args) {
        
    Integer i1 = 1;
    Integer i2 = 2;
    Integer i3 = 3;
    Integer i4 = 4;
    Integer i5 = 5;
    Integer i6 = 6;
    Integer i17 = 17;
    Turtles t1 = new Turtles("Anthony");
    Turtles t2 = new Turtles("Bob");
    Turtles t3 = new Turtles("Speedy");
    Turtles t4 = new Turtles("Xerxes");
    PriorityQue<Turtles> pqt = new PriorityQue<>();
    PriorityQue<Integer> pqi = new PriorityQue<>();
    PriorityQue<Integer>.PQiterator itrI = pqi.iterator();
    PriorityQue<Turtles>.PQiterator itrT = pqt.iterator();
    
    //Turtles test code
    System.out.println("Que of Turtles: ");
    System.out.println("Size: " + pqt.getSize());
    System.out.println("Display using toString(): " + pqt);
    System.out.println("Add Turtles in random order and see what "
            + "compareTo() does.");
    pqt.add(t4);
    System.out.println("Size: " + pqt.getSize());
    pqt.add(t2);
    System.out.println("Size: " + pqt.getSize());
    pqt.add(t1);
    System.out.println("Size: " + pqt.getSize());
    pqt.add(t3);
    System.out.println("Size: " + pqt.getSize());
    System.out.println("Display using toString(): " + pqt);
    System.out.println("Display using iterator.");
    while (itrT.hasNext()){
        Object element = itrT.next();
        System.out.print(element + ", ");
    }
    System.out.println();
    System.out.println("Size: " + pqt.getSize());
    System.out.println("Remove(): " + pqt.remove());
    System.out.println("Remove(): " + pqt.remove());
    System.out.println("Remove(): " + pqt.remove());
    System.out.println("NumElem: " + pqt.numElem + " ");
    System.out.println(pqt);
    while (itrT.hasNext()){
        Object element = itrT.next();
        System.out.print(element + ", ");
    }
    System.out.println();
    
    //Integer test code
    pqi.add(i5);
    pqi.add(i3);
    pqi.add(i17);
    pqi.add(i2);
    pqi.add(i1);
    pqi.add(i6);
    System.out.println("Que of Integers: ");
    System.out.println(pqi);
    System.out.println("Size: " + pqi.getSize() + " ");
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("Add Integer 4. ");
    pqi.add(i4);
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("toString: " + pqi);
    System.out.println("NumElem: " + pqi.numElem + " ");
    System.out.println("Display using iterator.");
    while (itrI.hasNext()){
        Object element = itrI.next();
        System.out.print(element + ", ");
    }
    System.out.println();
    System.out.println("Multiply elements by 2.");
     while (itrI.hasNext()){
        Object element = itrI.next();
        element = (int)element * 2;
        System.out.print(element + ", ");
    }
    System.out.println();
    System.out.println("Size: " + pqi.getSize());
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("Remove(): " + pqi.remove());
    System.out.println("Size: " + pqi.getSize());
    System.out.println("Display using toString(): " + pqi);
    System.out.println("Display using iterator.");
    while (itrI.hasNext()){
        Object element = itrI.next();
        System.out.print(element);
    }
    System.out.println();
    
    //end main
    }
    
//end class  
}

/*
OUTPUT

Que of Turtles: 
Size: 0
Display using toString(): 
Add Turtles in random order and see what compareTo() does.
Size: 1
Size: 2
Size: 3
Size: 4
Display using toString(): Anthony, Bob, Speedy, Xerxes
Display using iterator.
Anthony, Bob, Speedy, Xerxes, 
Size: 4
Remove(): Xerxes
Remove(): Speedy
Remove(): Bob
NumElem: 1 
Anthony
Anthony, 
Que of Integers: 
1, 2, 3, 5, 6, 17
Size: 6 
Remove(): 17
Add Integer 4. 
Remove(): 6
Remove(): 5
toString: 1, 2, 3, 4
NumElem: 4 
Display using iterator.
1, 2, 3, 4, 
Multiply elements by 2.
2, 4, 6, 8, 
Size: 4
Remove(): 4
Remove(): 3
Remove(): 2
Remove(): 1
Size: 0
Display using toString(): 
Display using iterator.

BUILD SUCCESSFUL (total time: 0 seconds)

*/