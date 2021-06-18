package kr.ac.kopo.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.academy.model.Course;
import kr.ac.kopo.academy.model.Scmanage;
import kr.ac.kopo.academy.service.CourseService;
import kr.ac.kopo.academy.service.ScmanageService;

@Controller
@RequestMapping("/scmanage")
public class ScmanageController {

	final String path = "scmanage/";
	
	@Autowired
	ScmanageService service;
	

	@RequestMapping("/list")
	public String list(Model model) {
		List<Scmanage> list = service.list();
		model.addAttribute("list", list);
		
		return path+"list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		
		return path + "add";
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(Scmanage item) {
		
		service.add(item);
		
		return "redirect:list";
	}

	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(Model model, int scid) {
		Scmanage item = service.item(scid);
		model.addAttribute("item", item);
		
		return path+"update";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(Scmanage item) {
		
		service.update(item);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(int scid) {
		service.delete(scid);
		return "redirect:list";
	}
	
}
