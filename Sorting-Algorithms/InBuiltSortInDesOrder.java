import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class InBuiltSortInDesOrder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for(int i=0; i<n; i++){
            int k = sc.nextInt();
            arr.add(k);
        } 

        Collections.sort(arr, Collections.reverseOrder());
        
        for(Integer p: arr)
            System.out.print(p + " ");
        
        System.out.println();

        Iterator itr = arr.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
