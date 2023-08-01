/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 *
 *
 * Input:
[87366,98734,26121,75644,98748,51614,14537,39842,34419,34376]
Output:
[98748,98748,98748,98748,51614,51614,51614,51614,34376,-1]
Expected:
[98748,98748,98748,98748,51614,39842,39842,34419,34376,-1]
 *
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 */
class Array_ReplaceElementsWithGreatestElementRight {
    // 0        1       2       3       4       5       6       7       8       9
    //[87366,   98734,  26121,  75644,  98748,  51614,  14537,  39842, 34419,  34376]
    //[98748,   98748,  98748,  98748,  51614,  39842,  39842,  34419,  34376,  -1]

    fun replaceElements(arr: IntArray): IntArray {
        var max = arr[arr.size-1]
        for( i in arr.size -1 downTo 0) {
            val temp: Int = arr[i]
            arr[i] = max

            if(max<temp) {
                max = temp
            }
        }
        arr[arr.size - 1] = -1
        return arr
    }
//    fun replaceElements(arr: IntArray): IntArray {
//        var max: Int = arr[arr.size - 1]
//        for (i in arr.size - 1 downTo 0) {
//            val temp: Int = arr[i]
//            arr[i] = max
//            if (max < temp){
//                max = temp
//            }
//        }
//        arr[arr.size - 1] = -1
//        return arr
//    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val replace = Array_ReplaceElementsWithGreatestElementRight()
//            replace.replaceElements(intArrayOf(17,18,5,4,6,1))
//            replace.replaceElements(intArrayOf(57010,40840,69871,14425,70605))
            replace.replaceElements(intArrayOf(87366,98734,26121,75644,98748,51614,14537,39842,34419,34376))

            // 57010,40840,69871,14425,70605
            //23727,37383,95658,71922,31756
        }
    }
}