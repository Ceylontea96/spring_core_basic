package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Hotel {

//    @Autowired //필드주입
    private final Restaurant restaurant;


    //@Autowired //Spring5 부터는 생성자가 하나면 Autowired를 안써줘도 됨
    /*public Hotel(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/


    /*@Autowired
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }*/

    //레스토랑 예약기능
    public void reserveRestaurant() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }



}
