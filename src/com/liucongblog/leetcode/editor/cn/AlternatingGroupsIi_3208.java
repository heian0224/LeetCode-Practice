/**
<p>There is a circle of red and blue tiles. You are given an array of integers <code>colors</code> and an integer <code>k</code>. The color of tile <code>i</code> is represented by <code>colors[i]</code>:</p>

<ul> 
 <li><code>colors[i] == 0</code> means that tile <code>i</code> is <strong>red</strong>.</li> 
 <li><code>colors[i] == 1</code> means that tile <code>i</code> is <strong>blue</strong>.</li> 
</ul>

<p>An <strong>alternating</strong> group is every <code>k</code> contiguous tiles in the circle with <strong>alternating</strong> colors (each tile in the group except the first and last one has a different color from its <strong>left</strong> and <strong>right</strong> tiles).</p>

<p>Return the number of <strong>alternating</strong> groups.</p>

<p><strong>Note</strong> that since <code>colors</code> represents a <strong>circle</strong>, the <strong>first</strong> and the <strong>last</strong> tiles are considered to be next to each other.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">colors = [0,1,0,1,0], k = 3</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p><strong><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-183519.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /></strong></p>

<p>Alternating groups:</p>

<p><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/05/28/screenshot-2024-05-28-182448.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/05/28/screenshot-2024-05-28-182844.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/05/28/screenshot-2024-05-28-183057.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /></p>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">colors = [0,1,0,0,1,0,1], k = 6</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>

<p><strong><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-183907.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /></strong></p>

<p>Alternating groups:</p>

<p><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-184128.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-184240.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /></p>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">colors = [1,1,0,1], k = 4</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p><img alt="" data-darkreader-inline-bgcolor="" data-darkreader-inline-bgimage="" src="https://assets.leetcode.com/uploads/2024/06/19/screenshot-2024-05-28-184516.png" style="width: 150px; height: 150px; padding: 10px; background: rgb(255, 255, 255); border-radius: 0.5rem; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #181a1b;" /></p>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>3 &lt;= colors.length &lt;= 10<sup>5</sup></code></li> 
 <li><code>0 &lt;= colors[i] &lt;= 1</code></li> 
 <li><code>3 &lt;= k &lt;= colors.length</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>滑动窗口</li></div></div><br><div><li>👍 21</li><li>👎 0</li></div>
*/
 
package com.liucongblog.leetcode.editor.cn;
public class AlternatingGroupsIi_3208{
    public static void main(String[] args) {
         Solution solution = new AlternatingGroupsIi_3208().new Solution();
         System.out.println(solution.numberOfAlternatingGroups(new int[]{0,1,0,1,0},3));

        System.out.println(solution.numberOfAlternatingGroups(new int[]{0,1,0,0,1,0,1},6));

        System.out.println(solution.numberOfAlternatingGroups(new int[]{1,1,0,1},4));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        if(colors==null||colors.length == 0)
            return 0;
        int groupCount = 0;
        boolean previousIsGroup = false;
        int previousLastVal = 0;

        for(int i=0;i<colors.length;i++){
            int leftIndex=i;
            int rightIndex=i+k-1;
            if(rightIndex>=colors.length){
                rightIndex=rightIndex-colors.length;
            }
            boolean isGroup =true;
            if(previousIsGroup){
                int lastVal = colors[rightIndex];
                if(lastVal== previousLastVal){
                    isGroup=false;
                }

            }else {

                int previousValue=colors[leftIndex];
                for(int j = leftIndex+1; j <=leftIndex+k-1 ; j++) {
                    int index = j;
                    if(index>=colors.length){
                        index=index-colors.length;
                    }
                    int color=colors[index];
                    if(color==previousValue){
                        isGroup=false;
                        break;
                    }
                    previousValue=color;
                }
            }

            if(isGroup){
                groupCount++;

            }
            previousIsGroup = isGroup;
            previousLastVal = colors[rightIndex];

        }

        return groupCount;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}