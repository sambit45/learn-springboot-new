package com.sambit.learnspringboot;

import java.util.Arrays;
import java.util.List;

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
public class CourseController {
	@RequestMapping("/course")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
			new Course(1,"Learn Springboot","Sam!"),
			new Course(2,"Learn React","Sam!"),
			new Course(3,"Learn Spring","Sam!"),
			new Course(4,"Learn API","Sam!"));
	};
}
