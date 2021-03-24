package com.dahua.design.creation.builder;

import lombok.Builder;

@Builder
public class Phone {
    protected String cpu;

    protected String mem;

    protected String disk;

    protected String cam;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }
}
