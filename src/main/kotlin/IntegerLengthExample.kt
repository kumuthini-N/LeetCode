import kotlin.jvm.JvmStatic

class IntegerLengthExample {
    fun getCount(n: Int): Int {
        var n = n
        var count = 0
        while (n != 0) {
            n = n / 10
            count = count + 1
        }
        return count
    }

    companion object {
        @JvmStatic
        fun main(argvs: Array<String>) {
            val arr = intArrayOf(78, 9, 2345, 899009, 1, 414, 34, 1000, 2749)
            val size = arr.size
            val obj = IntegerLengthExample()
            for (i in 0 until size) {
                val count = obj.getCount(arr[i])
                println("The length of the number " + arr[i] + " is " + count)
            }
        }
    }
}