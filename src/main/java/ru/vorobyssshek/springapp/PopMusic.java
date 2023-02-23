package ru.vorobyssshek.springapp;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Pop music 111");
        songs.add("Pop music 222");
        songs.add("Pop music 333");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
