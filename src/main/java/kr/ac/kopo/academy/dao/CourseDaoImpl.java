package kr.ac.kopo.academy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.academy.model.Course;

@Repository
public class CourseDaoImpl implements CourseDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Course> list() {
		return sql.selectList("course.list");
	}

	@Override
	public void add(Course item) {
		sql.insert("course.add",item);
	}

	@Override
	public Course item(int courseid) {
		return sql.selectOne("course.item",courseid);
	}

	@Override
	public void delete(int courseid) {
		sql.delete("course.delete",courseid);
	}

	@Override
	public void update(Course item) {

		sql.update("course.update", item);
	}

}
