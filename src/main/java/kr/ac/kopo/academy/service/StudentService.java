package kr.ac.kopo.academy.service;

import java.util.List;

import kr.ac.kopo.academy.model.Student;

public interface StudentService {

	List<Student> list();

	void add(Student item);

	void delete(int studentid);

	Student item(int studentid);

	void update(Student item);

}
