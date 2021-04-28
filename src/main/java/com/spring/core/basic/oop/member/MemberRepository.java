package com.spring.core.basic.oop.member;

//회원 저장소
public interface MemberRepository {

    //회원 가입 기능
    void save(Member member);

    //회원 조회 기능
    Member findById(Long memberId);

    //회원 탈퇴 기능
    Member removeById(Long memberId);

}
