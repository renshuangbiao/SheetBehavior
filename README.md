# SheetBehavior
在BottomSheetBehavior(version 27.1.1)的基础上扩展支持上下左右四个方向
## 实现效果
<img src="https://github.com/renshuangbiao/SheetBehavior/blob/master/gif/1542618162097.gif" width="30%" height="30%"  />

##SheetBehavior的使用
SheetBehavior 使用需要CoordinatorLayout作为父布局，SheetBehavior 的布局作为CoordinatorLayout 的子布局，并且加上app:behavior=”com.android.sheetbehavior.SheetBehavior”
    
    <?xml version="1.0" encoding="utf-8"?>
    <android.support.design.widget.CoordinatorLayout
	    xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:tools="http://schemas.android.com/tools"
	    android:id="@+id/coordinator"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:fitsSystemWindows="true">

	    <FrameLayout
	        android:id="@+id/design_sheet"
	        app:layout_behavior="com.android.sheetbehavior.SheetBehavior"
	        app:peekHeight="50dp"
	        app:slideMode="right"
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"/>
    
    </android.support.design.widget.CoordinatorLayout
## SheetBehavior 在Dialog中的使用，实现可拖动关闭的Dailog：
只需要将你的dialog 继承自BaseSheetDialog即可，实现滑动方向即可
## SheetBehavior 在Dialog中的使用，实现可拖动关闭的Dailog：
如果你想让你的Avtivity 实现类似IOS滑动关闭Activity, 只需要继承BaseSheetActivity 即可， 指定滑动方向。
