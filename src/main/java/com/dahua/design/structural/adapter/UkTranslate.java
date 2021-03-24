package com.dahua.design.structural.adapter;

public class UkTranslate implements Translate{
    @Override
    public String translate(String content) {
        if (content.equals("你好")){
            return "hello world";
        }

        return "unknown";
    }
}
