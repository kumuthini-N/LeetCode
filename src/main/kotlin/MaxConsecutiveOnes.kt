class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var maxCount = 0
        for( i in 0..nums.size -1 step 1) {
            if(nums[i] == 1) {
                count += 1
                if(maxCount < count || maxCount == 0) {
                    maxCount = count
                }
            } else {
                count = 0
            }
        }
        return maxCount
    }
}

fun main(args: Array<String>) {
    var obj = MaxConsecutiveOnes()
    obj.findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1,1));
}