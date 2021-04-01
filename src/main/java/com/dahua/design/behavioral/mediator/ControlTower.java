package com.dahua.design.behavioral.mediator;

public class ControlTower {

    private boolean enable = true;

    public void acceptRequest(Captain captain, String action) {
        if (action.equals("fly") || action.equals("land")) {
            if (enable == true) {
                System.out.println("运行起飞");
                enable = false;
            } else {
                System.out.println("不允许起飞");
            }
        }
        if ("success".equals(action)){
            enable = true;
        }
    }
}
