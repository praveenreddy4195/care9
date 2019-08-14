package com.izatech.care9.rest;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String helloWorld()
	{
		  return  "hello World Time on Server is" + LocalDateTime.now();
	}
	
//exposing the get rest 
	
	@GetMapping("/example")
	public String example1()
	{
		  return " example for dev-tools";
	}
	
	@GetMapping("/coachname")
	public String getCoachName()
	{
		 return "the coach name is "+coachName;
	}

	

}
