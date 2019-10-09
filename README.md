# slide
 仿QQ左滑删除，左滑按钮。
 ====================
 
 话不多说先上效果图：
  -----------------
 
 ![](https://raw.githubusercontent.com/myselyhero/slide/master/listview/src/main/res/drawable/effect_picture.png)  
 
 使用方法
 -------
    
 布局引用:\
  <com.clwl.commonality.view.MyListView\
      android:layout_width="match_parent"\
      android:layout_height="wrap_content"\
      android:divider="@color/theme_line"\
      android:dividerHeight="1px"\
      android:listSelector="#00000000"\
      app:right_width="@dimen/size80"/>//右边布局宽度
      
   
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
