package com.dahua.design.behavioral.interpreter;

import java.util.HashSet;
import java.util.Set;

public class Area {

    Set<String> city = new HashSet<String>(){{add("武汉市");add("上海市");}};

    Set<String> type = new HashSet<String>(){{add("医生");add("老人");add("儿童");}};

    private IDCardExpression idCardExpression;

    public Area() {

        TerminalExpression cityInterpreter = new TerminalExpression(city, ":");
        TerminalExpression typeInterpreter = new TerminalExpression(type, "-");

        idCardExpression = new OrExpression(cityInterpreter, typeInterpreter);
    }

    void getTicket(String expression){
        boolean interpreter = idCardExpression.interpreter(expression);
        if (interpreter){
            System.out.println("恭喜你，可以免票");
        }else {
            System.out.println("对不起，请购票");
        }
    }
}
