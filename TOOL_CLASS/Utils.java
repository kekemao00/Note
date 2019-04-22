检测代码是否在主线程上运行通常如下所示：

	if（Looper.myLooper（）== Looper.getMainLooper（））{
		//在主线程上运行
	} else {
		//没有在主线程上运行
	}