package AlgoTutor.PrefixSum.Q6;

/**
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 *
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 * Where:
 *
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * Return the array answer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,4,8,3]
 * Output: [15,1,11,22]
 * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
 * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 * Example 2:
 *
 * Input: nums = [1]
 * Output: [0]
 * Explanation: The array leftSum is [0] and the array rightSum is [0].
 * The array answer is [|0 - 0|] = [0].
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 105
 */
public class Q2574LeftAndRightSumDifferences {
    public int[] getDiff(int[] nums){
        int[] lSum = new int[nums.length];
        int[] rSum = new int[nums.length];
        int[] diff = new int[nums.length];
        lSum[0] = 0;
        rSum[nums.length-1] = 0;
        for(int i = 0; i< nums.length-1; i++){
            lSum[i+1] = lSum[i]+nums[i];
        }
        for(int j= nums.length-1; j>0;j--){
            rSum[j-1]=rSum[j]+nums[j];
        }
        for(int k = 0; k< nums.length; k++){
            if(lSum[k] > rSum[k] ){
                diff[k] = lSum[k] - rSum[k];
            } else {
                diff[k] = rSum[k] - lSum[k];
            }
        }
        return diff;
    }

    public static void main(String[] args){
        Q2574LeftAndRightSumDifferences q = new Q2574LeftAndRightSumDifferences();
//        int[] nums = {10,4,8,3};
        int[] nums = {0};
        q.getDiff(nums);

    }
}
