package ru.vorobyssshek.springapp;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Initialization...");
    }

    public void doMyDestroy(){
        System.out.println("Destroying...");
    }
    @Override
    public String getSong() {
        return "Classical music";
    }
}
