class SquaresOfSortedArray {
    fun findNumbers(nums: IntArray): IntArray {
        var arr = nums
        for (i in nums.indices step 1) {
            var square = nums[i] * nums[i]
            arr[i] = square
        }
        arr.sort()
        return arr
    }
}

fun main(args: Array<String>) {
    var obj = SquaresOfSortedArray()
    obj.findNumbers(intArrayOf(6, -2, 0, 3, 5));
}