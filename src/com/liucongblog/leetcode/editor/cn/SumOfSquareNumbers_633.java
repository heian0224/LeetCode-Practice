/**
<p>Given a non-negative integer <code>c</code>, decide whether there're two integers <code>a</code> and <code>b</code> such that <code>a<sup>2</sup> + b<sup>2</sup> = c</code>.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> c = 5
<strong>Output:</strong> true
<strong>Explanation:</strong> 1 * 1 + 2 * 2 = 5
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> c = 3
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>0 &lt;= c &lt;= 2<sup>31</sup> - 1</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数学</li><li>双指针</li><li>二分查找</li></div></div><br><div><li>👍 475</li><li>👎 0</li></div>
*/
 
package com.liucongblog.leetcode.editor.cn;
public class SumOfSquareNumbers_633{
    public static void main(String[] args) {
         Solution solution = new SumOfSquareNumbers_633().new Solution();

//        System.out.println(solution.judgeSquareSum(5));
//
//        System.out.println(solution.judgeSquareSum(3));
//
//        System.out.println(solution.judgeSquareSum(100));
//
//        System.out.println(solution.judgeSquareSum(4));
        System.out.println(solution.judgeSquareSum(2147483600));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
        double maxSqrtDoubleVal = Math.sqrt(c);
        int maxSqrtIntVal = (int) Math.ceil(maxSqrtDoubleVal);
        int left =0;
        int right = maxSqrtIntVal+1;
        while(left <= right){

            long val = (long) left * left + (long) right * right;
            if(val == c){
                return true;
            }
            if(val > c){
                right=right-1;
            }
            if(val < c){
                left=left+1;
            }

        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}