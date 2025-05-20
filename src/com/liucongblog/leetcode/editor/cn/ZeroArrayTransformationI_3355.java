//给定一个长度为 n 的整数数组 nums 和一个二维数组 queries，其中 queries[i] = [li, ri]。 
//
// 对于每个查询 queries[i]： 
//
// 
// 在 nums 的下标范围 [li, ri] 内选择一个下标 子集。 
// 将选中的每个下标对应的元素值减 1。 
// 
//
// 零数组 是指所有元素都等于 0 的数组。 
//
// 如果在按顺序处理所有查询后，可以将 nums 转换为 零数组 ，则返回 true，否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [1,0,1], queries = [[0,2]] 
// 
//
// 输出： true 
//
// 解释： 
//
// 
// 对于 i = 0： 
// 
//
// 
// 选择下标子集 [0, 2] 并将这些下标处的值减 1。 
// 数组将变为 [0, 0, 0]，这是一个零数组。 
// 
// 
//
//
// 示例 2： 
//
// 
// 输入： nums = [4,3,2,1], queries = [[1,3],[0,2]] 
// 
//
// 输出： false 
//
// 解释： 
//
// 
// 对于 i = 0： 
// 
//
// 
// 选择下标子集 [1, 2, 3] 并将这些下标处的值减 1。 
// 数组将变为 [4, 2, 1, 0]。 
// 
// 
// 对于 i = 1：
// 
// 选择下标子集 [0, 1, 2] 并将这些下标处的值减 1。 
// 数组将变为 [3, 1, 0, 0]，这不是一个零数组。 
// 
// 
//
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// 0 <= nums[i] <= 10⁵ 
// 1 <= queries.length <= 10⁵ 
// queries[i].length == 2 
// 0 <= li <= ri < nums.length 
// 
//
// Related Topics 数组 前缀和 👍 51 👎 0

  
package com.liucongblog.leetcode.editor.cn;
public class ZeroArrayTransformationI_3355{
    public static void main(String[] args) {
         Solution solution = new ZeroArrayTransformationI_3355().new Solution();
        System.out.println(solution.isZeroArray(new int[]{
                1,0,1
        },new int[][]{{0,2}}));

        System.out.println(solution.isZeroArray(new int[]{
                4,3,2,1
        },new int[][]{{1,3},{0,2}}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < queries.length; i++) {

            diff[queries[i][0]]++;
            diff[queries[i][1]+1]--;
        }
        int val = 0;
        for (int i = 0; i < n; i++) {
            val += diff[i];
            if(val<nums[i]) {
                return false;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}