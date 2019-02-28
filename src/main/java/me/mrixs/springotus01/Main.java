package me.mrixs.springotus01;

import me.mrixs.springotus01.services.TestingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        TestingService testingService = context.getBean(TestingService.class);
        testingService.start();
    }
}
