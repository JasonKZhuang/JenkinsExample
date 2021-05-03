package com.jasonz.jenkins.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
	@RequestMapping("/")
	public String index()
	{
		return "Greetings from Spring Boot!" + new Date();
	}

}