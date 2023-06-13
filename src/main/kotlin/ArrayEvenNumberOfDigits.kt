class ArrayEvenNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices step 1) {
            var numLength = nums[i].toString().count()
            if (numLength % 2 == 0) {
                count++
            }
        }
        return count
    }
}

fun main(args: Array<String>) {
    var obj = ArrayEvenNumberOfDigits()
    obj.findNumbers(intArrayOf(12, 345, 2, 6, 7896));
}