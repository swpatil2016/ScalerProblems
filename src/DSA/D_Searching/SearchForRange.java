package DSA.D_Searching;

import java.util.Arrays;
/*
 Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a
 given integer B in the array A.

Return an array of size 2, such that
          First element = Left most index of B in A
          Second element = Right most index of B in A.
If B is not found in A, return [-1, -1].

Note : Your algorithm's runtime complexity must be in the order of O(log n).*/


public class SearchForRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int number = 8;
        int[] indexArray = new int[2];
        int start = 0, end = arr.length - 1;
        // loop for leftmost index
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == number){
                if(arr[mid] != arr[mid - 1]){
                    indexArray[0] = mid;
                    break;
                }else{
                    end = mid - 1;
                }
            }else if(arr[mid] < number){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        // loop for rightmost index;
        start = 0;
        end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == number){
                if(arr[mid] != arr[mid + 1]){
                    indexArray[1] = mid;
                    break;
                }else {
                    start = mid + 1;
                }
            }else if(arr[mid] < number){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(Arrays.toString(indexArray));

    }
}
