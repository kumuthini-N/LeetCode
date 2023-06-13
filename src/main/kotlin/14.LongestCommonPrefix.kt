/**
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

 */
class LongestCommonPrefix {
    fun longestCommonPrefix(arr: Array<String>): String {
        if (arr.isEmpty()) {
            return "";
        }
        var shortestArray = arr[0];
        for (i in 0 until arr.size) {
            if (arr[i].length < shortestArray.length)
                shortestArray = arr[i]
        }

        for (i in 0..arr.size - 1 step 1) {
            for (j in 0..shortestArray.length - 1 step 1) {
                if (j == shortestArray.length || shortestArray[j] != arr[i][j]) {
                    shortestArray = shortestArray.substring(0, j);
                    break;
                }
            }
        }
        return shortestArray;
    }
}

fun main(args: Array<String>) {
    var obj = LongestCommonPrefix()
    obj.longestCommonPrefix(arrayOf("flower", "el", "night"))
}