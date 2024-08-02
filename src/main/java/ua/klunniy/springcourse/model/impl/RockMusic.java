package ua.klunniy.springcourse.model.impl;

import ua.klunniy.springcourse.model.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
