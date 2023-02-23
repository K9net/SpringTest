package ru.vorobyssshek.springapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("init method...");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("destroy method");
    }

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Classical music 111");
        songs.add("Classical music 222");
        songs.add("Classical music 333");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
