package com.gy.wyy.slide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.gy.wyy.slide.library.Vo;
import com.gy.wyy.slide.library.adapter.ListAdapter;
import com.gy.wyy.slide.library.view.MyListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;

    private MyListView listView;
    private ListAdapter adapter;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        initView();
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("立身作家读书，俱要有绳墨规矩，循之则终生无悔无尤。"+i);
        }

        adapter = new ListAdapter(this,list);
        listView.setAdapter(adapter);
        adapter.onItemReturnListener = new ListAdapter.OnItemReturnListener() {
            @Override
            public void onPostData(int position, int function) {
                switch (function){
                    case Vo.ITEMBACKGROUND://点击正文
                        Toast.makeText(context,list.get(position),Toast.LENGTH_SHORT).show();
                        break;
                    case Vo.SETTINGBACKGROUND://设置按钮
                        Toast.makeText(context,"设置按钮",Toast.LENGTH_SHORT).show();
                        break;
                    case Vo.DELETEBACKGROUND://删除
                        listView.resetState();
                        list.remove(position);
                        adapter.notifyDataSetChanged();
                        break;
                }
            }
        };
    }

    /**
     *  初始化控件
     */
    private void initView(){
        listView = findViewById(R.id.main_listView);
    }
}
