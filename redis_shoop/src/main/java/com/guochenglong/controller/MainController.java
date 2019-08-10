package com.guochenglong.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guochenglong.bean.Shoop;
import com.guochenglong.bean.Typel;

@Controller
public class MainController {

	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	
	
	@RequestMapping("list")
	public String addStop(Model model) {
		Shoop object = (Shoop) redisTemplate.opsForHash().get("Shoop", "shoop1");
		Shoop object1 = (Shoop) redisTemplate.opsForHash().get("Shoop", "shoop2");
		 ArrayList<Shoop> arrayList = new ArrayList<>();
		 arrayList.add(object);
		 arrayList.add(object1);
		 
		 Typel object2 = (Typel) redisTemplate.opsForHash().get("Typel", "typel"+object.getCid());
		model.addAttribute("object", arrayList);
		model.addAttribute("object2", object2.getBname());
		return "list";
		
	}
	
}
