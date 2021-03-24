package com.dahua.design.creation.builder;

public class XiaomiPhoneBuilder extends AbstractPhoneBuilder{

    public XiaomiPhoneBuilder() {
//        phone = new Phone();
        phone = Phone.builder().build();
    }

    @Override
    AbstractPhoneBuilder createCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractPhoneBuilder createMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractPhoneBuilder createDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractPhoneBuilder createCam(String cam) {
        phone.cam = cam;
        return this;
    }
}
