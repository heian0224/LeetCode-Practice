/**
You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order, and each of their nodes contains a 
single digit. Add the two numbers and return the sum as a linked list. 

 You may assume the two numbers do not contain any leading zero, except the 
number 0 itself. 

 
 Example 1: 
 
 
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 

 Example 2: 

 
Input: l1 = [0], l2 = [0]
Output: [0]
 

 Example 3: 

 
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

 
 Constraints: 

 
 The number of nodes in each linked list is in the range [1, 100]. 
 0 <= Node.val <= 9 
 It is guaranteed that the list represents a number that does not have leading 
zeros. 
 

 Related Topics 递归 链表 数学 👍 10886 👎 0

*/
 
package com.liucongblog.leetcode.editor.cn;
public class AddTwoNumbers_2{
    public static void main(String[] args) {
         Solution solution = new AddTwoNumbers_2().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();

        ListNode current = head;
        ListNode left = l1;
        ListNode right = l2;
        while (left != null || right != null) {
            int sum = 0;
            if (current!= null) {
                sum=current.val;
            }
            if (left != null) {
                sum += left.val;
                left = left.next;
            }
            if (right != null) {
                sum += right.val;
                right = right.next;
            }
            current.val = sum % 10;
            int carry = sum / 10;
            if (left != null || right != null|| carry > 0) {
                current.next = new ListNode(sum /10);
                current = current.next;
            }



        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    
}