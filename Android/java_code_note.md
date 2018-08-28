# java 一些代码笔记

## java 获取当前行

```java
 /**
     * 获取当前代码行号
     *
     * @return FileName:LineNumber
     */
    public static String getLineInfo() {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        /**
         ste.isNativeMethod();//本机方法
         ste.getClassName();//类名
         ste.getFileName();//文件名
         ste.getLineNumber();//行号
         ste.getMethodName();//方法名*/
        return "--- File: " + ste.getFileName() + ",  Class: " + ste.getClassName() + ",  Method: " + ste.getMethodName() + "(),  Line: " + ste.getLineNumber();
    }
```
## java 获取 MD5

```java
DigestUtils.md5Hex(new FileInputStream(path));
```

如果你只需要使用标准的 MD5，其实一行代码就够了，使用 Apache 的 commons-codec 包就提供了获取 16 进制 MD5 值的方法。其底层实现上，也是分多次将一个文件读入，类似方法三。所以性能上也不错。 

OR 使用 windows 自带的命令即可：`certutil -hashfile [文件路径] MD5`



## 检测代码是否在主线程上运行通常如下所示：

```java
	if（Looper.myLooper（）== Looper.getMainLooper（））{
		//在主线程上运行
	} else {
		//没有在主线程上运行
	}
```