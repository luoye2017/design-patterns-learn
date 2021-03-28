package com.dahua.design.structural.bridge;

public class HuaWeiPhone extends AbstractPhone{

    @Override
    public String getPhoneInfo() {
        return "华为手机:" + abstractSale.getSale();
    }
}
