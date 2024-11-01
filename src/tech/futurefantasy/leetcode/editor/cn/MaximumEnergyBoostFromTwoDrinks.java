/**
 * You are given two integer arrays energyDrinkA and energyDrinkB of the same
 * length n by a futuristic sports scientist. These arrays represent the energy boosts
 * per hour provided by two different energy drinks, A and B, respectively.
 * <p>
 * You want to maximize your total energy boost by drinking one energy drink per
 * hour. However, if you want to switch from consuming one energy drink to the
 * other, you need to wait for one hour to cleanse your system (meaning you won't get
 * any energy boost in that hour).
 * <p>
 * Return the maximum total energy boost you can gain in the next n hours.
 * <p>
 * Note that you can start consuming either of the two energy drinks.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: energyDrinkA = [1,3,1], energyDrinkB = [3,1,1]
 * <p>
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * To gain an energy boost of 5, drink only the energy drink A (or only B).
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: energyDrinkA = [4,1,1], energyDrinkB = [1,1,3]
 * <p>
 * <p>
 * Output: 7
 * <p>
 * Explanation:
 * <p>
 * To gain an energy boost of 7:
 * <p>
 * <p>
 * Drink the energy drink A for the first hour.
 * Switch to the energy drink B and we lose the energy boost of the second hour.
 * Gain the energy boost of the drink B in the third hour.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * n == energyDrinkA.length == energyDrinkB.length
 * 3 <= n <= 10⁵
 * 1 <= energyDrinkA[i], energyDrinkB[i] <= 10⁵
 * <p>
 * <p>
 * Related Topics 数组 动态规划 👍 35 👎 0
 */

package tech.futurefantasy.leetcode.editor.cn;

public class MaximumEnergyBoostFromTwoDrinks {
    public static void main(String[] args) {
        Solution solution = new MaximumEnergyBoostFromTwoDrinks().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
            return -1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}