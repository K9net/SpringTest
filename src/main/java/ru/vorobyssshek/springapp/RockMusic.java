package ru.vorobyssshek.springapp;


import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();
    {
        songs.add("RockMusic 111");
        songs.add("RockMusic 222");
        songs.add("RockMusic 333");
    }
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
