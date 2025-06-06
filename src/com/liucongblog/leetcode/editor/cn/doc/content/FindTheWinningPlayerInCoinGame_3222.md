<p>You are given two <strong>positive</strong> integers <code>x</code> and <code>y</code>, denoting the number of coins with values 75 and 10 <em>respectively</em>.</p>

<p>Alice and Bob are playing a game. Each turn, starting with <strong>Alice</strong>, the player must pick up coins with a <strong>total</strong> value 115. If the player is unable to do so, they <strong>lose</strong> the game.</p>

<p>Return the <em>name</em> of the player who wins the game if both players play <strong>optimally</strong>.</p>

<p>&nbsp;</p> 
<p><strong class="example">Example 1:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">x = 2, y = 7</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">"Alice"</span></p>

<p><strong>Explanation:</strong></p>

<p>The game ends in a single turn:</p>

<ul> 
 <li>Alice picks 1 coin with a value of 75 and 4 coins with a value of 10.</li> 
</ul>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block"> 
 <p><strong>Input:</strong> <span class="example-io">x = 4, y = 11</span></p> 
</div>

<p><strong>Output:</strong> <span class="example-io">"Bob"</span></p>

<p><strong>Explanation:</strong></p>

<p>The game ends in 2 turns:</p>

<ul> 
 <li>Alice picks 1 coin with a value of 75 and 4 coins with a value of 10.</li> 
 <li>Bob picks 1 coin with a value of 75 and 4 coins with a value of 10.</li> 
</ul>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= x, y &lt;= 100</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数学</li><li>博弈</li><li>模拟</li></div></div><br><div><li>👍 9</li><li>👎 0</li></div>