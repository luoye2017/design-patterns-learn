package com.dahua.design.creation.builder;

public class BuilderMainTest {

    public static void main(String[] args) {

        // 简单构造者
//        XiaomiPhoneBuilder builder = new XiaomiPhoneBuilder();
//        builder.createCpu("888");
//        builder.createCam("8G");
//        builder.createDisk("256G");
//        builder.createCam("1亿");
//        Phone phone = builder.build();
//        System.out.println(phone);

        // 链式构造者
//        Phone phone = new XiaomiPhoneBuilder().createCpu("888")
//                .createMem("8G")
//                .createDisk("256G")
//                .createCam("1亿")
//                .build();
//        System.out.println(phone);

        // Lombok @Builder注解
        Phone phone = Phone.builder()
                .cpu("888")
                .cam("1亿")
                .disk("256G")
                .mem("8G")
                .build();

        System.out.println(phone);
    }
}
