package com.dahua.design.behavioral.state;

public class TeamWf {

    private GameState gameState;

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public void playGame(){
        gameState.playGame();
    }

    public void nextState(){
        gameState = gameState.next();
    }
}
