package DSA.B_Hashing;

import java.util.HashSet;
/*

        Given an unsorted integer array A of size N.
        Find the length of the longest set of consecutive elements from array A.

        Input A = [100, 4, 200, 1, 3, 2] , Output = 4
*/

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {100, 4, 200, 1, 3, 2};
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        int maxLength = 0;
        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i] - 1)){
                int number = arr[i];
                int count = 0;
                while(set.contains(number)){
                    count += 1;
                    number++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        System.out.println(maxLength);
    }
}
