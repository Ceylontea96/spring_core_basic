package com.spring.core.basic.quiz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personTest() {

        Person kim = Person.getInstance();
        Person park = Person.getInstance();

        System.out.println(kim);
        System.out.println(park);

        kim.setName("김철수");

        System.out.println(kim.getName());
        System.out.println(park.getName());
    }

}