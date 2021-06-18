package kr.ac.kopo.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.kopo.academy.model.Student;
import kr.ac.kopo.academy.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	final String path = "student/";
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		List<Student> list = service.list();
		model.addAttribute("list", list);
		
		return path+"list"; 
	}

	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		return path+"add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(Student item) {
		
		service.add(item);
		return "redirect:list";
	}
	
	
	
	@RequestMapping("/delete")
	public String delete(int studentid) {
		service.delete(studentid);
		return "redirect:list";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(Model model, int studentid) {
		
		
		Student item = service.item(studentid);
		model.addAttribute("item", item);
		
		return path+"update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(Student item) {
		service.update(item);
		
		return "redirect:list";
	}
	
	
	
}
