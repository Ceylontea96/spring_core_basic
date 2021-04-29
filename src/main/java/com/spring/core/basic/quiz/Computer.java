package com.spring.core.basic.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final Monitor monitor;
    private final Keyboard keyboard;
    private final Mouse mouse;

    @Autowired
    public Computer(
            @Qualifier("appleMonitor") Monitor monitor,
            @Qualifier("samsungKeyboard") Keyboard keyboard,
            @Qualifier("lgMouse") Mouse mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void info() {
        System.out.println("컴퓨터 정보를 출력합니다.");
        monitor.info();
        keyboard.info();
        mouse.info();

    }
}
