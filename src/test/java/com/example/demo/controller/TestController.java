package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CommonResult;

@RestController
public class TestController {
	@RequestMapping(value = "/test/dem0")
	public CommonResult demo1() {
		return new CommonResult(200, "this is a test for git");
	}
	
}
