package com.codeit.springcore.chap03;

public class AsianRestaurant implements Restaurant {

    // 의존성 주입 (Dependency Injection)
    // 객체 선언만
    private Chef chef;

    private Course course;
    // 생성자를 통해서 외부에서 주입 받기 << 객체 주입할 때 훨씬 더 권장함
    // setter를 통해서 외부에서 주입 받기 << 선택적 의존성 주입할 때 사용

    // 의존 객체를 직접 생성하는 것이 아닌, 외부(우리는 AppConfig)에서 생성자를 통해 전달할 예정.
    public AsianRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요. 아시안 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }
}
