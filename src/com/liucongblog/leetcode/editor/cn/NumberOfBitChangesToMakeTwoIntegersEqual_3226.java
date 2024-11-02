/**
You are given two positive integers n and k. 

 You can choose any bit in the binary representation of n that is equal to 1 
and change it to 0. 

 Return the number of changes needed to make n equal to k. If it is impossible, 
return -1. 

 
 Example 1: 

 
 Input: n = 13, k = 4 
 

 Output: 2 

 Explanation: Initially, the binary representations of n and k are n = (1101)2 
and k = (0100)2. We can change the first and fourth bits of n. The resulting 
integer is n = (0100)2 = k. 

 Example 2: 

 
 Input: n = 21, k = 21 
 

 Output: 0 

 Explanation: n and k are already equal, so no changes are needed. 

 Example 3: 

 
 Input: n = 14, k = 13 
 

 Output: -1 

 Explanation: It is not possible to make n equal to k. 

 
 Constraints: 

 
 1 <= n, k <= 10⁶ 
 

 Related Topics 位运算 👍 15 👎 0

*/
 
package com.liucongblog.leetcode.editor.cn;
public class NumberOfBitChangesToMakeTwoIntegersEqual_3226{
    public static void main(String[] args) {
         Solution solution = new NumberOfBitChangesToMakeTwoIntegersEqual_3226().new Solution();
         System.out.println(solution.minChanges(13,4));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minChanges(int n, int k) {
        if(n==k){
            return 0;
        }
        if(n<k){
            return -1;
        }
        // 14 1110
        // 13 1101
        // 4  0100
        // 14|13= 15 1111
        int orResult = n|k;
        // 14&13= 12 1100
        int andResult = n&k;
        // 14^13= 3  0011
        int xorResult = n^k;
        // 15^14= 2  0001
        // xorN 表示从xor里排除n的1,如果还有剩余的1表示k有n中没有的1,所以n不能通过改1的方式转化为k
        int xorN = orResult^n;
        if(xorN>0){
            return -1;
        }

        int count = 0;
        while(xorResult>0){
            count = count + (xorResult&1);
            xorResult = xorResult >> 1;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}