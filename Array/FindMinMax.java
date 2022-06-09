// O(n)
// O(n)

public class FindMinMax {
    
    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){

        Pair minmax = new Pair();
        int i;

        if(n==1){
            minmax.min = minmax.max = arr[0];
            return minmax;
        }

        if(arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for(i=2; i<n; i++){
            if(arr[i]> minmax.max)
                minmax.max = arr[i];
            
            else if(arr[i] < minmax.min)
                minmax.min = arr[i];
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
