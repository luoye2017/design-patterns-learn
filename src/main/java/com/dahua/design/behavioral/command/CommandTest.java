package com.dahua.design.behavioral.command;

public class CommandTest {

    public static void main(String[] args) {
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.setCommand(new OnlineCommand());
        commandInvoker.call();

        commandInvoker.setCommand(new TravelCommand());
        commandInvoker.call();
    }
}
