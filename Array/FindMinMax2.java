// O(n)
// O(log(n))

public class FindMinMax2 {
    
    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){

        Pair minmax = new Pair();

        int i;

    /* If array has even number of elements then 
    initializing the first two elements as minimum and maximum */
        if(n%2 == 0){
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;
        }
        /* If array has odd number of elements then 
        initializing the first element as minimum and maximum */
        else{
            minmax.max = arr[0];
            minmax.min = arr[0];
            i = 1;
        }

        while(i < n-1){
            if(arr[i] > arr[i+1]){
                if(arr[i] > minmax.max)
                    minmax.max = arr[i];
            
                if(arr[i+1] < minmax.min)
                    minmax.min = arr[i+1];
            }

            else{
                if(arr[i+1] > minmax.max)
                    minmax.max = arr[i+1];
            
                if(arr[i] < minmax.min)
                    minmax.min = arr[i];
            }
            i += 2;
                
        }

        return minmax;
    }


    public static void main(String args[]){
        int arr[] = {1,20,5,8,45};
        Pair minmax = getMinMax(arr, arr.length);

        System.out.println("Max: " + minmax.max);
        System.out.println("Min: " + minmax.min);
    }
}
