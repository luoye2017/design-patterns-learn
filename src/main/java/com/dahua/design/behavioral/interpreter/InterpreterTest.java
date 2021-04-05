package com.dahua.design.behavioral.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {

        Area area = new Area();
        area.getTicket("上海市:张文宏-医生");
        area.getTicket("武汉市:雷丰阳-程序员");
        area.getTicket("北京市:宋宋-老人");
    }
}
