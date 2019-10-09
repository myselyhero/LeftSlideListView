# slide
 仿QQ左滑删除，左滑按钮。
 ====================
 
 话不多说先上效果图：
  -----------------
 
 ![](https://raw.githubusercontent.com/myselyhero/slide/master/listview/src/main/res/drawable/effect_picture.png)  
 
 使用方法
 -------
    
 布局引用:
 
 <?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:background="@color/theme_back">

     <!---->
     <com.clwl.commonality.view.MyListView
         android:id="@+id/member_wallet_bank_item"
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:divider="@color/theme_line"
         android:dividerHeight="1px"
         android:listSelector="#00000000"
         app:right_width="@dimen/size80"/>
</LinearLayout>
      
   ITEM布局:
   <?xml version="1.0" encoding="utf-8"?>
   <LinearLayout
       xmlns:android="http://schemas.android.com/apk/res/android" android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:orientation="horizontal">

       <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
          <LinearLayout
           android:gravity="center"
           android:background="@color/white"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:minHeight="@dimen/size100"
           android:orientation="vertical">

       </LinearLayout>
       <LinearLayout
           android:id="@+id/member_wallet_bank_item_unbind"
           android:layout_width="@dimen/size80"
           android:layout_height="match_parent"
           android:gravity="center"
           android:background="@color/red"
           android:orientation="vertical">
           <!--可自定义实现该布局-->
           <TextView
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:textSize="@dimen/size14"
               android:textColor="@color/white"
               android:text="解除绑定"/>
       </LinearLayout>
      </LinearLayout>
   </LinearLayout>
      
   
   /**\
     *  自定义长按回调接口\
     */
    public interface ItemLongClickListener {\
        /**
         * \
         * @param view\
         * @param position\
         * @param x 长按事件X轴坐标\
         * @param y 长按事件Y轴坐标\
         */\
        void onItemLongClick(View view, int position, float x, float y);\
    }
