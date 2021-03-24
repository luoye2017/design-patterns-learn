package com.dahua.design.structural.adapter.obj;

import com.dahua.design.structural.adapter.Player;
import com.dahua.design.structural.adapter.Translate;
import com.dahua.design.structural.adapter.UkTranslate;

public class UkObjectMoviePlayerAdapter implements Player {

    private Player player;

    private Translate translate = new UkTranslate();

    public UkObjectMoviePlayerAdapter(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        String content = player.play();
        String translate = this.translate.translate(content);
        return translate;
    }
}
