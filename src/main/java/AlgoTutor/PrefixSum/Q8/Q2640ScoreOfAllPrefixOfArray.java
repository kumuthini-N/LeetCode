package AlgoTutor.PrefixSum.Q8;

/**
 * We define the conversion array conver of an array arr as follows:
 *
 * conver[i] = arr[i] + max(arr[0..i]) where max(arr[0..i]) is the maximum value of arr[j] over 0 <= j <= i.
 * We also define the score of an array arr as the sum of the values of the conversion array of arr.
 *
 * Given a 0-indexed integer array nums of length n, return an array ans of length n where ans[i] is the score of the prefix nums[0..i].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,7,5,10]
 * Output: [4,10,24,36,56]
 * Explanation:
 * For the prefix [2], the conversion array is [4] hence the score is 4
 * For the prefix [2, 3], the conversion array is [4, 6] hence the score is 10
 * For the prefix [2, 3, 7], the conversion array is [4, 6, 14] hence the score is 24
 * For the prefix [2, 3, 7, 5], the conversion array is [4, 6, 14, 12] hence the score is 36
 * For the prefix [2, 3, 7, 5, 10], the conversion array is [4, 6, 14, 12, 20] hence the score is 56
 * Example 2:
 *
 * Input: nums = [1,1,2,4,8,16]
 * Output: [2,4,8,16,32,64]
 * Explanation:
 * For the prefix [1], the conversion array is [2] hence the score is 2
 * For the prefix [1, 1], the conversion array is [2, 2] hence the score is 4
 * For the prefix [1, 1, 2], the conversion array is [2, 2, 4] hence the score is 8
 * For the prefix [1, 1, 2, 4], the conversion array is [2, 2, 4, 8] hence the score is 16
 * For the prefix [1, 1, 2, 4, 8], the conversion array is [2, 2, 4, 8, 16] hence the score is 32
 * For the prefix [1, 1, 2, 4, 8, 16], the conversion array is [2, 2, 4, 8, 16, 32] hence the score is 64
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 *
 */
public class Q2640ScoreOfAllPrefixOfArray {
    public long[] getConversion(int[] nums){
        long[] convArr = new long[nums.length];
        long max = Integer.MIN_VALUE;
        long total = 0;
        for(int i = 0; i< nums.length; i++){
            if(max <= nums[i]){
                max = nums[i];
            }
            total = total + nums[i] + max;
            convArr[i] = total;
        }
/**
 * 274763804,1442104174,2258224158,3488705194,4873433716,5905393705,6791316196,7961414994,9062445482,9934903709,10700642565,11794834049,13031600343,14184164413,16119978217,17697605432,18686226019,20120356478,21275302171,23064672892,24076718147,25107235440,26361627832,27805180320,29343097564,31083868471,32841662134,34392016854,35809139686,36856545138,38705063953,40171169478,41237300283,42503134481,44400569458,45520088703,47206709672,48616298857,50534513986,52012213929,53290532813,54529742997,55900210613,57699681732,59160010290,60902991922,62333473743,63567431485,64947063419,66607573763,67663486216,68761363951,70043711136,71525554146,72590892466,73560623838,75184168134,77125729388,78707653463,79756184933
 */
        return convArr;
    }

    public static void main(String[] args){
        Q2640ScoreOfAllPrefixOfArray obj = new Q2640ScoreOfAllPrefixOfArray();
//        int[] nums = {2,3,7,5,10};
        int[] nums = {137381902,583670185,232449799,615240518,692364261,339595728,193558230,477734537,408666227,180093966,73374595,401827223,544402033,460199809,967906902,609720313,20713685,466223557,187038791,821463819,44138353,62610391,286485490,475645586,570010342,772864005,789886761,582447818,449215930,79498550,880611913,498198623,98223903,297927296,929528075,151612343,718714067,441682283,950308227,509793041,310411982,271303282,402560714,831564217,492421656,775074730,462574919,266050840,411725032,692603442,88005551,129970833,314440283,513936108,97431418,1824470,655637394,970780627,611143448,77750843};
        obj.getConversion(nums);
    }
}
