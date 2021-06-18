package kr.ac.kopo.academy.dao;

import java.util.List;

import kr.ac.kopo.academy.model.Scmanage;

public interface ScmanageDao {

	List<Scmanage> list();

	void add(Scmanage item);

	Scmanage item(int scid);

	void update(Scmanage item);

	void delete(int scid);

}
