package com.codeit.springcore.chap01;

import com.codeit.springcore.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotelTest() {
        // 스프링 컨테이너(등록한 빈(객체)을 담아놓는 컨테이너)를 로딩하는 객체 생성.
        // AppConfig 클래스에 지정한 형식을 사용.
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);

        Hotel hotel = ctx.getBean(Hotel.class); // ctx야 Hotel 타입의 빈(객체)를 하나 꺼내줘.

        hotel.inform();


    }

}