package com.example.springapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

        // Computer computer = context.getBean("computer", Computer.class);
        // System.out.println(computer);
        
        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // musicPlayer.playMusic();

        // Music music = context.getBean("rockMusic", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);
        // musicPlayer.playMusic();

        // Music music2 = context.getBean("classicalMusic", Music.class);
        // MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        // classicalMusicPlayer.playMusic();
        // context.close();

        // ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        // System.out.println(classicalMusic.getSong());
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);
        // MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // firstMusicPlayer.playMusic();

        // boolean comparasion = firstMusicPlayer == secondMusicPlayer;

        // System.out.println(comparasion);
        // System.out.println(firstMusicPlayer);
        // System.out.println(secondMusicPlayer);

        // firstMusicPlayer.setVolume(10);

        // System.out.println(firstMusicPlayer.getVolume());
        // System.out.println(secondMusicPlayer.getVolume());
        // System.out.println(firstMusicPlayer.getName());
        // System.out.println(firstMusicPlayer.getVolume());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        context.close();
    }
}