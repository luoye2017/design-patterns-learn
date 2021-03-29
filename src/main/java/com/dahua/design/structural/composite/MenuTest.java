package com.dahua.design.structural.composite;

public class MenuTest {

    public static void main(String[] args) {
        Menu root = new Menu(1, "系统管理");
        Menu 角色管理 = new Menu(2, "角色管理");
        root.addChild(角色管理);
        角色管理.addChild(new Menu(6,"固定角色"));
        角色管理.addChild(new Menu(7,"临时授予"));


        Menu 用户管理 = new Menu(3, "用户管理");
        root.addChild(用户管理);


        用户管理.addChild(new Menu(4,"临时用户"));
        用户管理.addChild(new Menu(5,"注册用户"));


        //按照不同层级展示
        root.printMenu();
    }
}
