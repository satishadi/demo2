package com.demo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/demo2")
public class RestController {


	@GetMapping("hello")
	public String hello() {
	
		return "Hello satish how are You";
	}
}
