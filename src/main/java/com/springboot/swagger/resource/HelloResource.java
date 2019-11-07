package com.springboot.swagger.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@PostMapping("/add")
	public String helloPost(@RequestBody final String hello) {
		return hello;
	}
	
	@PutMapping("/add")
	public String helloPut(@RequestBody final String hello) {
		return hello;
	}
}
