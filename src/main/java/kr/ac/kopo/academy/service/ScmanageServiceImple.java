package kr.ac.kopo.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.academy.dao.ScmanageDao;
import kr.ac.kopo.academy.model.Scmanage;

@Service
public class ScmanageServiceImple implements ScmanageService {

	@Autowired
	ScmanageDao dao;
	
	@Override
	public List<Scmanage> list() {
		return dao.list();
	}

	@Override
	public void add(Scmanage item) {

		dao.add(item);
	}

	@Override
	public Scmanage item(int scid) {
		// TODO Auto-generated method stub
		return dao.item(scid);
	}

	@Override
	public void update(Scmanage item) {

		dao.update(item);
	}

	@Override
	public void delete(int scid) {

		dao.delete(scid);
	}

}
