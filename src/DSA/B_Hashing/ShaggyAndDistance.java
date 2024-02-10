package DSA.B_Hashing;

import java.util.HashMap;
/*        Shaggy has an array A consisting of N elements. We call a pair of distinct
        indices in that array a special if elements at those indices in the array are equal.

        Shaggy wants you to find a special pair such that the distance between that pair is minimum.
        Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1.

        Input 1:                                Output 1
        A = [7, 1, 3, 4, 1, 7]                    3
*/


public class ShaggyAndDistance {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        int[] arr = {7, 1, 3, 4, 1, 7};
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int distance = i - map.get(arr[i]);
                minDistance = Math.min(minDistance, distance);
            }
            map.put(arr[i], i);
        }
        System.out.println(minDistance != Integer.MAX_VALUE ? minDistance: -1);
    }
}
