/**
 * Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true

 */

class ArrayValidMountainArray {
    fun validMountainArray(nums: IntArray): Boolean {
        if(nums.size < 3 || nums[0] > nums[1]) {
            return false
        }
        var increaseCount = 0
        var decreaseCount = 0

        for( i in 1..nums.size -1 step 1) {
             if(nums[i-1] < nums[i]){
                increaseCount++
            } else if(nums[i-1] === nums[i]){
                return false
            }
        }
        for (j in nums.size-1 downTo increaseCount + 1) {
            if (nums[j] > nums[j-1]) {
                return false
            } else if(nums[j] < nums[j-1]){
                decreaseCount++
            } else if(nums[j] === nums[j-1]){
                return false
            }
        }
        return increaseCount > 0 && decreaseCount > 0
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(0,2,4,2,1); // Input array
    var obj = ArrayValidMountainArray()
    obj.validMountainArray(nums);
}