package DSA.G_String;

import java.util.HashSet;
/*
* Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length of the longest
* substring that contains no repeating characters. The greater the length of this unique-character substring,
* the higher the "GOOD"ness of the string.

Your task is to return an integer representing the "GOOD"ness of string A.

Note: The solution should be achieved in O(N) time complexity, where N is the length of the string.

*/
public class Longest_Substring_Without_Repeat {
    public static void main(String[] args) {
        String A = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        int p1 = 0;
        int p2 = 0;
        // NOTE:: We are moving p2 or p1 singley;
        while (p2 < A.length()) {
            char ch = A.charAt(p2);
            if (!set.contains(ch)) {
                set.add(ch);
                p2++;
                length = Math.max(length, set.size());
            } else {
                // Cycle will go on here untill the repeated char remove;
                char c = A.charAt(p1);
                set.remove(c);
                p1++;
            }
        }
        System.out.println(length);
    }
}

