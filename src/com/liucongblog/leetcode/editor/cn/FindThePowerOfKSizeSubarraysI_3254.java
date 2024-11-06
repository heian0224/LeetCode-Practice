/**
<p>You are given an array of integers <code>nums</code> of length <code>n</code> and a <em>positive</em> integer <code>k</code>.</p>

<p>The <strong>power</strong> of an array is defined as:</p>

<ul> 
 <li>Its <strong>maximum</strong> element if <em>all</em> of its elements are <strong>consecutive</strong> and <strong>sorted</strong> in <strong>ascending</strong> order.</li> 
 <li>-1 otherwise.</li> 
</ul>

<p>You need to find the <strong>power</strong> of all <span data-keyword="subarray-nonempty">subarrays</span> of <code>nums</code> of size <code>k</code>.</p>

<p>Return an integer array <code>results</code> of size <code>n - k + 1</code>, where <code>results[i]</code> is the <em>power</em> of <code>nums[i..(i + k - 1)]</code>.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">nums = [1,2,3,4,3,2,5], k = 3</span></p> 
</div>

<p><strong>Output:</strong> [3,4,-1,-1,-1]</p>

<p><strong>Explanation:</strong></p>

<p>There are 5 subarrays of <code>nums</code> of size 3:</p>

<ul> 
 <li><code>[1, 2, 3]</code> with the maximum element 3.</li> 
 <li><code>[2, 3, 4]</code> with the maximum element 4.</li> 
 <li><code>[3, 4, 3]</code> whose elements are <strong>not</strong> consecutive.</li> 
 <li><code>[4, 3, 2]</code> whose elements are <strong>not</strong> sorted.</li> 
 <li><code>[3, 2, 5]</code> whose elements are <strong>not</strong> consecutive.</li> 
</ul>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">nums = [2,2,2,2,2], k = 4</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">[-1,-1]</span></p>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">nums = [3,2,3,2,3,2], k = 2</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">[-1,3,-1,3,-1]</span></p>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= n == nums.length &lt;= 500</code></li> 
 <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li> 
 <li><code>1 &lt;= k &lt;= n</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>滑动窗口</li></div></div><br><div><li>👍 15</li><li>👎 0</li></div>
*/
 
package com.liucongblog.leetcode.editor.cn;

import java.util.Arrays;

public class FindThePowerOfKSizeSubarraysI_3254{
    public static void main(String[] args) {
         Solution solution = new FindThePowerOfKSizeSubarraysI_3254().new Solution();
         System.out.println(Arrays.toString(solution.resultsArray(
                 new int[]{1, 2, 3, 4, 3, 2, 5}, 3)));
        System.out.println(Arrays.toString(solution.resultsArray(
                new int[]{2,2,2,2,2}, 4)));
        System.out.println(Arrays.toString(solution.resultsArray(
                new int[]{3,2,3,2,3,2}, 2)));

        System.out.println(Arrays.toString(solution.resultsArray(
                new int[]{1,3,4}, 2)));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    int[] array;
    int n;
    int k ;
    public int[] resultsArray(int[] nums, int k) {

        array = nums;
        n = nums.length;
        this.k = k;
        int[] result = new int[n - k + 1];
        for (int i = 0; i < n-k+1; i++) {
            int leftIndex= i;
            int rightIndex= i+k-1;
            int power= getPower(leftIndex,rightIndex);
            result[i] = power;
        }
        return result;
    }

        private int getPower(int leftIndex, int rightIndex) {
            int prev=array[leftIndex];
            for (int i = leftIndex+1; i <= rightIndex; i++) {
                int val = array[i];
                if (val !=prev+1) {
                    return -1;
                }
                prev =val;
            }

            return array[rightIndex];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    
}