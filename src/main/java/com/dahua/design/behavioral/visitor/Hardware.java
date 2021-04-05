package com.dahua.design.behavioral.visitor;

public abstract class Hardware {

    String command;

    public Hardware(String command) {
        this.command = command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    abstract void work();

    abstract void acceptUpdate(Visitor visitor);
}
