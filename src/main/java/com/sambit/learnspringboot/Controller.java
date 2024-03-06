package com.sambit.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//[
// {
//	 "id": 1,
//	 "name": "Learn Springboot",
//	 "author": "Great Sam!"
// }
//]

@RestController
public class Controller {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return configuration;
	};
}
