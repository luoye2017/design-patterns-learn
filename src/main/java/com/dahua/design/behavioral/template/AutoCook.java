package com.dahua.design.behavioral.template;

public class AutoCook extends CookTemplate{

    @Override
    public void addFood() {
        System.out.println("添加鸡肉");
    }

    @Override
    public void addSalt() {
        System.out.println("添加大量的盐");
    }
}
