package com.dahua.design.structural.flyweight;

import lombok.Data;

@Data
public class BeautifulWaitress extends AbstractWaitress{

    private String id;

    private String name;

    public BeautifulWaitress(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    void service() {
        System.out.println(name + " 开始服务");
        enableService = false;
    }

    @Override
    void end() {
        System.out.println(name + " 服务结束");
        enableService = true;
    }
}
