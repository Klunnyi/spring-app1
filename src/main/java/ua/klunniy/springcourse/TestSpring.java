package ua.klunniy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.springcourse.model.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer testBean = context.getBean("musicPlayer", MusicPlayer.class);

        testBean.playMusic();
        System.out.println(testBean.getName());
        context.close();
    }
}
