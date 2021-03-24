package com.dahua.design.creation.builder;

public abstract class AbstractPhoneBuilder {

    protected Phone phone;

    abstract AbstractPhoneBuilder createCpu(String cpu);
    abstract AbstractPhoneBuilder createMem(String mem);
    abstract AbstractPhoneBuilder createDisk(String disk);
    abstract AbstractPhoneBuilder createCam(String cam);

    public Phone build(){
        return phone;
    }
}
