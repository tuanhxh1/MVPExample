package com.example.tuan.mvpexample.model;

import com.example.tuan.mvpexample.model.entity.Demo;
import java.util.ArrayList;
import java.util.List;

public class UserInterator {
    private LoadDemoListener mListener;

    public UserInterator(LoadDemoListener listener) {
        mListener = listener;
    }
    public void createListData(){
        List<Demo> listDemo = new ArrayList<>();
        for(int i =0; i<=10;i++){
            Demo demo = new Demo("I'm a developer");
            listDemo.add(demo);
        }
        mListener.onLoadDemoSuccess(listDemo);
    }
}
