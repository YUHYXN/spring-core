package com.codeit.springcore.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
// 빈 등록을 해야 요청이 들어왔을 때 메서드를 호출할 수 있다.
// RestController 안에 있는 모든 메서드는 return 값이 JSON으로 변환되어
// 클라이언트에게 전송됩니다. -> 더이상 백엔드는 화면에 관여하지 않습니다.
@RestController // @Controller + @ResponseBody 역할을 동시에 하는 어노테이션이다. 컨트럴로 역할 빈 등록하겠다. REST방식으로 응답할거야.
public class RestControllerTest {

    @GetMapping("/rest/list")
//    @ResponseBody     -> 클라이언트로 데이터를 JSON으로 변환 후 바로 던지는 문법 그런데 하나하나 다 해주기 그러니까 위에 보면
    public List<String> method1() {
        List<String> list = List.of("hello", "world", "!", "spring", "boot");
        return list;
    }

    @GetMapping("/rest/object")
    public Person method2() {
        // Person 객체를 생성해서 반환
        // 아래 형이 다 같으면 그냥 Map으로 받으면 된다.
        Person person = new Person("엘리스", 30, List.of("읽기", "쓰기", "먹기"));
        return person;
    }

    // 클라이언트(리액트 등)가 요청과 함께 JSON 데이터를 보내는 경우
    // 1. JSON 형태로 생긴 클래스가 있다? -> 그 객체로 받으면 되고,
    // 2. JSON 형태로 생긴 클래스가 없다? -> Map<String, Object>로 받으면 된다.


    @PostMapping("/rest/register")
    // @RequestBody: 요청 본문에 담긴 JSON 데이터를 Java 객체로 변환해주는 어노테이션이다.
    public String method3(@RequestBody Person person) {
        return "ok!";
    }




}
