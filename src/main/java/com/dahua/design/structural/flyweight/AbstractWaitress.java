package com.dahua.design.structural.flyweight;

public abstract class AbstractWaitress {

    protected boolean enableService = true;

    abstract void service();

    abstract void end();

    protected boolean getEnableService(){
        return enableService;
    }
}
