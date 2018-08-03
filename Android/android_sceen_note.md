


在需要设置进制截屏的 Activity 的生命周期 onCreate() 方法中添加一行代码即可：

- 禁止截屏

```
getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
```
- 屏幕常亮  

```
getWindow.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
```

*可放在 BaseActivity 的 onCreate()  中*

