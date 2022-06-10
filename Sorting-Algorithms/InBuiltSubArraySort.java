import java.util.Scanner;
import java.util.Arrays;

public class InBuiltSubArraySort {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr, 1, 4);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
