package AlgoTutor.IntoArray.Q3;

import java.util.Arrays;

/**
 * 1979. Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 *
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,6,9,10]
 * Output: 2
 * Explanation:
 * The smallest number in nums is 2.
 * The largest number in nums is 10.
 * The greatest common divisor of 2 and 10 is 2.
 * Example 2:
 *
 * Input: nums = [7,5,6,8,3]
 * Output: 1
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 8.
 * The greatest common divisor of 3 and 8 is 1.
 * Example 3:
 *
 * Input: nums = [3,3]
 * Output: 3
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 3.
 * The greatest common divisor of 3 and 3 is 3.
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 1000
 * 1 <= nums[i] <= 1000
 */
public class GCD {
    public static void main(String[] args) {
        GCD arr = new GCD();
//        int[] nums = {2,5,9,6,10};
        int[] nums = {10,6,9};
//        int[] nums = {7,5,6,8,3};
//        int[] nums = {3,3};
        arr.performOperation(nums);
    }

    private int performOperation(int[] nums) {
        int minNum = nums[0];
        int maxNum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < minNum ) {
                minNum = nums[i];
            } else if( nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
//        Arrays.sort(nums);
//        int minNum = nums[0];
//        int maxNum = nums[nums.length - 1];
        int gcf = 1;
        for( int i = 1; i <= maxNum; i++){
            if(minNum % i == 0 && maxNum % i == 0){
                gcf = i;
            }
        }
        return gcf;

        /**
         *     public int findGCD(int[] nums) {
         *         int minN = nums[0];
         *         int maxN = nums[0];
         *         for (int i = 0; i != nums.length; ++i) {
         *             if (minN > nums[i]) minN = nums[i];
         *             if (maxN < nums[i]) maxN = nums[i];
         *         }
         *         // Euclidean Algorithm
         *         while (minN != maxN) {
         *             if (minN > maxN) {
         *                 minN -= maxN;
         *             } else {
         *                 maxN -= minN;
         *             }
         *         }
         *         return minN;
         *     }
         */
    }
}
