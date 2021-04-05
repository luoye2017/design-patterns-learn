package com.dahua.design.behavioral.interpreter;

public class OrExpression extends IDCardExpression{

    private IDCardExpression cityInterpreter;

    private IDCardExpression typeInterpreter;

    public OrExpression(IDCardExpression cityInterpreter, IDCardExpression typeInterpreter) {
        this.cityInterpreter = cityInterpreter;
        this.typeInterpreter = typeInterpreter;
    }

    @Override
    boolean interpreter(String expression) {
        return cityInterpreter.interpreter(expression) | typeInterpreter.interpreter(expression);
    }
}
