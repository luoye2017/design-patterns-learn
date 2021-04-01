package com.dahua.design.behavioral.obsever;

import java.util.ArrayList;
import java.util.List;

public class MMTiktok extends AbstractTiktok{

    private List<AbstractFans> fansList = new ArrayList<>();

    public void startSell(){
        System.out.println("开启直播间");
        notifyFans("开始卖货了，好物快来");
    }

    public void endSell(){
        notifyFans("今天就到这里");
        System.out.println("直播间关闭");
    }

    @Override
    void addFans(AbstractFans fans) {
        fansList.add(fans);
    }

    @Override
    void notifyFans(String message) {
        for (AbstractFans abstractFans : fansList) {
            abstractFans.acceptMsg(message);
        }
    }
}
