package com.mulesoft.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MulesoftDemoController{
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public String getone() {
		String res = "{ “name”:”sample”,”age”:24}";
	System.out.println(res);
		return res;
	}
}
