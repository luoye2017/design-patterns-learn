package com.dahua.design.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {

    private int id;
    private String name;

    public Menu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private List<Menu> childMenuList = new ArrayList<>();

    public void addChild(Menu childMenu) {
        childMenuList.add(childMenu);
    }

    public void printMenu() {
        System.out.println(name);
        if (childMenuList.size() > 0) {
            for (Menu menu : childMenuList) {
                menu.printMenu();
            }
        }
    }
}
