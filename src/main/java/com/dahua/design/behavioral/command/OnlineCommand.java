package com.dahua.design.behavioral.command;

public class OnlineCommand implements Command{

    private WfReceiver wfReceiver = new WfReceiver();

    @Override
    public void execute() {
        wfReceiver.online();
    }
}
