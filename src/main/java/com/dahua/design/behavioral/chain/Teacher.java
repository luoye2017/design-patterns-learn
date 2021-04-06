package com.dahua.design.behavioral.chain;

public class Teacher {

    private String name;

    private Teacher nextTeacher;

    public void setNextTeacher(Teacher nextTeacher) {
        this.nextTeacher = nextTeacher;
    }

    public void handlerRequest(){
        System.out.println(this + " 正在处理....");
        if (nextTeacher != null) {
            nextTeacher.handlerRequest();
        }
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

}
