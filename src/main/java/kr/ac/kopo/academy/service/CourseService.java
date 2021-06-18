package kr.ac.kopo.academy.service;

import java.util.List;

import kr.ac.kopo.academy.model.Course;

public interface CourseService {

	List<Course> list();

	void add(Course item);

	Course item(int courseid);

	void update(Course item);

	void delete(int courseid);

}
