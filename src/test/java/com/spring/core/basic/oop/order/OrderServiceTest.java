package com.spring.core.basic.oop.order;

import com.spring.core.basic.oop.config.AppConfig;
import com.spring.core.basic.oop.member.Grade;
import com.spring.core.basic.oop.member.Member;
import com.spring.core.basic.oop.member.MemberService;
import com.spring.core.basic.oop.member.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    AppConfig ac = new AppConfig();

    MemberService memberService = ac.memberService();
    OrderService orderService = ac.orderService();

    @Test
    void serviceTest() {

        ////////////////////////////// 회원 로직 /////////////////////////////////////////
        Member member1 = new Member(1L, "박영희", Grade.VIP);
        Member member2 = new Member(2L, "김철수", Grade.BASIC);

        memberService.join(member1);
        memberService.join(member2);

        /////////////////////////////// 주문 로직 ////////////////////////////////////////
        Order order1 = orderService.createOrder(1L, "키보드", 15000);
        Order order2 = orderService.createOrder(2L, "키보드", 15000);

        int payAmount1 = order1.calcFinalPrice();
        int payAmount2 = order2.calcFinalPrice();

        // 1번 주문의 최종 결제액은 27000원일것이라고 단언한다.
        assertEquals(payAmount1, 12000);
        // 2번 주문의 최종 결제액은 30000원일것이라고 단언한다.
        assertEquals(payAmount2, 15000);

    }


}