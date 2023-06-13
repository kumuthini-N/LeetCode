import java.util.Arrays;

public class DupZero {
    public static int[] findNumbers(int[] nums) {
        final int[] num = nums;
        int[] a = num;
        int[] arr = nums;
        boolean skip = false;
        int var4 = 0;
        int var5 = nums.length;

        while(true) {
            while(var4 < var5) {
                int i = var4++;
                if (arr[i] == 0 && !skip) {
                    int k = i + 1;
                    int var8 = k + 1;
                    int var9 = a.length - 1;
                    int j;
                    if (var8 <= var9) {
                        do {
                            j = var8++;
                            arr[j] = a[j - 1];
                        } while(j != var9);
                    }

                    arr[i + 1] = 0;
                    a = arr;
                    skip = true;
                } else {
                    skip = false;
                }
            }
            System.out.println(Arrays.toString(arr));
            return arr;
        }
    }

    public static void main(String args[])  {
        findNumbers(new int[]{ 1, 0, 2, 3, 0, 4, 5, 0});
    }
}
