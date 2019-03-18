package com.example.tuan.mvpexample.model;

import com.example.tuan.mvpexample.model.entity.Demo;

import java.util.List;

public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> listDemo);

    void onLoadDemoFailure(String message);
}
