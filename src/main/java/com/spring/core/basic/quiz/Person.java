package com.spring.core.basic.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Person {

    private String name;
    private int age;

    /*
            싱글톤 패턴을 구현하는 방법
            1. 단 하나의 생성자를 만들고 private으로 제한한다.
     */
    private Person() {}
    /*
            2. 클래스 내부에서 단 하나의 객체를 생성한다.
     */
    //외부에서의 접근을 private으로 막고 static으로 유일성을 부여함.
    private static Person person = new Person();

    /*
            3. 미리 만들어둔 단 하나의 객체를 공개된 메서드를 통해 제공한다.
     */
    public static Person getInstance() {
        return person;
    }
}
