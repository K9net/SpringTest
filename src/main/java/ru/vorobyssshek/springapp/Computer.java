package ru.vorobyssshek.springapp;




public class Computer {
    private Integer id;
    private MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

}
