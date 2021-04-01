package com.dahua.design.behavioral.state;

public class NormalState implements GameState{

    @Override
    public void playGame() {
        System.out.println("普通时刻，正常比赛");
    }

    @Override
    public GameState next() {
        return new BadState();
    }
}
