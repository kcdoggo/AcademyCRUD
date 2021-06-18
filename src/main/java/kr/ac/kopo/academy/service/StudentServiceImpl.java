package kr.ac.kopo.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.academy.dao.StudentDao;
import kr.ac.kopo.academy.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentDao dao;
	
	@Override
	public List<Student> list() {
		return dao.list();
	}

	@Override
	public void add(Student item) {
		dao.add(item);
	}

	@Override
	public void delete(int studentid) {
		dao.delete(studentid);
	}

	@Override
	public Student item(int studentid) {
		return dao.item(studentid);
	}

	@Override
	public void update(Student item) {
		dao.update(item);
	}

}
