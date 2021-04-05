package com.dahua.design.behavioral.memento;

import org.apache.commons.beanutils.BeanUtils;

import java.util.HashMap;
import java.util.Map;

public class GameServer {

    Map<Integer, GameRecord> recordMap = new HashMap<>();

    private int i = 1;

    Integer add(GameRecord gameRecord){
        gameRecord.setId(i++);
        recordMap.put(gameRecord.getId(), gameRecord);
        return gameRecord.getId();
    }

    WfGamer getRecord(Integer id){
        GameRecord gameRecord = recordMap.get(id);

        WfGamer wfGamer = new WfGamer();
        try {
            BeanUtils.copyProperties(wfGamer,gameRecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wfGamer;
    }
}
