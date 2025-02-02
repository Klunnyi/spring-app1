package ua.klunniy.springcourse.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    private String name;
    private final List<Music> music;

    //IoC
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        music.forEach((x) -> System.out.println("Playing " + x.getSong()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
