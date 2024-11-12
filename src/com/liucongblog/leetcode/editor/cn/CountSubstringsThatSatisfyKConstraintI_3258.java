/**
<p>You are given a <strong>binary</strong> string <code>s</code> and an integer <code>k</code>.</p>

<p>A <strong>binary string</strong> satisfies the <strong>k-constraint</strong> if <strong>either</strong> of the following conditions holds:</p>

<ul> 
 <li>The number of <code>0</code>'s in the string is at most <code>k</code>.</li> 
 <li>The number of <code>1</code>'s in the string is at most <code>k</code>.</li> 
</ul>

<p>Return an integer denoting the number of <span data-keyword="substring-nonempty">substrings</span> of <code>s</code> that satisfy the <strong>k-constraint</strong>.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">s = "10101", k = 1</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">12</span></p>

<p><strong>Explanation:</strong></p>

<p>Every substring of <code>s</code> except the substrings <code>"1010"</code>, <code>"10101"</code>, and <code>"0101"</code> satisfies the k-constraint.</p>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">s = "1010101", k = 2</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">25</span></p>

<p><strong>Explanation:</strong></p>

<p>Every substring of <code>s</code> except the substrings with a length greater than 5 satisfies the k-constraint.</p>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">s = "11111", k = 1</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">15</span></p>

<p><strong>Explanation:</strong></p>

<p>All substrings of <code>s</code> satisfy the k-constraint.</p>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 50 </code></li> 
 <li><code>1 &lt;= k &lt;= s.length</code></li> 
 <li><code>s[i]</code> is either <code>'0'</code> or <code>'1'</code>.</li> 
</ul>

<div><div>Related Topics</div><div><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 12</li><li>👎 0</li></div>
*/
 
package com.liucongblog.leetcode.editor.cn;
public class CountSubstringsThatSatisfyKConstraintI_3258{
    public static void main(String[] args) {
         Solution solution = new CountSubstringsThatSatisfyKConstraintI_3258().new Solution();
         System.out.println(solution.countKConstraintSubstrings("11111",1));

        System.out.println(solution.countKConstraintSubstrings("1010101",2));
        System.out.println(solution.countKConstraintSubstrings("10101",1));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        if(s.isEmpty()) return 0;
        boolean matchedConstraint =checkConstraint(s,k);
        if(matchedConstraint){
            return s.length()*(s.length()+1)/2;
        }
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++) {
            for(int j = i+1; j <= len; j++) {
                String sub = s.substring(i, j);
                if(checkConstraint(sub,k)){
                    count++;
                }
            }
        }
        return  count;
    }

        private boolean checkConstraint(String s, int k) {
            int countZero = 0;
            int countOne = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    countZero++;
                }
                if(s.charAt(i) == '1') {
                    countOne++;
                }
            }

            return countZero<=k||countOne<=k;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    
}