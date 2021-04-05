package com.dahua.design.behavioral.visitor;

public class UpgradeVisitor implements Visitor {

    @Override
    public void changeCPU(CPU cpu) {
        cpu.command += " 正在联网";
    }

    @Override
    public void changeDisk(Disk disk) {
        disk.command += " 正在联网";
    }
}
