package com.dahua.design.behavioral.template;

/**
 * The type Cook template.
 */
public abstract class CookTemplate {

    /**
     * 定义算法：定义好了模板
     * 父类可以实现某些步骤
     * 留关键步骤给子类实现
     */
    public void cook(){
        heating();
        addFood();
        addSalt();
        stirFry();
        end();
    }

    /**
     * Heating. 加热方法
     */
    public void heating(){
        System.out.println("开火...");
    };

    /**
     * Add food. 添加食物
     *
     */
    public abstract void addFood();

    /**
     * Add salt. 加盐
     */
    public abstract void addSalt();

    /**
     * Stir fry.翻炒
     */
    public  void stirFry(){
        System.out.println("翻炒中...");
    };

    /**
     * End.出锅
     */
    public  void end(){
        System.out.println("出锅....");
    };
}
