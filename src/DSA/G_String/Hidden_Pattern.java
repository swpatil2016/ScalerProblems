package DSA.G_String;
/*
* Given two strings - a text A and a pattern B, having lower-case alphabetic characters.
* You have to determine the number of occurrences of pattern B in text A as its substring. i.e.
* the number of times B occurs as a substring in A.*/
public class Hidden_Pattern {
    public static void main(String[] args) {
        String A = "aaaa";
        String B = "aa";

        int size = A.length() + B.length() + 1;
        char[] kmp = new char[size];
        for(int i = 0; i < B.length(); i++){
            kmp[i] = B.charAt(i);
        }

        kmp[B.length()] = '@'; //
        int j = B.length() + 1;
        for(int i = 0; i < A.length(); i++){
            kmp[j] = A.charAt(i);
            j++;
        }
        // KMP ALGORITHM :
        int[] lps = new int[size];
        lps[0] = 0;
        for(int i = 1; i < size; i++){
            int x = lps[i-1];
            while(kmp[x] != kmp[i]){
                if(x == 0){
                    x = -1;
                    break;
                }
                x = lps[x-1];
            }
            lps[i] = x + 1;
        }
        int n = B.length();
        int count = 0;
        for(int i = 0; i < size; i++){
            if(n == lps[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
