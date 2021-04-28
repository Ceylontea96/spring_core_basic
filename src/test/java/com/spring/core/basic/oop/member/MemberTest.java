package com.spring.core.basic.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void lombokTest() {
        Member member = new Member(1L, "김철수", Grade.BASIC);
        member.getName();
        member.getGrade();

        System.out.println("member = " + member);
    }

}