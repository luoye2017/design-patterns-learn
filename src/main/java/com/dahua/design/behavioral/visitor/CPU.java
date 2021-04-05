package com.dahua.design.behavioral.visitor;

public class CPU extends Hardware {

    public CPU(String command) {
        super(command);
    }

    @Override
    public void setCommand(String command) {
        super.setCommand(command);
    }

    @Override
    void work() {
        System.out.println("CPU 工作：" + command);
    }

    @Override
    void acceptUpdate(Visitor visitor) {
        visitor.changeCPU(this);
    }
}
