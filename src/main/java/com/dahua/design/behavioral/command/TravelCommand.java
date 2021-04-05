package com.dahua.design.behavioral.command;

public class TravelCommand implements Command{

    private WfReceiver  wfReceiver = new WfReceiver();

    @Override
    public void execute() {
        wfReceiver.travel();
    }
}
