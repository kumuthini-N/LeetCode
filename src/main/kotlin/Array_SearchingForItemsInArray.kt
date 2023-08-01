/**
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 */
class SearchElementsInArray {
    fun SearchElements(nums: IntArray): Boolean {
        for (i in 0..nums.size - 1 step 1) {
            for (j in 0..nums.size - 1 step 1) {
                    if (i != j && nums[i] === 2 * nums[j]) {
                    return true
                }
            }
        }
        return false
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(7,1,14,11); // Input array
    var obj = SearchElementsInArray()
    obj.SearchElements(nums);
}
