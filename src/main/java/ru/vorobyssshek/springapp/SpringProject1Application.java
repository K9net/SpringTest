package ru.vorobyssshek.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringProject1Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

    }


}
