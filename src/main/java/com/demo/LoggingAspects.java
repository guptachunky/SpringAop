package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class LoggingAspects {


    @Before("execution(public * com.demo.test.*.*(..))")
    public void methodDetails(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Class[] arg = signature.getParameterTypes();
        for (int i = 0; i < arg.length; i++) {
            System.out.println("ARGUMENT " + i + "   " + arg[i]);
        }
        System.out.println(signature);
        System.out.println(method);
    }

    @Pointcut("within(com.demo.test.*)")
    public void pointCutAnnotation() {
//        System.out.println("pointCutAnnotation");
    }

    @Before("pointCutAnnotation()")
    public void pointCutMethod() {
        System.out.println("point cut method");
    }


    @Before("execution(public * com.demo.test.*.*(..))")
    public void beforeLogin() {
        System.out.println("Before login Aspects Service Method");
    }

    @After("execution(public * com.demo.test.*.*(..))")
    public void afterLogin() {
        System.out.println("After Login Aspects Service Method");
    }

    @AfterThrowing("within(com.demo.test.*)")
    public void exc() {
        System.out.println("exception thrown");
    }

    @After("@annotation(Deprecated)")
    public void deprecate() {
        System.out.println("Aftre deprecated Method");
    }

    @After("this(com.demo.test.Inter)")
    public void interfaceMethod() {
        System.out.println("this ");
    }

    @After("target(com.demo.test.Inter)")
    public void target() {
        System.out.println("target");
    }


}
