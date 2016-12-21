package com.leo.xutil3demo;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;



import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {

//    @ViewInject(R.id.collapsing_toolbar)
//    CollapsingToolbarLayout toolbar;

    @ViewInject(R.id.rv_chat_list)
    RecyclerView rvChatList;

    private List<String> mDatas;
    private MyRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initView();
    }


    private void initView() {
          setTitle("Chats");
//        toolbar.setTitle("Chats");
        rvChatList.setLayoutManager(new LinearLayoutManager(this));
        rvChatList.addItemDecoration(new com.leo.xutil3demo.DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        mAdapter = new MyRecyclerAdapter(this,mDatas);
        rvChatList.setAdapter(mAdapter);
    }

    private void initData() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            mDatas.add("" + (char) i);
        }
    }
}
