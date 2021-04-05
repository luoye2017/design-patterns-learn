package com.dahua.design.behavioral.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Random;

@Data
public class WfGamer {

    private Integer hp;

    private Integer mp;

    private Integer coin;

    private Integer level;

    GameServer gameServer = new GameServer();


    Integer saveGameRecord(){
        System.out.println("开始保存游戏记录...");
        GameRecord gameRecord = new GameRecord();
        try {
            BeanUtils.copyProperties(gameRecord, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(gameRecord);
        return gameServer.add(gameRecord);
    }

    void playGame(){
        System.out.println("开始玩游戏");
        int num = new Random().nextInt();
        hp = num;
        mp = num;
        coin = num;
        level = num;
    }

    WfGamer getFromGameRecord(int i){
        WfGamer record = gameServer.getRecord(i);
        return record;
    }
}
