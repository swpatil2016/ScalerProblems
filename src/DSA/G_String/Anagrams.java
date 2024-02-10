package DSA.G_String;

import java.util.*;

/*
Given an array A of N strings, return all groups of strings that are anagrams.

Represent a group by a list of integers representing the index(1-based) in the original list.
Look at the sample case for clarification.

NOTE: Anagram is a word, phrase, or name formed by rearranging the letters, such as 'spar',
formed from 'rasp'.
* */
public class Anagrams {
    public static void main(String[] args) {
        String[] A = {"cat", "dog", "god", "tca"};
        String[] sortedStrings = new String[A.length];
        // sort the each string of A array;
        for(int i = 0; i < A.length; i++){
            char[] arr = A[i].toCharArray();
            Arrays.sort(arr);
            sortedStrings[i] = new String(arr);
        }
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            String str = sortedStrings[i];
            if(map.containsKey(str)){
                List<Integer> list = map.get(str);
                list.add(i+1);
                map.put(str, list);
            }else{
                map.put(str, new ArrayList<>(Collections.singletonList(i + 1)));
            }
        }
        List<List<Integer>> list = new ArrayList<>(map.values());
        System.out.println(list);

    }
}
