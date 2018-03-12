package com.demo.test;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LoginClass{

    public void login(int a,int b) {
        System.out.println("========  Login MEthod of Login Class =========");
    }


    public void throwsException() throws IOException {
        System.out.println("This method throws Exception");
        throw new IOException();
    }

    @Deprecated
    public void deprecated() {
        System.out.println("Deprecated method");
    }

}
