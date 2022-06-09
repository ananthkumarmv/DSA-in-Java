import java.io.*;
import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String args[]){

        int n = 5; //size of the ArrayList

        // Declaring the ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<>(n);

        // Appending new elements at the 
        // end of the list

        for(int i=1; i<=n; i++)
            arrli.add(i);
        
        //Printing eles
        System.out.println(arrli);

        // Remove ele at index 3
        arrli.remove(3);

        // Displaying the ArrayList 
        // after deletion 
        System.out.println(arrli); 

        // Printing elements one by one 
        for (int i = 0; i < arrli.size(); i++) 
            System.out.print(arrli.get(i) + " "); 

    }
}
