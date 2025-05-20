# LeetCode-Practice
LeetCode Practice Project

## 使用说明
安装LeetCodeEditor 插件之后登录完成
需要进行一些基本的设置方便代码文件的编写:

1. TempFilePath:
```
/home/cong/workspace/FutureFantasy/LeetCode-Practice/src/com/liucongblog/
```
2. 勾选CustomTemplate
3. Code FileName:
``` 
$!velocityTool.camelCaseName(${question.titleSlug})_${question.frontendQuestionId}
```
4. CodeTemplate:
``` 
${question.content}
  
package com.liucongblog.leetcode.editor.cn;
public class $!velocityTool.camelCaseName(${question.titleSlug})_${question.frontendQuestionId}{
    public static void main(String[] args) {
         Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})_${question.frontendQuestionId}().new Solution();
    }
    ${question.code}
}

```