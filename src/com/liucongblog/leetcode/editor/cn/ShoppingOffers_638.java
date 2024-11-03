/**
In LeetCode Store, there are n items to sell. Each item has a price. However, 
there are some special offers, and a special offer consists of one or more 
different kinds of items with a sale price. 

 You are given an integer array price where price[i] is the price of the iᵗʰ 
item, and an integer array needs where needs[i] is the number of pieces of the iᵗʰ 
item you want to buy. 

 You are also given an array special where special[i] is of size n + 1 where 
special[i][j] is the number of pieces of the jᵗʰ item in the iᵗʰ offer and special[
i][n] (i.e., the last integer in the array) is the price of the iᵗʰ offer. 

 Return the lowest price you have to pay for exactly certain items as given, 
where you could make optimal use of the special offers. You are not allowed to buy 
more items than you want, even if that would lower the overall price. You could 
use any of the special offers as many times as you want. 

 
 Example 1: 

 
Input: price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
Output: 14
Explanation: There are two kinds of items, A and B. Their prices are $2 and $5 
respectively. 
In special offer 1, you can pay $5 for 3A and 0B
In special offer 2, you can pay $10 for 1A and 2B. 
You need to buy 3A and 2B, so you may pay $10 for 1A and 2B (special offer #2), 
and $4 for 2A.
 

 Example 2: 

 
Input: price = [2,3,4], special = [[1,1,0,4],[2,2,1,9]], needs = [1,2,1]
Output: 11
Explanation: The price of A is $2, and $3 for B, $4 for C. 
You may pay $4 for 1A and 1B, and $9 for 2A ,2B and 1C. 
You need to buy 1A ,2B and 1C, so you may pay $4 for 1A and 1B (special offer #1
), and $3 for 1B, $4 for 1C. 
You cannot add more items, though only $9 for 2A ,2B and 1C.
 

 
 Constraints: 

 
 n == price.length == needs.length 
 1 <= n <= 6 
 0 <= price[i], needs[i] <= 10 
 1 <= special.length <= 100 
 special[i].length == n + 1 
 0 <= special[i][j] <= 50 
 The input is generated that at least one of special[i][j] is non-zero for 0 <= 
j <= n - 1. 
 

 Related Topics 位运算 记忆化搜索 数组 动态规划 回溯 状态压缩 👍 414 👎 0

*/

package com.liucongblog.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingOffers_638{
    public static void main(String[] args) {
         Solution solution = new ShoppingOffers_638().new Solution();


         System.out.println(solution.shoppingOffers(List.of(2,5),
                List.of(List.of(3,0,5),List.of(1,2,10)),
                 List.of(3,2) ));


        System.out.println(solution.shoppingOffers(List.of(2,3,4),
                List.of(List.of(1,1,0,4),List.of(2,2,1,9)),
                List.of(1,2,1) ));

        System.out.println(solution.shoppingOffers(List.of(0,0,0),
                List.of(List.of(1,1,0,4),List.of(2,2,1,9)),
                List.of(1,1,1) ));
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private Map<List<Integer>, Integer> memo = new HashMap<>();
    private List<List<Integer>> special ;
    private  int specialSize;
    private  int n;
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        // 数据检查，忽略先,
        // n == price.length == needs.length
        // special[i].length == n + 1
        this.n = price.size();
        List<List<Integer>> checked= new ArrayList<>();
        specialSize = special.size();
        for (int i = 0; i <specialSize ; i++) {
            int result=0;
            for (int j = 0; j < n ;j++) {
                result+=price.get(j)*special.get(i).get(j);
            }
            int maxSpecialForIndex = getMaxSpecialNumForIndex(special, needs, n,i);
            if(result> special.get(i).get(n) && maxSpecialForIndex>0){
                checked.add(special.get(i));
            }
        }
        this.special=checked;
        this.memo=new HashMap<>();
        specialSize = this.special.size();
        return getResult(price,needs);
    }

    private int  getResult(List<Integer> price, List<Integer> needs) {

        if(memo.containsKey(needs)){
            return memo.get(needs);
        }
        int result=0;
        for (int i = 0; i < n ; i++) {
            result+=price.get(i)*needs.get(i);
        }
        for (int i = 0; i < specialSize ; i++) {
            int specialIndex = i;
            List<Integer> nextNeeds= new ArrayList<>(needs);
            boolean valid =true;
            for (int j = 0; j < n; j++) {
                if (special.get(specialIndex).get(j)>nextNeeds.get(j)) {
                    valid=false;
                    break;
                }
                nextNeeds.set(j,nextNeeds.get(j)-special.get(specialIndex).get(j));
            }
            if(valid){
                result=Math.min(result,special.get(specialIndex).get(n)+getResult(price,nextNeeds));
            }
        }
        memo.put(needs,result);
        return result;
    }

    private List<List<Integer>> removeIndexFromSpecial(List<List<Integer>> special, int specialIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < special.size(); i++) {
            List<Integer> specialPrice = special.get(i);
            if (specialIndex != i) {
                result.add(specialPrice);
            }
        }
        return result;
    }

    private int getSpecialCostFromSpecialIndexAndSpecialNum(List<List<Integer>> special, int n, int specialIndex, int specialNum) {
        return special.get(specialIndex).get(n)*specialNum;

    }

    private List<Integer> getCutNeedsFromSpecialIndexAndSpecialNum(List<List<Integer>> special, List<Integer> needs,
                                                      int n, int specialIndex, int specialNum) {

        List<Integer> cutNeeds = new ArrayList<>(n);
        for (int i = 0; i < n ; i++) {
            int need = needs.get(i);
            int specialCost = special.get(specialIndex).get(i)*specialNum;
            cutNeeds.add(need-specialCost);
        }
        return cutNeeds;

    }

    private static int  getMaxSpecialNumForIndex(List<List<Integer>> special, List<Integer> needs, int n ,int specialIndex) {
        int maxSpecial = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int specialNum= special.get(specialIndex).get(i);
            if(specialNum>0){
                int indexCanBuy = needs.get(i)/specialNum;
                maxSpecial = Math.min(maxSpecial, indexCanBuy);
            }
        }
        return maxSpecial;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}