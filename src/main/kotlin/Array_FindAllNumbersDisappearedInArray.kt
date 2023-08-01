import java.util.*
import kotlin.collections.HashMap


/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
Hide Hint #1
This is a really easy problem if you decide to use additional memory. For those trying to write an initial solution using additional memory, think counters!
Hide Hint #2
However, the trick really is to not use any additional space than what is already available to use. Sometimes, multiple passes over the input array help find the solution. However, there's an interesting piece of information in this problem that makes it easy to re-use the input array itself for the solution.
Hide Hint #3
The problem specifies that the numbers in the array will be in the range [1, n] where n is the number of elements in the array. Can we use this information and modify the array in-place somehow to find what we need?
 */

class Array_FindAllNumbersDisappearedInArray {
    fun findAllNumbersDisappearedInArray(nums: IntArray): List<Int> {
        var sortedArray = nums.sortedArray()
        var diffList = ArrayList<Int>()
        var hashMap : HashMap<Int, Int>
                = HashMap<Int, Int> ()
        for (i in 1..sortedArray.size step 1) {
            hashMap.put(sortedArray[i-1],i);
        }
        for (i in 1..sortedArray.size step 1) {
            if(!hashMap.containsKey(i)){
                diffList.add(i)
            }
        }
        return diffList
    }

}

fun main(args: Array<String>) {
//    var nums = intArrayOf(1, 1); // Input array

    var nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1); // Input array
//    var nums = intArrayOf(10,2,5,10,9,1,1,4,3,7); // Input array
//Output:
//[6,7,8,9]
//Expected:
//[6,8]
    //[10,2,5,10,9,1,1,4,3,7]
    var obj = Array_FindAllNumbersDisappearedInArray()
    obj.findAllNumbersDisappearedInArray(nums);
}