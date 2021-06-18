package kr.ac.kopo.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.academy.model.Course;
import kr.ac.kopo.academy.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	final String path = "course/";
	
	@Autowired
	CourseService service;
	

	@RequestMapping("/list")
	public String list(Model model) {
		List<Course> list = service.list();
		model.addAttribute("list", list);
		
		return path+"list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		
		return path + "add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(Course item) {
		service.add(item);
		return "redirect:list";
	}

	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(Model model, int courseid) {
		Course item = service.item(courseid);
		model.addAttribute("item", item);
		
		return path+"update";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(Course item) {
		
		service.update(item);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(int courseid) {
		service.delete(courseid);
		return "redirect:list";
	}
	
}
