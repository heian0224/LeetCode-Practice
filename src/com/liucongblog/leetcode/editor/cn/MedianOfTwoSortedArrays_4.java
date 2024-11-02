/**
Given two sorted arrays nums1 and nums2 of size m and n respectively, return 
the median of the two sorted arrays. 

 The overall run time complexity should be O(log (m+n)). 

 
 Example 1: 

 
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
 

 Example 2: 

 
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

 
 Constraints: 

 
 nums1.length == m 
 nums2.length == n 
 0 <= m <= 1000 
 0 <= n <= 1000 
 1 <= m + n <= 2000 
 -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
 

 Related Topics 数组 二分查找 分治 👍 7284 👎 0

*/
 
package com.liucongblog.leetcode.editor.cn;
public class MedianOfTwoSortedArrays_4{
    public static void main(String[] args) {
         Solution solution = new MedianOfTwoSortedArrays_4().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int leftIndex =0    , rightIndex = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        boolean isOdd = (len1 + len2) % 2 == 1;
        // total 5, expect the 3rd element, it's index is 2
        int mid = (len1 + len2) / 2;
        if (len1 == 0) {
            return isOdd? nums2[mid]: (nums2[mid-1] + nums2[mid]) / 2.0;

        }
        if (len2==0) {
            return isOdd? nums1[mid]: (nums1[mid-1] + nums1[mid]) / 2.0;
        }

        if( nums1[len1-1] <= nums2[0] ){
            int midVal = mid>=len1? nums2[mid-len1]:nums1[mid];
            if (isOdd) {
                return midVal;
            }else{
                int midVal2 = mid-1>=len1? nums2[mid-len1-1]:nums1[mid-1];
                return (midVal + midVal2) / 2.0;
            }
        }
        if(nums2[len2-1] <= nums1[0]  ){
            int midVal = mid>=len2? nums1[mid-len2]:nums2[mid];

            if (isOdd) {
                return midVal;
            }else{
                int midVal2 = mid-1>=len2? nums1[mid-len2-1]:nums2[mid-1];
                return (midVal + midVal2) / 2.0;
            }
        }

        int currentIndex = 0;
        int currentVal = 0;
        int oddVal = 0;
        while(leftIndex < len1 || rightIndex < len2){
            if(nums1[leftIndex] < nums2[rightIndex]){
                currentVal = nums1[leftIndex];
                leftIndex++;

            }else{
                currentVal = nums2[rightIndex];
                rightIndex++;

            }
            if(currentIndex == mid){
                if(isOdd){
                    return currentVal;
                }else{
                    return (currentVal + oddVal) / 2.0;
                }

            }else if(currentIndex == mid - 1){

                oddVal = currentVal;
            }
            currentIndex++;
        }


        return currentVal;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}