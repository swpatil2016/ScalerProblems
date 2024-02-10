package DSA.A_PrefixAndSubArray;

import java.util.Arrays;
import java.util.Scanner;

/*Example Input
        Input 1:-
        A = 5
        B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]

        Output 1:-
        10 55 45 25 25
*/
public class ContinuesSumQuery {
    public static int[] bruteForceSolution(int[][] arr, int A){
        int[] AmountArray = new int[5];
        for(int i = 0; i < 3; i++) {
            int start = arr[i][0] - 1;
            int end = arr[i][1] - 1;
            int amount = arr[i][2];
            for (int j = start; j <= end; j++) {
                AmountArray[j] += amount;
            }
        }
        return AmountArray;
    }
    public static int[] customizeSolution(int[][] arr, int A){
        int[] AmountArray = new int[5];
        for(int i = 0; i < arr.length; i++){
            AmountArray[arr[i][0]] += arr[i][2];
            if(arr[i][1] < A){
                AmountArray[arr[i][1]] -= arr[i][2];
             }
        }
        for(int i = 0; i < 5; i++){

        }
        return AmountArray;
    }
    public static void main(String[] args) {
        int A = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of Array");
        int[][] arr = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(bruteForceSolution(arr, A)) + " ");
    }
}
