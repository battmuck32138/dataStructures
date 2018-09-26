/*
Mathew Buck
Java II Lab A
 */
package driverpriorityque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Generic priority que sorts elements from least to greatest 
//as they are added.
//The element with the highest value is removed first.
public class PriorityQue<T extends Comparable<T>> {

    public ArrayList<T> pqList = new ArrayList<>(10);
    public int numElem = 0;

    //returns and then deletes the element with the highest priority
    public T remove() {
        if (!pqList.isEmpty()) {
            numElem--;
            return pqList.remove(pqList.size() - 1);
        }
        else {
            return null;
        }
    }

    //sorts elements from least to greates as they are added
    public void add(T obj) {
        pqList.add(obj);
        Collections.sort(pqList);
        numElem++;
    }

    public int getSize() {
        return pqList.size();
    }

    public T getElem(int i) {
        return pqList.get(i);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pqList.size(); i++) {
            sb.append(pqList.get(i));
            if (i != pqList.size() - 1) {
                sb.append(", ");
            }
            if ((i + 1) % 13 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    //creates an iterator that I can get to from main
    public PQiterator iterator(){
        return new PQiterator();
    }

    //helper class for Priority Que//////////////////////////////////////////
    public class PQiterator implements Iterator {
        int i = 0;
        T obj = null;

        public boolean hasNext() {
            if (i != pqList.size()){
                return true;
            }
            //reset index for next time
            else{
                i = 0;
                return false;
            }
        }

        public T next() {
          if(hasNext()){
              obj = pqList.get(i);
              i++;
          }
            return obj;
        }
     
     //end helper class   
    }
    
 //end class
}
