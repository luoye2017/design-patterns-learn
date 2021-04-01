package com.dahua.design.behavioral.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();
        HU8778 hu8778 = new HU8778(controlTower);
        SC8633 sc8633 = new SC8633(controlTower);

        hu8778.fly();
        sc8633.fly();
        hu8778.success();
        sc8633.fly();

    }
}
