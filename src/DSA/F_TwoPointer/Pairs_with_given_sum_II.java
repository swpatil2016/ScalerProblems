package DSA.F_TwoPointer;
/*
* Given a sorted array of integers (not necessarily distinct) A and an integer B,
* find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.

Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).*/
public class Pairs_with_given_sum_II {
    public static void main(String[] args) {
        int [] A = {1,2,2,3,4,5,5,6};
        int B = 7;
        int i = 0, j = A.length - 1, mod = 1000 * 1000 * 1000 + 7;
        long ans = 0;
        while (i < j) {
            if (A[i] + A[j] == B) {
                int ii = i, jj = j;
                if (A[i] == A[j]) {
                    // equal A[i] and A[j]
                    long cnt = j - i + 1;
                    ans += (cnt * (cnt - 1) / 2) % mod;
                    ans %= mod;
                    break;
                } else {
                    // count number of elements with value A[i]
                    while (A[i] == A[ii]) {
                        ii++;
                    }
                    int cnt1 = ii - i;
                    i = ii;
                    // count number of elements with value A[j]
                    while (A[jj] == A[j]) {
                        jj--;
                    }
                    int cnt2 = j - jj;
                    j = jj;
                    ans += ((long) cnt1 * cnt2) % mod;
                    ans %= mod;
                }
            } else if (A[i] + A[j] > B) {
                j--;
            } else i++;
        }
        System.out.println((int)ans);
    }
}
