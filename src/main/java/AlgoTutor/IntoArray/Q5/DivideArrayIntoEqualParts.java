package AlgoTutor.IntoArray.Q5;

import java.util.HashMap;

/**
 * You are given an integer array nums consisting of 2 * n integers.
 *
 * You need to divide nums into n pairs such that:
 *
 * Each element belongs to exactly one pair.
 * The elements present in a pair are equal.
 * Return true if nums can be divided into n pairs, otherwise return false.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3,2,2,2]
 * Output: true
 * Explanation:
 * There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
 * If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
 *
 *
 * Constraints:
 *
 * nums.length == 2 * n
 * 1 <= n <= 500
 * 1 <= nums[i] <= 500
 */
public class DivideArrayIntoEqualParts {
 public static void main(String[] args){
     DivideArrayIntoEqualParts da = new DivideArrayIntoEqualParts();
//     int[] arr = {3,2,3,2,2,2};
     int[] arr = {1,2,3,4};
     da.getElementsAreEqualPairs(arr);
 }

 public boolean getElementsAreEqualPairs(int[] arr){
     if(arr.length % 2 != 0){
         return false;
     }
     int count = 0;
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i = 0; i < arr.length; i++){
         count = map.getOrDefault(arr[i],0);
         map.put(arr[i], ++count);
     }
     for(int value : map.values()){
         if(value%2 != 0){
             return false;
         }
     }
     return true;
 }
}
