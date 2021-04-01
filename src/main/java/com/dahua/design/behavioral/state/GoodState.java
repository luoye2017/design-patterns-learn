package com.dahua.design.behavioral.state;

public class GoodState implements GameState{

    @Override
    public void playGame() {
        System.out.println("巅峰时刻，全力比赛");
    }

    @Override
    public GameState next() {
        return new NormalState();
    }
}
