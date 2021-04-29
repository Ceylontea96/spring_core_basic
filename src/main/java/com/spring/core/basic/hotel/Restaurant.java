package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor //final이 붙은 chef를 초기회해주는 생성자를 만들어줌
public class Restaurant {

//    @Autowired
    private final Chef chef;

    //생성자 주입
    //@Autowired //생성자에 필요한 객체를 컨테이너에서 찾아서 자동으로 주입
    /*public Restaurant(Chef chef) {
        this.chef = chef;
    }*/


    //Setter 주입
    /*@Autowired
    public void setChef(Chef chef) {
        this.chef = chef;
    }*/

    //저녁 식사 주문 기능
    public void orderDinner() {
        System.out.println("저녁 식사를 주문합니다.");
        chef.cook();
    }



}
