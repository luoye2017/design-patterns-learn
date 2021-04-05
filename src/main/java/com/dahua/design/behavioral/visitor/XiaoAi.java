package com.dahua.design.behavioral.visitor;

public class XiaoAi {

    private CPU cpu = new CPU("");
    private Disk disk = new Disk("");

    public void setCommand(String command){
        cpu.setCommand(command);
        disk.setCommand(command);
    }

    public void answerQuestion(){
        cpu.work();
        disk.work();
    }

    public void acceptUpgrade(Visitor visitor){
        cpu.acceptUpdate(visitor);
        disk.acceptUpdate(visitor);
    }
}
