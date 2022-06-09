// divide and conquer
// O(log(n))

public class PeakElement2 {
    
    static int findPeakUtil(int arr[], int l, int r, int n){

        int mid = (l + r) >> 1;

        if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
            return mid;

        else if(mid >0 && arr[mid-1] > arr[mid])
            return findPeakUtil(arr, l, mid-1, n);

        else 
            return findPeakUtil(arr, mid+1, r, n);

        }

    static int findPeak(int arr[], int n){
        return findPeakUtil(arr, 0, n-1, n);
    }

    public static void main(String  args[]){
        int arr[] = { 1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of peak point is " + findPeak(arr, n));
    }
}

