package com.dahua.design.behavioral.memento;

public class MementoTest {

    public static void main(String[] args) {

        WfGamer wfGamer = new WfGamer();

        wfGamer.playGame();
        Integer recordId1 = wfGamer.saveGameRecord();
        System.out.println("第一次保存游戏记录 i:" + recordId1);

        wfGamer.playGame();
        Integer record2 = wfGamer.saveGameRecord();
        System.out.println("第二次保存游戏记录 i:" + record2);

        WfGamer fromGameRecord = wfGamer.getFromGameRecord(record2);
        System.out.println(fromGameRecord);
    }
}
