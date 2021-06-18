package kr.ac.kopo.academy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.academy.model.Scmanage;

@Repository
public class ScmanageDaoImpl implements ScmanageDao {

	
	@Autowired
	SqlSession sql;
	
	@Override
	public List<Scmanage> list() {
		return sql.selectList("scmanage.list");
	}

	@Override
	public void add(Scmanage item) {
		sql.insert("scmanage.add",item);

	}

	@Override
	public Scmanage item(int scid) {
		return sql.selectOne("scmanage.item", scid);
	}

	@Override
	public void update(Scmanage item) {
		sql.update("scmanage.update",item);

	}

	@Override
	public void delete(int scid) {
		sql.delete("scmanage.delete", scid);
	}

}
