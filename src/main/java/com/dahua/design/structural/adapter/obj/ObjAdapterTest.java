package com.dahua.design.structural.adapter.obj;

import com.dahua.design.structural.adapter.MoviePlayer;

public class ObjAdapterTest {

    public static void main(String[] args) {
        MoviePlayer moviePlayer = new MoviePlayer();
        String content = moviePlayer.play();
        System.out.println(content);

        UkObjectMoviePlayerAdapter adapter = new UkObjectMoviePlayerAdapter(moviePlayer);
        String ukContent = adapter.play();
        System.out.println(ukContent);

    }
}
