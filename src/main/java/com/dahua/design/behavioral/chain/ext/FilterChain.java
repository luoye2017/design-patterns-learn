package com.dahua.design.behavioral.chain.ext;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    private List<Filter> filterList = new ArrayList<>();

    private TargetMethod targetMethod;

    int cursor = 0;

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    public void setTargetMethod(TargetMethod targetMethod) {
        this.targetMethod = targetMethod;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (cursor < filterList.size()){
            Filter filter = filterList.get(cursor);
            cursor++;
            filter.doFilter(request,response,chain);
        }else {
            targetMethod.helloWorld();
        }

    }
}
