# Git(持续更新) 
*[git 使用简易指南]*  
实用且用过的命令,记录下来

## git add (暂存区)的撤销  
```bash
git reset HEAD 
```
如果后面什么都不跟的话 就是上一次add 里面的全部撤销了  
```bash
git reset HEAD XXX/XXX/XXX.java 
```
就是对某个文件进行撤销了  

## 修改提交记录  
 ```bash
 git commit --amend --no-edit
 
 git commit --amend -m "fix"
 
 git log --oneline
 ```

 ```bash
 $ echo 'Hello voidint' >> README.md
 $ git add .
 $ git commit --amend --no-edit
 $ git log --oneline
 eb6c8cb Add README.md // hash值发生了变化
 ```


## 日志 
```	bash
$ git log
$ git lg   
$ #
$ git reflog
```

## pull
```bash
1. stash changes()    /revert
2. pull
4. unstash changes (Pop stash)  /合并
5. 修改重复行
5. commit files   
6. push remote
```
---
## 移除文件
```bash
git rm --cached (-r 文件夹) files-path   
```

## 仓库操作
- 移除远程仓库
	
	```bash
	git remote rm origin  
	```

## 分支操作

*功能分支的名字，可以采用 feature- 的形式命名。*

Git 鼓励大量使用分支：

- __查看分支：__`git branch`

- __创建分支：__`git branch <name>`

- __切换分支：__`git checkout <name>`

- __创建+切换分支：__`git checkout -b <name>`

- __重命名分支:__ `git branch -m oldName newName`

- __合并某分支到当前分支：__`git merge <name>`

- __删除分支：__`git branch -d <name>`

- __删除远程分支( v1.7.0 之后)：__`$ git push origin --delete <branchName>`
- __服务器上获取最新的版本并将你本地主分支指向到它:__
	
	``` bash
	git fetch origin  
	git reset --hard origin/master
	```

- __`git add`后的撤销操作:__ `git reset HEAD XXX/XXX/XXX.java`

## 重写历史提交记录

- __显示HEAD更改时间的列表__ `git reflog`  

    *git reflog 可以查看所有分支的所有操作记录（包括（包括commit和reset的操作），包括已经被删除的commit记录，git log则不能察看已经删除了的commit记录，而且跟进结果可以回退道某一个修改, 红色加粗的即是被删除了的*
- __[改变最后的提交]__ `git commit --amend` 或 `git commit --amend -m "fix bug #42"`

- __[清除历史提交记录中的敏感信息]__ `git filter-branch`
- __[更改旧的或多个提交]__ `git rebase`




## Stash 

- `git stash`
- `git stash pop`
- `git stash list`


## git tag

__含附注的标签:__ 

创建一个含附注类型的标签非常简单，用 -a （译注：取 annotated 的首字母）指定标签名字即可：  

``` bash
$ git tag -a v1.4 -m 'my version 1.4'  
$ git tag  
v0.1  
v1.3  
v1.4  
```
标签推送:  
``` bash
$ git push origin  v1.0    // 推送某个标签到远程
$ git push origin --tags   // 推送所有标签到远程
```
标签删除:  
``` bash
$ git tag -d v0.1                  // 删除 本地v0.1 标签 
$ git push origin :refs/tags/v0.1 // 将本地删除的标签在远程也同步删除
```
##  其他

- 内建的图形化 git：

  ```bash
  gitk
  ```

- 彩色的 git 输出：

  ```bash
  git config color.ui true
  ```

- 显示历史记录时，只显示一行注释信息：

  ```bash
  git config format.pretty oneline
  ```
- 交互地添加文件至缓存区：

  ```bash
  git add -i
  ```

- git  回退单个文件到指定版本

  ```bash
  git checkout <HEAD> <file>
  ```

- 回退到指定版本，之后的提交放到工作区

  ```bash
  git reset 3677bc
  ```




- Q1: git rebase
  git rebase 将当前分支移植到指定分支或指定commit之上。


- Q2: git cherrypick
git cherry-pick命令”复制”一个提交节点并在当前分支做一次完全一样的新提交。

---

[改变最后的提交]:https://www.atlassian.com/git/tutorials/rewriting-history
[更改旧的或多个提交]:改变最后的提交
[清除历史提交记录中的敏感信息]:http://debugtalk.com/post/clean-sensitive-data-from-git-history-commits/
[git 使用简易指南]:http://www.bootcss.com/p/git-guide/

