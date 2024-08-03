package ua.klunniy.springcourse.model.impl;

import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.model.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @PostConstruct
    private void doInitMethod() {
        System.out.println("ClassicalMusic doInitMethod");
    }

    @PreDestroy
    private void doDestroyMethod() {
        System.out.println("ClassicalMusic doDestroyMethod");
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("!!!!!!!!");
        return new ClassicalMusic();
    }
}
