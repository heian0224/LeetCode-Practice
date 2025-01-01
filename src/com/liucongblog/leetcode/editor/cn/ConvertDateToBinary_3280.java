/**
You are given a string date representing a Gregorian calendar date in the yyyy-
mm-dd format. 

 date can be written in its binary representation obtained by converting year, 
month, and day to their binary representations without any leading zeroes and 
writing them down in year-month-day format. 

 Return the binary representation of date. 

 
 Example 1: 

 
 Input: date = "2080-02-29" 
 

 Output: "100000100000-10-11101" 

 Explanation: 

 100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 
respectively. 

 Example 2: 

 
 Input: date = "1900-01-01" 
 

 Output: "11101101100-1-1" 

 Explanation: 

 11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 
respectively. 

 
 Constraints: 

 
 date.length == 10 
 date[4] == date[7] == '-', and all other date[i]'s are digits. 
 The input is generated such that date represents a valid Gregorian calendar 
date between Jan 1ˢᵗ, 1900 and Dec 31ˢᵗ, 2100 (both inclusive). 
 

 Related Topics 数学 字符串 👍 23 👎 0

*/

package com.liucongblog.leetcode.editor.cn;
public class ConvertDateToBinary_3280{
    public static void main(String[] args) {
         Solution solution = new ConvertDateToBinary_3280().new Solution();
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertDateToBinary(String date) {
        return "";
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}