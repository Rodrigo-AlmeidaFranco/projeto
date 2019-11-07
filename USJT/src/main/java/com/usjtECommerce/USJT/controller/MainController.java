package com.usjtECommerce.USJT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MainController {
	
	@RequestMapping("/home")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView error(){
		ModelAndView mv = new ModelAndView("error");
		return mv;
	}
	
	@RequestMapping("/contato")
	public ModelAndView contato(){
		ModelAndView mv = new ModelAndView("contato");
		return mv;
	}
	
	@RequestMapping("/checkout")
	public ModelAndView checkout(){
		ModelAndView mv = new ModelAndView("checkout");
		return mv;
	}
	

	
	@RequestMapping("/confirmacao")
	public ModelAndView confirmacao(){
		ModelAndView mv = new ModelAndView("confirmacao");
		return mv;
	}
	
	@RequestMapping("/track")
	public ModelAndView track(){
		ModelAndView mv = new ModelAndView("track");
		return mv;
	}
	

	

	
	
	
	
}
