package com.dahua.design.behavioral.visitor;

public class Disk extends Hardware{

    public Disk(String command) {
        super(command);
    }

    @Override
    public void setCommand(String command) {
        super.setCommand(command);
    }

    @Override
    void work() {
        System.out.println("硬盘工作：" + command);
    }

    @Override
    void acceptUpdate(Visitor visitor) {
        visitor.changeDisk(this);
    }
}
