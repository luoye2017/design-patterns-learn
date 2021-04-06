package com.dahua.design.behavioral.chain.ext;

public class CFilter implements Filter{

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("C 进入之前");
        chain.doFilter(request,response,chain);
        System.out.println("C 进入之后");
    }
}
