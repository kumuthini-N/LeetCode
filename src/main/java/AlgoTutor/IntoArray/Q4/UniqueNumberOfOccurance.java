package AlgoTutor.IntoArray.Q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * Example 2:
 *
 * Input: arr = [1,2]
 * Output: false
 * Example 3:
 *
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurance {
    public static void main(String args[]){
        UniqueNumberOfOccurance uni = new UniqueNumberOfOccurance();
//        int[] arr = {1,2,2,1,1,3};
        int[] arr = {1,2};
        uni.performOperation(arr);
    }

    public boolean performOperation(int[] nums){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i : nums)
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        HashSet<Integer> set = new HashSet<>(map.values());
//        return set.size() == map.size();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        HashSet<Integer> hashSet = new HashSet<Integer>();

        int count = 0;
        for(int i=0; i < nums.length; i++){
            count = hashMap.getOrDefault(nums[i], 0);
            hashMap.put(nums[i], ++count);
        }
//        for(int value: hashMap.values()){
//            hashSet.add(value);
//        }
        HashSet<Integer> hashSet = new HashSet<>(hashMap.values());
        return hashMap.size() == hashSet.size();
    }
}
