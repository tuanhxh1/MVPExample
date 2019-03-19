package com.example.tuan.mvpexample.model.entity;

public class Demo {
    private String mMessage;

    public Demo(String mMessage) {
        this.mMessage = mMessage;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    @Override
    public String toString() {
        return "Demo{ " +
                "message='" + mMessage + '\'' +
                '}';
    }
}
