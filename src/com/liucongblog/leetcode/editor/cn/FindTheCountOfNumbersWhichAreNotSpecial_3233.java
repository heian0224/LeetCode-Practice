/**
<p>You are given 2 <strong>positive</strong> integers <code>l</code> and <code>r</code>. For any number <code>x</code>, all positive divisors of <code>x</code> <em>except</em> <code>x</code> are called the <strong>proper divisors</strong> of <code>x</code>.</p>

<p>A number is called <strong>special</strong> if it has exactly 2 <strong>proper divisors</strong>. For example:</p>

<ul> 
 <li>The number 4 is <em>special</em> because it has proper divisors 1 and 2.</li> 
 <li>The number 6 is <em>not special</em> because it has proper divisors 1, 2, and 3.</li> 
</ul>

<p>Return the count of numbers in the range <code>[l, r]</code> that are <strong>not</strong> <strong>special</strong>.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">l = 5, r = 7</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>There are no special numbers in the range <code>[5, 7]</code>.</p>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">l = 4, r = 16</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">11</span></p>

<p><strong>Explanation:</strong></p>

<p>The special numbers in the range <code>[4, 16]</code> are 4 and 9.</p>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= l &lt;= r &lt;= 10<sup>9</sup></code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>数学</li><li>数论</li></div></div><br><div><li>👍 17</li><li>👎 0</li></div>
*/
 
package com.liucongblog.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;


public class FindTheCountOfNumbersWhichAreNotSpecial_3233{
    public static void main(String[] args) {
         Solution solution = new FindTheCountOfNumbersWhichAreNotSpecial_3233().new Solution();

         System.out.println(solution.nonSpecialCount(5,7));
        System.out.println(solution.nonSpecialCount(4,16));
        System.out.println(solution.nonSpecialCount(3693,85366));
        System.out.println(solution.nonSpecialCount(245837529,937429158));

    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

      public int nonSpecialCount(int l, int r) {
        int count = 0;
        int sqrtLeft = (int) Math.ceil( Math.sqrt(l));
        if(sqrtLeft<2){
            sqrtLeft = 2;

        }
         int sqrtRight = (int) Math.floor( Math.sqrt(r));
        int[] primesArr = new int[sqrtRight+1];
         for (int i = 2; i <= sqrtRight; i++) {
             if(primesArr[i]==0){
                 if(i>=sqrtLeft){
                    count++;
                 }

                 for (int j = i*2; j <= sqrtRight; j=j+i) {
                     primesArr[j]=1;
                 }
             }

         }


        return r-l+1-count;
    }



    }
//leetcode submit region end(Prohibit modification and deletion)

    
}