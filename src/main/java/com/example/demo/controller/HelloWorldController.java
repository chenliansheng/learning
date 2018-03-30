package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/sayHello")
	public Map sayHello(String var1) {
		if(!"stop".equals(var1)) {
			Map hmap = new HashMap();
			hmap.put("hello",var1);
			return hmap;
		}else {
			System.exit(-9);
		}
		return null;
	}
}
