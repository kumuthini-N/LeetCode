class RemoveElementSorted() {
    fun removeElementSorted(nums: IntArray): Int {
        var count = 1
        for( i in 1..nums.size -1 step 1) {
            if(nums[i-1] === nums[i]){
                nums[i-1] = nums[i]
                count++
            }
        }
        return count
    }
}

fun main(args: Array<String>) {
    var nums = intArrayOf(1,1,2); // Input array
    var obj = RemoveElementSorted()
    obj.removeElementSorted(nums);
}
