package com.tencent.qcloud.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import co.lujun.androidtagview.TagContainerLayout;
import co.lujun.androidtagview.TagView;

public class MainActivity extends AppCompatActivity implements TagView.OnTagClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> tags=new ArrayList<>();
        tags.add("123");
        tags.add("123gewgwe");
        tags.add("123gwegweg");
        tags.add("123arharhhr");
        tags.add("123hreahearhareg");
        tags.add("1230000lhioh");

        TagContainerLayout mTagContainerLayout = (TagContainerLayout) findViewById(R.id.tag);
        mTagContainerLayout.setOnTagClickListener(this);
        mTagContainerLayout.setTags(tags);
    }


    @Override
    public void onTagClick(int position, String text) {
        System.out.println("111111");
    }

    @Override
    public void onTagLongClick(int position, String text) {
        System.out.println("2222222222");

    }

    @Override
    public void onTagCrossClick(int position) {
        System.out.println("333333333");


    }
}
