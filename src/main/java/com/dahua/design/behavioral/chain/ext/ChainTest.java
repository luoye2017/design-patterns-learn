package com.dahua.design.behavioral.chain.ext;

public class ChainTest {

    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();

        filterChain.addFilter(new AFilter());
        filterChain.addFilter(new BFilter());
        filterChain.addFilter(new CFilter());

        filterChain.setTargetMethod(new TargetMethod());

        filterChain.doFilter(new Request("request"),new Response("response"),filterChain);
    }
}
