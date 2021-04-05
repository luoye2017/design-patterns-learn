package com.dahua.design.behavioral.iterator;

public class IteratorTest {

    public static void main(String[] args) {
        WF wf = new WF();

        wf.addGirlFriend("小花");
        wf.addGirlFriend("小佳");
        wf.addGirlFriend("小倩");

        BeautifulMan.Itr iterator = wf.getIterator();
        String name1 = iterator.currentGirlFriend();
        System.out.println("wf 当前女友 " + name1);

        String name2 = iterator.firstGirlFriend();
        System.out.println("wf 初恋女友 " + name2);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
