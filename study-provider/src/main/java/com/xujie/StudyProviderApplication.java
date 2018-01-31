package com.xujie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
@MapperScan("com.xujie.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class StudyProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyProviderApplication.class, args);
	}
}
