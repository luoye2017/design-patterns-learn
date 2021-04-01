package com.dahua.design.behavioral.state;

public class StateTest {

    public static void main(String[] args) {
        TeamWf teamWf = new TeamWf();
        teamWf.setGameState(new GoodState());
        teamWf.playGame();

        teamWf.nextState();
        teamWf.playGame();

        teamWf.nextState();
        teamWf.playGame();
    }
}
