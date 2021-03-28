package com.dahua.design.structural.bridge;

public abstract class AbstractPhone {

    protected AbstractSale abstractSale;

    public abstract String getPhoneInfo();

    public void setSale(AbstractSale sale){
        this.abstractSale = sale;
    }

}
