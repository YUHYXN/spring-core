package com.codeit.springcore.config;

import com.codeit.springcore.chap03.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 이 클래스는 Bean을 등록하기 위한 섫정정 클래스야.
// 지정한 패키지 내에 있는 @Component 어노테이션이 붙은 객체를 모두 스캔해서 Bean으로 등록 시키겠다.
@ComponentScan(basePackages ="com.codeit.springcore.chap04") // 이 패키지 안에서 @Component 어노테이션이 붙은 클래스를 찾아서 Bean으로 등록해줘.

public class AppConfig {

    // 추가적으로 등록할 Bean이 있다면 메서드의 리턴 방식으로 Bean 등록 가능.

}
