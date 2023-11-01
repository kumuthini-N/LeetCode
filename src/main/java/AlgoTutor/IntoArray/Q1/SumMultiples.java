package AlgoTutor.IntoArray.Q1;

/**
 * Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
 *
 * Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7
 * Output: 21
 * Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 * Example 2:
 *
 * Input: n = 10
 * Output: 40
 * Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
 * Example 3:
 *
 * Input: n = 9
 * Output: 30
 * Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.
 *
 *
 * Constraints:
 *
 * 1 <= n <= 103
 */

/**
 * Sum of natural numbers:
 * Solution: n*((n+1)/2) => 1+2+3+4...n => divisible by 3 -> n = num / 3 => 3*((n * (n+1)/2)) => 3* (7*(8/2))
 */
public class SumMultiples {
    public static void main(String[] args) {
        SumMultiples arr = new SumMultiples();
        arr.sumOfMultiples(7);
    }

    private int sumOfMultiples(int n) {
        long sum = multipleOfNums(3, n) + multipleOfNums(5, n) + multipleOfNums(7, n)
                - multipleOfNums(3*5, n) - multipleOfNums(3*7, n) - multipleOfNums(5*7, n)
                + multipleOfNums(3*5*7, n);
        return (int) sum;
    }

    private long multipleOfNums(long k, int n) {
        long m = n / k;
        return k * m * (m + 1) / 2;
    }
}


/**
 * class Solution {
 *     public int sumOfMultiples(int num) {
 *         int sum = 0;
 *         for(int i = 0; i <= num; i++) {
 *             if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
 *                 sum += i;
 *             }
 *         }
 *         return sum;
 *     }
 * }
 */