package com.codeit.springcore.chap04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("west")
public class WesternRestaurant implements Restaurant {

    // 의존성 주입 (Dependency Injection)
    // 객체 선언만
    private Chef chef;
    private Course course;

    // 의존 객체를 직접 생성하는 것이 아닌, 외부(우리는 AppConfig)에서 생성자를 통해 전달할 예정.
    public WesternRestaurant(@Qualifier("john") Chef chef,
                             @Qualifier("wc") Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 서양 레스토랑 입니다.");
        chef.cook();
        course.combineMenu();
    }
}
