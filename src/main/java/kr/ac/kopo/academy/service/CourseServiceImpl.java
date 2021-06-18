package kr.ac.kopo.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.academy.dao.CourseDao;
import kr.ac.kopo.academy.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao dao;
	
	@Override
	public List<Course> list() {
		return dao.list();
	}

	@Override
	public void add(Course item) {

		dao.add(item);
	}

	@Override
	public Course item(int courseid) {
		return dao.item(courseid);
	}

	@Override
	public void update(Course item) {

	   dao.update(item);
	}

	@Override
	public void delete(int courseid) {

		dao.delete(courseid);
	}

}
