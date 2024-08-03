package ua.klunniy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.springcourse.model.MusicPlayer;
import ua.klunniy.springcourse.model.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        context.close();
    }
}
