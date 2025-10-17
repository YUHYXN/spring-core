package com.codeit.springcore.chap04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 스프링이 자동으로 객체를 생성하고, 그 객체의 생명주기 및 기타 등등을 관리하게 하겠다.
// 같은 타입의 객체를 여러개 등록할 때는 별칭을 지어 주는 것이 좋다(안 지으면 클래스 명이 기본 이름이 됨).
@Component("asian")
public class AsianRestaurant implements Restaurant {

    // 의존성 주입 (Dependency Injection)
    // 객체 선언만
    private Chef chef;

    private Course course;
    // 생성자를 통해서 외부에서 주입 받기 << 객체 주입할 때 훨씬 더 권장함
    // setter를 통해서 외부에서 주입 받기 << 선택적 의존성 주입할 때 사용

    // 의존 객체를 직접 생성하는 것이 아닌, 외부(우리는 AppConfig)에서 생성자를 통해 전달할 예정.
    public AsianRestaurant(@Qualifier("kim") Chef chef,
                           @Qualifier("sushi") Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 아시안 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }
}
