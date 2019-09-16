package com.usjtECommerce.USJT.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.service.LoginService;



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
	

	
	@Controller
	public class LoginController {
		@Autowired
		private LoginService loginService;
		@GetMapping(value = { "/login","/buy","/sell" })
		public ModelAndView login() {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject(new Usuario());
			return mv;
		}

		@PostMapping("/fazerLogin")
		public String fazerLogin(HttpServletRequest request,Usuario usuario) {
			if (loginService.logar(usuario)) {
				request.getSession().setAttribute("usuarioLogado", usuario);
				return "redirect:home";
			} else {
				return "login";
			}
		}
	}
	
}
