package com.dahua.design.behavioral.strategy;

public class MainTest {
    public static void main(String[] args) {
        TeamWf teamWf = new TeamWf();
        teamWf.setGameStrategy(new SteadyStrategy());
        teamWf.startGame();
    }
}
