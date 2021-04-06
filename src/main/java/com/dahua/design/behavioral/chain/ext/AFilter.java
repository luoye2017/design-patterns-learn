package com.dahua.design.behavioral.chain.ext;

public class AFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("A 进入之前");
        chain.doFilter(request,response,chain);
        System.out.println("A 进入之后");
    }
}
