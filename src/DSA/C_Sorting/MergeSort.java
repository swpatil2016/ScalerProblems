package DSA.C_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void mergeSortOfSortedLists(int[] unsortedArray, int start, int mid, int end){
        int p1= start, p2 = mid + 1;
        List<Integer> sortedArray = new ArrayList<>();
        while(p1 <= mid && p2 <= end){
            if(unsortedArray[p1] < unsortedArray[p2]){
               sortedArray.add(unsortedArray[p1]);
               p1++;
            }else {
                sortedArray.add(unsortedArray[p2]);
                p2++;
            }
        }
        while (p1 <= mid){
            sortedArray.add(unsortedArray[p1]);
            p1++;
        }
        while (p2 <= end){
            sortedArray.add(unsortedArray[p2]);
            p2++;
        }
        for(int i = start; i <= end; i++){
            // Copy sorted Array in unsorted array
            unsortedArray[i] = sortedArray.get(i-start);
        }
    }
    public static void mergeSort(int[] unsortedArray, int s, int end){
        if(s == end){
            return;
        }
        int mid = (s + end) / 2;
        mergeSort(unsortedArray, s, mid);
        mergeSort(unsortedArray, mid + 1, end);
        mergeSortOfSortedLists(unsortedArray, s, mid, end);
    }
    public static void main(String[] args) {
        int[] unsortedArray = {1, 4, 10, 2, 1, 5};
        mergeSort(unsortedArray, 0, unsortedArray.length - 1);
        System.out.println(Arrays.toString(unsortedArray));
    }
}
