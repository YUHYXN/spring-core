package com.codeit.springcore.chap04;

import org.springframework.stereotype.Component;

@Component("kim")
public class KimChef implements Chef {

    public void cook() {
        System.out.println("안녕하세여ㅛ. kim 쉪입니다.");
        System.out.println("요리를 시작합니다.");
    }
}
