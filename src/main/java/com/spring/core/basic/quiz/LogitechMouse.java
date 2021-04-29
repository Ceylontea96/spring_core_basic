package com.spring.core.basic.quiz;

import org.springframework.stereotype.Component;

@Component("logitechMouse")
public class LogitechMouse implements Mouse{

    @Override
    public void info() {
        System.out.println("로지텍 마우스!");
    }
}
