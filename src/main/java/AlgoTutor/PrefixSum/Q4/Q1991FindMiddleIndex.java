package AlgoTutor.PrefixSum.Q4;

/**
 * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 *
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 *
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 *
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,-1,8,4]
 * Output: 3
 * Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
 * The sum of the numbers after index 3 is: 4 = 4
 * Example 2:
 *
 * Input: nums = [1,-1,4]
 * Output: 2
 * Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
 * The sum of the numbers after index 2 is: 0
 * Example 3:
 *
 * Input: nums = [2,5]
 * Output: -1
 * Explanation: There is no valid middleIndex.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * -1000 <= nums[i] <= 1000
 *
 *
 * Note: This question is the same as 724: https://leetcode.com/problems/find-pivot-index/
 */


/**
 * Arr = 2  3 -1 8 4
 * LAr = 0  2  5 4 12
 * RAr = 14 11 12 4 0
 *
 * 0,1,2....i-2,i-1,(Left)    i,(middle)   (Right)i+1,i+2....n-1
 * Psum[i-1]-Psum[0-1] = Psum[n-1]- Psum[i+1-1]
 * Psum[i-1] = Psum[n-1]-Psum[i]
 *
 *
 *    Arr = 1 -1 4
 *  * LAr = 0  1 0
 *  * RAr = 3 4 0
 *
 * */
public class Q1991FindMiddleIndex {
    public int getMiddleIndex(int[] nums){
        int[] lSum = new int[nums.length];
        int[] rSum = new int[nums.length];
        lSum[0] = 0;
        rSum[nums.length-1] = 0;
        for(int i = 0; i < nums.length - 1; i++){
                lSum[i+1] = lSum[i] + nums[i];
        }
        for(int j = nums.length - 1; j > 0; j--){
            rSum[j-1] = rSum[j] + nums[j];
        }
        for(int k = 0; k < nums.length; k++){
            if(lSum[k] == rSum[k]){
                return k;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Q1991FindMiddleIndex q = new Q1991FindMiddleIndex();
//        int[] nums = {2,3,-1,8,4};
//        int[] nums = {1,-1,4};
        int[] nums = {2, 5};
        q.getMiddleIndex(nums);
    }
}
