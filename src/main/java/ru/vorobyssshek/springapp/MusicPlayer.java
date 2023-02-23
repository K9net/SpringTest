package ru.vorobyssshek.springapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random r = new Random();
        int num = r.nextInt(musicList.size());
        int musicNum = r.nextInt(3);
        System.out.println(musicList.get(num).getSongs().get(musicNum));
    }
}
