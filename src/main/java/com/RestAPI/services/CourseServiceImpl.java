package com.RestAPI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RestAPI.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123,"Java","Java is best"));
		list.add(new Course(88,"python","py is best"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
