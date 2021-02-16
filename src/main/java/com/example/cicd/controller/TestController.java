package com.example.cicd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/getUserdata")
	List<String> getUserdata()
	{
		///set 
		List<String>lst=new ArrayList<String>();
		lst.add("tushar");
		lst.add("sanas");
		return lst;
	}

}
