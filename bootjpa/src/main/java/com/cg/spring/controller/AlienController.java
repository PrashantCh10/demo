package com.cg.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.spring.dao.AlienRepo;
import com.cg.spring.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String show() {
		return "alien.jsp";
	}
	@RequestMapping("/Addalien")
	public String Addalien(Alien alien) {
	   repo.save(alien);
	   return "alien.jsp";
	}
}
