package com.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ApplicationMain {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/services.xml","/spring/daos.xml");
//        System.out.println(context.getBean("accountDao"));
        SpringApplication.run(ApplicationMain.class,args);


    }

}
