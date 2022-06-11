import java.util.ArrayList;

public class multiDimensional {
    public static void main(String[] args) {
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++)
                System.out.print(arr1[i][j] + " ");

            System.out.println();
        }

        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<ArrayList<Integer>>();

    }
}
