package ua.klunniy.springcourse.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TestBean {

    @Value("${testBean.name}")
    private String name;

    @PostConstruct
    private void doInitMethod() {
        System.out.println("TestBean doInitMethod");
    }

    @PreDestroy
    private void doDestroyMethod() {
        System.out.println("TestBean doDestroyMethod");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
