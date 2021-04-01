package com.dahua.design.behavioral.strategy;

public class TeamWf {

    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void startGame(){
        System.out.println("游戏开始....");
        gameStrategy.warStrategy();
        System.out.println("win.....");
    }
}
