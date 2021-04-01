package com.dahua.design.behavioral.mediator;

public class HU8778 extends Captain{

    public HU8778(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("HU8778请求起飞......");
        //问每个机长能否起飞？
        controlTower.acceptRequest(this,"fly");
    }

    @Override
    void land() {
        System.out.println("HU8778请求降落......");
        controlTower.acceptRequest(this,"land");
    }

    @Override
    void success() {
        System.out.println("完成......");
        controlTower.acceptRequest(this,"success");
    }
}
