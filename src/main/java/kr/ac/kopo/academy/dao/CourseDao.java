package kr.ac.kopo.academy.dao;

import java.util.List;

import kr.ac.kopo.academy.model.Course;

public interface CourseDao {

	List<Course> list();

	void add(Course item);

	Course item(int courseid);

	void delete(int courseid);

	void update(Course item);


	
}
