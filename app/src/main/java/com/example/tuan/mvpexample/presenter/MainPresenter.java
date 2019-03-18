package com.example.tuan.mvpexample.presenter;

import com.example.tuan.mvpexample.model.LoadDemoListener;
import com.example.tuan.mvpexample.model.UserInterator;
import com.example.tuan.mvpexample.model.entity.Demo;
import com.example.tuan.mvpexample.view.MainView;

import java.util.List;

public class MainPresenter implements LoadDemoListener {
    private UserInterator mMainInterator;
    private MainView mMainView;

    public MainPresenter(MainView mainView) {
        mMainInterator = new UserInterator(this);
        mMainView = mainView;
    }

    public void loadData() {
        mMainInterator.createListData();
    }

    @Override
    public void onLoadDemoSuccess(List<Demo> listDemo) {
        mMainView.displayMain(listDemo);
    }

    @Override
    public void onLoadDemoFailure(String message) {

    }
}
