package DSA.C_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
You are given an array A of N elements. You have to make all elements unique.
To do so, in one step you can increase any number by one.
Find the minimum number of steps
* */
public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4,2,5));
        arr.sort((a, b) -> {
            return b - a;
        });
        System.out.println(arr);
        HashSet<Integer> set = new HashSet<>();
        int jumpToBecomeUniqueNumber = 0;
        for(Integer a: arr){
                while (set.contains(a)) {
                    jumpToBecomeUniqueNumber += 1;
                    a++;
                }
            set.add(a);
        }
        System.out.println(jumpToBecomeUniqueNumber);
        }
    }
