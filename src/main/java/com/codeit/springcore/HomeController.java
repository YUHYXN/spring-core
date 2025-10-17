package com.codeit.springcore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤러 역할을 하는 Bean 등록을 하겠다. Component랑 똑같은데, 이름으로 역할을 구분
public class HomeController {


    // 생성자 호출
    public HomeController() {
        System.out.println("HomeController 생성자 생성됨! 근데 내가 생성한 건 아님");
    }

    // View resolver 역할을 하는 DispatcherServlet이 /hello 요청을 받으면
    // home() 메서드를 호출(맵핑, 파일명)
    // @GetMapping 어노테이션: Get방식으로 들어오는 요청을 매핑해주는 어노테이션

    // Method 선언
    @GetMapping("/hello")   /// hello라는 객체가 들어오면 home()을 호출해줘
    @ResponseBody   // 반환되는 값을 View 이름이 아니라, 응답 본문으로 사용하겠다.
    public String home(String name) {   // name이라는 매개 변수 받아올 수 있음  parameter
        System.out.println("서버에 요청이 들어왔다.");    // 인수는 argument << 매개 값 << 매개 값을 받아주는게 파라미터 매개 변수
        return "home";  // home.html을 찾아서 반환해줘(열고자 하는 파일명이다.) - template 폴더 안에서 찾음
    }


}
