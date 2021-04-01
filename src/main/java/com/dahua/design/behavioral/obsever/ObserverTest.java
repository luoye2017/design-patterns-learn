package com.dahua.design.behavioral.obsever;

public class ObserverTest {

    public static void main(String[] args) {
        MMTiktok mmTiktok = new MMTiktok();
        PersonFans personFans = new PersonFans();
        personFans.follow(mmTiktok);
        RobotFans robotFans = new RobotFans();
        robotFans.follow(mmTiktok);

        mmTiktok.startSell();
        System.out.println("===========================");
        mmTiktok.endSell();
    }
}
