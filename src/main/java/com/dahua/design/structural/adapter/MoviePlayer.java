package com.dahua.design.structural.adapter;

public class MoviePlayer implements Player{

    @Override
    public String play() {
        String content = "你好";
        return content;
    }
}
