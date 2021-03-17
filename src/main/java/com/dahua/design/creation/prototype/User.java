package com.dahua.design.creation.prototype;

public class User implements Cloneable{

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return super.clone();
    }
}
