
package insertionsortexample;
import java.util.*;
public class Tester {

    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList<String> list;
        list = new MyArrayList<String>();

        list.add("dog");
        list.add("Truck");
        list.add("Bear");
        list.add("Cat");
        list.add("Moose");

        System.out.println("The elements are: " +list.toString());

        Collections.shuffle(list);
        
        list.bubbleSort();

        System.out.println("The elements after Bubble sort are: " + list.toString());
        System.out.println("The number of Swaps are: " + list.numofSwapB);
        System.out.println("The number of Compares are: " + list.numofCompareB);

       
        Collections.shuffle(list);

        System.out.println("The elements after shuffle are: " + list.toString());

        list.insertionSort();

        System.out.println("The elements after Insertion sort are: " + list.toString());
        System.out.println("The number of Swaps are: " + list.numofSwapI);
        System.out.println("The number of Compares are: " + list.numofCompareI);
    }


}

