#MonKey

[Monkey]是一个命令行工具，可以在任何模拟器实例或设备上运行。它发送一个伪随机的用户事件流到系统中，作为你正在开发的应用软件的压力测试。

- 猴子包括许多选项，但它们分为四个主要类别：

- 基本配置选项，例如设置要尝试的事件数量。
- 操作上的限制，比如将测试限制在一个包中。
- 事件类型和频率。
- 调试选项。

当Monkey运行时，它会生成事件并将它们发送到系统。它还观察 被测系统并寻找三个条件，特别对待它：

- 如果您限制Monkey运行一个或多个特定软件包，它会监视尝试导航到任何其他软件包并阻止它们。
- 如果您的应用程序崩溃或接收到任何未处理的异常，Monkey将停止并报告错误。
- 如果您的应用程序生成应用程序无响应错误，猴子将停止并报告错误。
根据您选择的详细级别，您还将看到有关猴子进程和正在生成的事件的报告。

基本的语法是：

```
$ adb shell monkey [ options ] < event - count >
```
eg:
```
$ adb shell monkey -v 1000
```

```
$ adb shell monkey -p your.package.name -v 500
```
eg:
```
$ adb shell monkey -p me.kekemao.app -v 1000
```
---
[Monkey]:https://developer.android.com/studio/test/monkey
