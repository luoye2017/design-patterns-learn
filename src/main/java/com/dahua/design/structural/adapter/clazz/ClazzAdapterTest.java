package com.dahua.design.structural.adapter.clazz;

import com.dahua.design.structural.adapter.MoviePlayer;

public class ClazzAdapterTest {

    public static void main(String[] args) {
        // 正常
        MoviePlayer moviePlayer = new MoviePlayer();
        String content = moviePlayer.play();
        System.out.println(content);

        // 适配器
        UkMoviePlayerAdapter ukMoviePlayerAdapter = new UkMoviePlayerAdapter(moviePlayer);
        String ukContent = ukMoviePlayerAdapter.play();
        System.out.println(ukContent);
    }
}
