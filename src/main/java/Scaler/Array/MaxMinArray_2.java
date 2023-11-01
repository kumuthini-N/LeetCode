package Scaler.Array;

/**
 * Max Min of an Array
 * Problem Description
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * -109 <= A[i] <= 109
 *
 *
 * Input Format
 * First argument A is an integer array.
 *
 *
 * Output Format
 * Return the sum of maximum and minimum element of the array
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [-2, 1, -4, 5, 3]
 * Input 2:
 *
 * A = [1, 3, 4, 1]
 *
 *
 * Example Output
 * Output 1:
 *
 * 1
 * Output 2:
 *
 * 5
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
 * Explanation 2:
 *
 * Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 */
public class MaxMinArray_2 {
    private int maxMinNumber(int[] nums) {
        int minNum = nums[0];
        int maxNum = nums[0];
        for(int i =0; i< nums.length; i++){
            if(nums[i] <= maxNum){
                maxNum = nums[i];
            } else if(nums[i] >= minNum){
                minNum = nums[i];
            }
        }
        return minNum + maxNum;
    }

    public static void main(String[] args) {
        MaxMinArray_2 arr = new MaxMinArray_2();
//        int[] nums = {-2, 1, -4, 5, 3};
        int[] nums = {1, 3, 4, 1};
//        int[] nums = {574};
        arr.maxMinNumber(nums);
    }
}
