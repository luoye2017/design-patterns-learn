package com.dahua.design.behavioral.chain;

public class chainTest {
    public static void main(String[] args) {
        Teacher zhangsan = new Teacher("zhangsan");
        Teacher lisi = new Teacher("lisi");
        Teacher wangwu = new Teacher("wangwu");

        zhangsan.setNextTeacher(lisi);
        lisi.setNextTeacher(wangwu);

        zhangsan.handlerRequest();
    }
}
