package com.dahua.design.structural.bridge;

public abstract class AbstractSale {

    private String price;

    private String way;

    public AbstractSale(String price, String way) {
        this.price = price;
        this.way = way;
    }

    public String getSale(){
        return "渠道: " + way + " 售价: " + price;
    }
}
