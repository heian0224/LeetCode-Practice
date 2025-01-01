/**
<p>There is a circle of red and blue tiles. You are given an array of integers <code>colors</code>. The color of tile <code>i</code> is represented by <code>colors[i]</code>:</p>

<ul> 
 <li><code>colors[i] == 0</code> means that tile <code>i</code> is <strong>red</strong>.</li> 
 <li><code>colors[i] == 1</code> means that tile <code>i</code> is <strong>blue</strong>.</li> 
</ul>

<p>Every 3 contiguous tiles in the circle with <strong>alternating</strong> colors (the middle tile has a different color from its <strong>left</strong> and <strong>right</strong> tiles) is called an <strong>alternating</strong> group.</p>

<p>Return the number of <strong>alternating</strong> groups.</p>

<p><strong>Note</strong> that since <code>colors</code> represents a <strong>circle</strong>, the <strong>first</strong> and the <strong>last</strong> tiles are considered to be next to each other.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">colors = [1,1,1]</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/05/16/image_2024-05-16_23-53-171.png" style="width: 150px; height: 150px; padding: 10px; background: #fff; border-radius: .5rem;" /></p>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">colors = [0,1,0,0,1]</span></p> 
</div>

<p><strong>Output:</strong> 3</p>

<p><strong>Explanation:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/05/16/image_2024-05-16_23-47-491.png" style="width: 150px; height: 150px; padding: 10px; background: #fff; border-radius: .5rem;" /></p>

<p>Alternating groups:</p>

<p><strong class="example"><img alt="" src="https://assets.leetcode.com/uploads/2024/05/16/image_2024-05-16_23-50-441.png" style="width: 150px; height: 150px; padding: 10px; background: #fff; border-radius: .5rem;" /></strong><img alt="" src="https://assets.leetcode.com/uploads/2024/05/16/image_2024-05-16_23-48-211.png" style="width: 150px; height: 150px; padding: 10px; background: #fff; border-radius: .5rem;" /><strong class="example"><img alt="" src="https://assets.leetcode.com/uploads/2024/05/16/image_2024-05-16_23-49-351.png" style="width: 150px; height: 150px; padding: 10px; background: #fff; border-radius: .5rem;" /></strong></p>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>3 &lt;= colors.length &lt;= 100</code></li> 
 <li><code>0 &lt;= colors[i] &lt;= 1</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>滑动窗口</li></div></div><br><div><li>👍 9</li><li>👎 0</li></div>
*/
 
package com.liucongblog.leetcode.editor.cn;

import java.util.List;

public class AlternatingGroupsI_3206{
    public static void main(String[] args) {
         Solution solution = new AlternatingGroupsI_3206().new Solution();
         System.out.println(solution.numberOfAlternatingGroups(new int[]{1,1,1}));
        System.out.println(solution.numberOfAlternatingGroups(new int[]{0,1,0,0,1}));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        if(colors==null||colors.length == 0)
            return 0;
        int len = colors.length;
        int groupCount = 0;
        for(int i=0;i<len;i++){
            int leftIndex=i;
            int middleIndex=i+1;
            int rightIndex=i+2;
            if(middleIndex>=len){
                middleIndex=middleIndex-len;
            }
            if(rightIndex>=len){
                rightIndex=rightIndex-len;
            }
            if(colors[leftIndex]==colors[rightIndex]&&colors[rightIndex]!=colors[middleIndex]){
                groupCount++;
            }
        }


        return groupCount;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}