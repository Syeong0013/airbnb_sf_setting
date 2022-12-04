package com.sy.bnb.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.bnb.service.MainService;

@Controller
public class MainController {

	@Resource(name="mainService")
	MainService mainService;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Ω√¿€-------------------");
		try {
			System.out.println(mainService.getNow());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home";
	}
}
