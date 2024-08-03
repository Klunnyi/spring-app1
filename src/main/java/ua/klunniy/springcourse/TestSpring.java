package ua.klunniy.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.klunniy.springcourse.config.SpringConfig;
import ua.klunniy.springcourse.model.TestBean;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
