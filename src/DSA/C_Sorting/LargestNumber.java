package DSA.C_Sorting;

import java.util.ArrayList;
import java.util.List;

/*
Given an array A of non-negative integers, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(30);
        arr.add(34);
        arr.add(5);
        arr.add(9);

        arr.sort((a, b) -> {
            String a1 = a + "" + b;
            String b1 = b + "" + a;
            return b1.compareTo(a1);
        });

        StringBuilder number = new StringBuilder();
        for(Integer a: arr){
            number.append(a);
        }
        System.out.println(number.toString());
    }

}
