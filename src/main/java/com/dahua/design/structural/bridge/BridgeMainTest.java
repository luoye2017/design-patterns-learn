package com.dahua.design.structural.bridge;

public class BridgeMainTest {

    public static void main(String[] args) {
        HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
        huaWeiPhone.setSale(new OfflineSale("99","线下"));
        System.out.println(huaWeiPhone.getPhoneInfo());

        huaWeiPhone.setSale(new OnlineSale("200","线上"));
        System.out.println(huaWeiPhone.getPhoneInfo());

        XiaoMiPhone xiaoMiPhone = new XiaoMiPhone();
        xiaoMiPhone.setSale(new OfflineSale("565","线下"));
        System.out.println(xiaoMiPhone.getPhoneInfo());

        xiaoMiPhone.setSale(new OnlineSale("1565","线上"));
        System.out.println(xiaoMiPhone.getPhoneInfo());

    }
}
