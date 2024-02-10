package DSA.A_PrefixAndSubArray;

import java.util.Scanner;

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arr");
        int A = sc.nextInt();
        int[] arr = new int[A];
        System.out.println("Enter the elements of arr");
        for(int i = 0; i < A; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < A; i++){
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
