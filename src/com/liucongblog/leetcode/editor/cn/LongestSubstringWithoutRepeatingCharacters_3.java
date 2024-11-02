/**
Given a string s, find the length of the longest substring without repeating 
characters. 

 
 Example 1: 

 
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 

 Example 2: 

 
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
 

 Example 3: 

 
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a 
substring.
 

 
 Constraints: 

 
 0 <= s.length <= 5 * 10⁴ 
 s consists of English letters, digits, symbols and spaces. 
 

 Related Topics 哈希表 字符串 滑动窗口 👍 10403 👎 0

*/
 
package com.liucongblog.leetcode.editor.cn;
public class LongestSubstringWithoutRepeatingCharacters_3{
    public static void main(String[] args) {
         Solution solution = new LongestSubstringWithoutRepeatingCharacters_3().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int res = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }else {
                res = Math.max(res, sb.length());
                sb = new StringBuilder(sb.substring(sb.indexOf(String.valueOf(c)) + 1));
                sb.append(c);
            }

        }
        return Math.max(res, sb.length());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}