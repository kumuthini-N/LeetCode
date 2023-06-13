/**
 * Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
class RomanToInteger {
    fun romanToInt(s: String): Int {
        var hashMap: HashMap<String, Int> = HashMap<String, Int>()
        hashMap.put("I", 1)
        hashMap.put("V", 5)
        hashMap.put("X", 10)
        hashMap.put("L", 50)
        hashMap.put("C", 100)
        hashMap.put("D", 500)
        hashMap.put("M", 1000)
        var romanNumber = 0;
        var value = 0;
        var romanTwo = 0;
        var skipNext = false
        for (i in 0..s.length - 1 step 1) {
            value = if (skipNext) 0 else hashMap.getValue(s[i].toString())
            if (i < s.length - 1) {
                if (!skipNext) {
                    romanTwo = hashMap.getValue(s[i + 1].toString())
                    if (romanTwo > value) {
                        value = romanTwo - value
                        skipNext = true
                    }
                } else {
                    skipNext = false
                }
            }
            romanNumber += value

        }
        return romanNumber
    }
}

fun main(args: Array<String>) {
    var sum = RomanToInteger()
    sum.romanToInt("MCMXCIV")
    //MCMXCIV
}