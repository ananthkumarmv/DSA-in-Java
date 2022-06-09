// 0(log(n))

public class PeakElement1 {
    
    static int findPeak(int arr[], int n){
        int l = 0;
        int r = n-1;

        int mid=0;

        while(l <= r){
            // finding mid by binary right shifting
            mid = (l + r) >> 1;

            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
                break;

            if(mid >0 && arr[mid-1] > arr[mid])
                r = mid-1;

            else 
                l = mid+1;

        }

        return mid;
    }


    public static void main(String  args[]){
        int arr[] = { 1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of peak point is " + findPeak(arr, n));
    }
}
