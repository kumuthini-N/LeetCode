/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]

 */

class Array_SortArrayByParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var count = 0
        var temp = 0
        if (nums.size == 1) {
            if (nums[0] == 0) {
                return nums
            }
        }

        for( i in 0..nums.size - 1 step 1){
            if (nums[i]%2 == 0) {
                temp = nums[count]
                nums[count] = nums[i]
                nums[i] = temp
                count++
            }
        }
        return nums
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(3,1,2,4); // Input array
    var obj = Array_SortArrayByParity()
    obj.sortArrayByParity(nums);
}