package com.gy.wyy.slide.library.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gy.wyy.slide.library.R;
import com.gy.wyy.slide.library.Vo;

import java.util.List;

/**
 *
 */
public class ListAdapter extends BaseAdapter {

    private Context context;
    private List<String> list;
    //点击事件回调
    public OnItemReturnListener onItemReturnListener;

    /**
     *
     * @param context
     * @param list
     */
    public ListAdapter(Context context,List<String> list){
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.background = convertView.findViewById(R.id.list_item_background);
            viewHolder.tv_title = convertView.findViewById(R.id.list_item_preach);
            viewHolder.setting = convertView.findViewById(R.id.list_item_set);
            viewHolder.delete = convertView.findViewById(R.id.list_item_del);
            convertView.setTag(viewHolder);
        } else {// 有直接获得ViewHolder
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tv_title.setText(list.get(position));
        viewHolder.background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemReturnListener != null){
                    onItemReturnListener.onPostData(position,Vo.ITEMBACKGROUND);
                }
            }
        });
        viewHolder.setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemReturnListener != null){
                    onItemReturnListener.onPostData(position,Vo.SETTINGBACKGROUND);
                }
            }
        });
        viewHolder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemReturnListener != null){
                    onItemReturnListener.onPostData(position,Vo.DELETEBACKGROUND);
                }
            }
        });

        return convertView;
    }

    /**
     *
     */
    private class ViewHolder {
        LinearLayout background;
        TextView tv_title;
        TextView setting,delete;
    }

    /**
     *  item回调
     */
    public interface OnItemReturnListener{

        /**
         *
         * @param position
         * @param function
         */
        void onPostData(int position,int function);
    }
}
