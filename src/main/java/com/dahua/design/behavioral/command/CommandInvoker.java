package com.dahua.design.behavioral.command;

public class CommandInvoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
