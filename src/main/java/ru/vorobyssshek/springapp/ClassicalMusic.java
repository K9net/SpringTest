package ru.vorobyssshek.springapp;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical music";
    }
}
