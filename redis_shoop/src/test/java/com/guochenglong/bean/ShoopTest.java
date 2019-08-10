package com.guochenglong.bean;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-beans.xml"})
public class ShoopTest {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	
	@Test
	public void addshop() {
		Shoop shoop=new Shoop(1,"iphone8","内存：1G,颜色：玫瑰金","6400",5,1);
		Shoop shoop1=new Shoop(2,"华为MateBook 13","内存：8G,颜色，灰红色","5299",10,2);
	
		redisTemplate.opsForHash().put("Shoop","shoop"+shoop.getId(), shoop);
		redisTemplate.opsForHash().put("Shoop","shoop"+shoop1.getId(), shoop1);
	
	}

	@Test
	public void addTypel() {
		Typel typel=new Typel(1,"手机");
		redisTemplate.opsForHash().put("Typel","typel"+typel.getBid(), typel);
	}
	@Test
	public void selectTypel() {
		
		Typel object2 = (Typel) redisTemplate.opsForHash().get("Typel", "typel1");
		System.out.println(object2.getBname());
	}
	
}
