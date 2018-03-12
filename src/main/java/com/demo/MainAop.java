package com.demo;

import com.demo.test.LoginClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainAop {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        LoginClass loginClass=(LoginClass)applicationContext.getBean("loginClass");
        loginClass.login(1,2);
//        loginClass.deprecated();
//        loginClass.throwsException();
    }
}
