import java.util.Scanner;

public class BubbleSort {
    
    static void bSort(int arr[], int n){
        int temp = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        bSort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
