package com.spring.core.basic.oop.config;


import com.spring.core.basic.oop.discount.DiscountPolicy;
import com.spring.core.basic.oop.discount.FixDiscountPolicy;
import com.spring.core.basic.oop.discount.RateDiscountPolicy;
import com.spring.core.basic.oop.member.MemberRepository;
import com.spring.core.basic.oop.member.MemberService;
import com.spring.core.basic.oop.member.MemberServiceImpl;
import com.spring.core.basic.oop.member.MemoryMemberRepository;
import com.spring.core.basic.oop.order.OrderService;
import com.spring.core.basic.oop.order.OrderServiceImpl;

//객체를 생성하고 필요에 맞게 주입하는 클래스
public class AppConfig {

    //회원 저장소 결정
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    //할인 정책 결정
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    //OrderServiceImpl에 저장소 주입
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }

    //
    public MemberService memberService() {
        return new MemberServiceImpl(
                memberRepository()
        );
    }
}
