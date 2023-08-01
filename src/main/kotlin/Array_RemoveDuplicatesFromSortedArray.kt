/**
 * Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 */
class RemoveDuplicatesFromSortedArray {
    fun removeElementSorted(nums: IntArray): IntArray {
        var count = 1
//        var value = nums[0]
//        nums[0] = nums[0]
        for( i in 1..nums.size -1 step 1) {
            if(nums[i-1] !== nums[i]){
                nums[count] = nums[i]
                count++
            }
        }
        for(i in count  until nums.size step 1){
            nums[count] = '_'.toInt()
        }
        return nums
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(1,1,2); // Input array
    var obj = RemoveDuplicatesFromSortedArray()
    obj.removeElementSorted(nums);
}