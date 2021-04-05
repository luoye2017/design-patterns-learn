package com.dahua.design.behavioral.interpreter;

import java.util.Set;

public class TerminalExpression extends IDCardExpression{

    private Set<String> data;
    private String symbol;

    public TerminalExpression(Set<String> data, String symbol) {
        this.data = data;
        this.symbol = symbol;
    }

    @Override
    boolean interpreter(String expression) {
        String[] strings = expression.split(symbol);
        for (String string : strings) {
            if (data.contains(string)){
                return true;
            }
        }

        return false;
    }
}
