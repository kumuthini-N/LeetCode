package AlgoTutor.PrefixSum.Q2;

/**
 * Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
 *
 * A subarray is a contiguous subsequence of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,4,2,5,3]
 * Output: 58
 * Explanation: The odd-length subarrays of arr and their sums are:
 * [1] = 1
 * [4] = 4
 * [2] = 2
 * [5] = 5
 * [3] = 3
 * [1,4,2] = 7
 * [4,2,5] = 11
 * [2,5,3] = 10
 * [1,4,2,5,3] = 15
 * If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 * Example 2:
 *
 * Input: arr = [1,2]
 * Output: 3
 * Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.
 * Example 3:
 *
 * Input: arr = [10,11,12]
 * Output: 66
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 100
 * 1 <= arr[i] <= 1000
 *
 *
 * Follow up:
 *
 * Could you solve this problem in O(n) time complexity?
 * Soln:
 * A = 1,4,2,5,3
 *
 * 1 =          1
 * 1 4 2 =      7
 * 1 4 2 5 3 = 15
 * 4 =          4
 * 4 2 5 =     11
 * 2 =          2
 * 2 5 3 =     10
 * 5 =          5
 * 3 =          3
 *
 * 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 *              0 1 2  3 4
 * Prefix sum = 1 5 7 12 15
 *
 * (0)      1 P[0] = 1              =1
 * (0,2)    7 P[2]-P[-1] = 7 - 0    =7
 * (0,4)    15 P[4]-P[-1] = 15 - 0  =15
 * (1)      5 P[1] - P[0] = 5 - 1   =4
 * (1,3)    12 P[3]-P[0] = 12 - 1   =11
 * (2)      7 P[2] - P[1] = 7 - 5   =2
 * (2,4)    15 P[4]-P[1] = 10       =10
 * (3)      12 P[3] - P[2] = 12 -7  =5
 * (4)      15 P[4] - P[3] = 15 - 12=3

 * i = 0,1,2,3,4
 * A = 1,4,2,5,3
 * P = 1 5 7 12 15
 * Prefix sum = 1 5 7 12 15
 *
 */
public class Q1588SumOfAllOddLengthSubArray {
    public  static void main(String[] args){
        Q1588SumOfAllOddLengthSubArray arr = new Q1588SumOfAllOddLengthSubArray();
        int[] nums = {1,4,2,5,3};
//        int[] nums = {10,11,12};
//        int[] nums = {1,2};
        arr.ReturningSumOf1DArray(nums);
    }

    public int ReturningSumOf1DArray(int[] nums){
        for(int k = 1; k < nums.length; k++) {
            nums[k] += nums[k - 1];
        }
        int oddSum = 0;

        for(int i = 0; i < nums.length; i++) {
            int j = i;
            while(j < nums.length){
                int pSum = 0;
                if(i > 0) {
                    pSum = nums[j] - nums[i-1];
                } else {
                    pSum = nums[j];
                }
                oddSum += pSum;
                if(j+2 <= nums.length){
                    j = j+2;
                } else {
                    ++j;
                }
            }
        }
        return oddSum;
    }
}
