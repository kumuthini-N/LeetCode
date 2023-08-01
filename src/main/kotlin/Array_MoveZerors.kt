/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

 */

class Array_MoveZerors {
    fun moveZeros(nums: IntArray): IntArray {

        if (nums.size == 1) {
            if (nums[0] == 0) {
                return nums
            }
        }
        var count = 0
        for (i in 0..nums.size - 1 step 1) {
            if (nums[i] !== 0) {
                nums[count] = nums[i]
                count++
            }
        }

        while (count < nums.size) {
            nums[count] = 0
            count++
        }
        return nums;
    }
}

    fun main(args: Array<String>) {
        var nums = intArrayOf(0); // Input array
        var obj = Array_MoveZerors()
        obj.moveZeros(nums);
    }