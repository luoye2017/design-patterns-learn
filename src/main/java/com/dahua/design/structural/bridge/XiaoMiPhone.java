package com.dahua.design.structural.bridge;

public class XiaoMiPhone extends AbstractPhone{


    @Override
    public String getPhoneInfo() {
        return "小米手机: " + abstractSale.getSale();
    }
}
