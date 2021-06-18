package kr.ac.kopo.academy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.academy.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SqlSession session;
	
	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return session.selectList("student.list");
	}
	@Override
	public void add(Student item) {
		session.insert("student.add",item);
	}
	@Override
	public void delete(int studentid) {
		session.delete("student.delete",studentid);
	}
	@Override
	public Student item(int studentid) {
		// TODO Auto-generated method stub
		return session.selectOne("student.item", studentid);
	}
	@Override
	public void update(Student item) {
		session.update("student.update", item);
	}

}
