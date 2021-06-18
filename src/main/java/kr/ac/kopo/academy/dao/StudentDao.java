package kr.ac.kopo.academy.dao;

import java.util.List;

import kr.ac.kopo.academy.model.Student;

public interface StudentDao {

	List<Student> list();

	void add(Student item);

	void delete(int studentid);

	Student item(int studentid);

	void update(Student item);

}
