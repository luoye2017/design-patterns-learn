package com.dahua.design.structural.adapter.clazz;

import com.dahua.design.structural.adapter.Player;
import com.dahua.design.structural.adapter.UkTranslate;

public class UkMoviePlayerAdapter extends UkTranslate implements Player {

    private Player player;

    public UkMoviePlayerAdapter(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        String content = player.play();
        String translate = translate(content);

        return translate;
    }
}
