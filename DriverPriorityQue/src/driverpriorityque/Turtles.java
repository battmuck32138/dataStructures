/*
Mathew Buck
Java II Lab A
 */
package driverpriorityque;

//class is for testing generic PriorityQue only
public class Turtles implements Comparable<Turtles>{
        String name;
        
        //constructor
        Turtles(String name){
            this.name = name;
        }
        
        //compares based on alphabetical order
        public int compareTo(Turtles otherTurt){
            if (name.compareTo(otherTurt.name) == 0){
                return 0;
            }
            if (name.compareTo(otherTurt.name) < 0){
                return -1;
            }
            else
                return 1;
        }
        
        public String toString(){
            return name;
        }
    }