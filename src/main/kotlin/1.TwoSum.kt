/**
 * Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        for (i in 0..nums.size - 1 step 1) {
            for (j in i + 1..nums.size - 1 step 1) {
                if (target - nums[i] == nums[j]) {
                    println("${i} ${j}")
                    return intArrayOf(i, j);
                }
            }
        }
        return null
    }
}

fun main(args: Array<String>) {
    var sum = TwoSum()
    sum.twoSum(intArrayOf(3, 2, 3), 6)
}