package ua.klunniy.springcourse.model.impl;

import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.model.Music;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
