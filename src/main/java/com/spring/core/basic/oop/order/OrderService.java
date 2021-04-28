package com.spring.core.basic.oop.order;

//주문을 생성하는 역할
public interface OrderService {

    //주문 생성
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
