package kr.ac.kopo.academy.service;

import java.util.List;

import kr.ac.kopo.academy.model.Scmanage;

public interface ScmanageService {

	List<Scmanage> list();

	void add(Scmanage item);

	Scmanage item(int scid);

	void update(Scmanage item);

	void delete(int scid);

}
