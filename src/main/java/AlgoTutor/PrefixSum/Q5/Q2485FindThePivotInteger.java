package AlgoTutor.PrefixSum.Q5;

/**
 * Given a positive integer n, find the pivot integer x such that:
 *
 * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
 * Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 8
 * Output: 6
 * Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
 * Example 2:
 *
 * Input: n = 1
 * Output: 1
 * Explanation: 1 is the pivot integer since: 1 = 1.
 * Example 3:
 *
 * Input: n = 4
 * Output: -1
 * Explanation: It can be proved that no such integer exist.
 *
 *
 * Constraints:
 *
 * 1 <= n <= 1000
 */

/**
 * Arr = 1   2    3  4   5  6  7  8
 * LSu = 0   1    3  6   10 15 21 28
 * RSu = 40  38  35  31  26 15 8  0
 */
public class Q2485FindThePivotInteger {
    public int getPivot(int n){
        int[] lSum = new int[n];
        int[] rSum = new int[n];
        lSum[0] = 0;
        rSum[n-1] = 0;
        for(int i=1; i<n; i++){
            lSum[i] = lSum[i-1]+i;
        }
        for(int j=n; j>1; j--){
            rSum[j-2] = rSum[j-1]+j;
        }
        for(int k=0; k < n; k++){
            if(lSum[k] == rSum[k]){
                return k+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Q2485FindThePivotInteger q = new Q2485FindThePivotInteger();
        q.getPivot(4);
    }
}
