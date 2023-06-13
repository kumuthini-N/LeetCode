class DuplicateZeros {
//    var a= intArrayOf(1,0,2,3,0,4,5,0)
    //0,4,1,0,0,8,0,0,3
    //0,0,4,1,0,0,8,0,0
    fun findNumbers(nums: IntArray): IntArray {
        var copy = nums
        var a = copy.clone()
        var arr = nums
        var skip = false
        for(i in a.indices) {
            if(arr[i] == 0 && !skip) {
                var k = i+1
                for(j in k+1 .. a.size-1 step 1){
                    arr[j] = a[j-1]
                }
                if(i < a.size-1) {
                    arr[i+1] = 0
                }
                a = arr;
                skip = true
            } else {
                skip = false
            }
        }
        println(arr)
        return arr
    }
}

fun main(args: Array<String>) {
    var obj = DuplicateZeros()
    obj.findNumbers(intArrayOf(0,4,1,0,0,8,0,0,3));
}

//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]

//Input:
//[0,4,1,0,0,8,0,0,3]
//Output:
//[0,0,4,1,0,0,0,0,0]
//Expected:
//[0,0,4,1,0,0,0,0,8]

