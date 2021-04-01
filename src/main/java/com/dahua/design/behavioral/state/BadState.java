package com.dahua.design.behavioral.state;

public class BadState implements GameState{
    @Override
    public void playGame() {
        System.out.println("消极时刻，无心比赛");
    }

    @Override
    public GameState next() {
        return new GoodState();
    }
}
