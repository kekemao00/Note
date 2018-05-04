# Git Command
实用且用过的命令,记录下来  
## 修改提交记录  
```
git commit --amend --no-edit

git commit --amend -m "fix"

git log --oneline
```

```
$ echo 'Hello voidint' >> README.md
$ git add .
$ git commit --amend --no-edit
$ git log --oneline
eb6c8cb Add README.md // hash值发生了变化
```

