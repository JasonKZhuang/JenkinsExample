package com.jasonz.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class JenkinsExampleApplication
{

	public static void main(String[] args)
	{
		System.setProperty("server.servlet.context-path", "/jksExample");
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

}
