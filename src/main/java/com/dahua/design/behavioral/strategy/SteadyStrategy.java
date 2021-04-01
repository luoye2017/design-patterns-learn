package com.dahua.design.behavioral.strategy;

public class SteadyStrategy implements GameStrategy{

    @Override
    public void warStrategy() {
        System.out.println("稳住，发育 不要浪");
    }
}
