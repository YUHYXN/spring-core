package com.codeit.springcore.rest;

import lombok.*;

import java.util.List;

// 아래는 Lombok 어노테이션이다. 프로젝트 시, 모두가 롬복 다 써야함
@Getter @Setter @ToString
@NoArgsConstructor  // 인수를 받지 않는
@AllArgsConstructor // 모든 필드를 인수로 받는
@EqualsAndHashCode  // equals()와 hashCode() 자동 생성
public class Person {

    private String name;
    private int age;
    private List<String> hobbies;

}
