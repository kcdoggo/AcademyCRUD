package kr.ac.kopo.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
}
