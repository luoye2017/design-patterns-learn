package com.dahua.design.behavioral.mediator;

public abstract class Captain {

    public ControlTower controlTower;

    abstract void fly();

    abstract void land();

    abstract void success();
}
