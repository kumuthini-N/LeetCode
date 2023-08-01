class RemoveElements() {
    fun removeElement(nums: IntArray, value: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] != value) {
                nums[count++] = nums[i]
            }
        }
        return count
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(3,2,2,3); // Input array
    var value = 3; // Value to remove
    var obj = RemoveElements()
    obj.removeElement(nums, value);
}
