package com.demo;

import com.demo.test.LoginClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.demo")
@EnableAspectJAutoProxy
public class SpringConfig{


}
