package com.dahua.design.behavioral.state;

public interface GameState {
    void playGame();
    GameState next();
}
