package com.spring.core.basic.oop.member;

import lombok.*;

//회원 정보 도메인 클래스 : 엔터티 클래스, VO(Value Object)클래스
@Getter @Setter
@AllArgsConstructor //생성자 생성
@NoArgsConstructor //기본 생성자 없애기
@ToString

public class Member {

    private long id; //회원 식별코드
    private String name; //회원명
    private Grade grade; //회원등급

    //자바 빈즈 규약
    /*
        1. 기본 생성자
        2. 파라미터 초기화 생성자
        3. Setter 및 Getter
    */

}
