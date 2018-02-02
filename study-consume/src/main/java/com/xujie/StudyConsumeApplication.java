package com.xujie;

import com.xujie.utils.redis.RedisUtils;
import com.xujie.utils.result.Result;
import com.xujie.utils.result.ResultUtitls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 是Spring Boot项目的核心注解,主要是开启自动配置
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
public class StudyConsumeApplication {
	@Autowired
	private RedisUtils redisUtils;

	public static void main(String[] args) {
		SpringApplication.run(StudyConsumeApplication.class, args);
	}

	@RequestMapping("/say")
	public Result sayHello() throws Exception{
		redisUtils.set("mykey","你好！");
		//自己捕获异常
		/*if(name!=null){
			throw new BaseException(ResultEnum.UNKONW_ERROR);
		}*/
		System.out.println(redisUtils.get("mykey"));
		return ResultUtitls.success();
	}
}
