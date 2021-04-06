package com.dahua.design.behavioral.chain.ext;

public class Request {

    private String reqMsg;

    public Request(String reqMsg) {
        this.reqMsg = reqMsg;
    }

    public String getReqMsg() {
        return reqMsg;
    }

    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg;
    }
}
