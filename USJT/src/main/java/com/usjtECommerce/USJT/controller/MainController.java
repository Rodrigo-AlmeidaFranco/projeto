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
	
	@RequestMapping("/buy")
	public ModelAndView buy(){
		ModelAndView mv = new ModelAndView("carrinho");
		return mv;
	}
	
	@RequestMapping("/carrinho")
	public ModelAndView carrinho(){
		ModelAndView mv = new ModelAndView("carrinho");
		return mv;
	}
	
	@RequestMapping("/sell")
	public ModelAndView sell(){
		ModelAndView mv = new ModelAndView("carrinho");
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
	
	@RequestMapping("/buscar")
	public ModelAndView busca(){
		ModelAndView mv = new ModelAndView("busca");
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
	
	@RequestMapping("/produto")
	public ModelAndView produto(){
		ModelAndView mv = new ModelAndView("produto");
		return mv;
	}
	@Controller
	public class LoginController {
		@Autowired
		private LoginService loginService;
		@GetMapping(value = { "/login" })
		public ModelAndView login() {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject(new Usuario());
			return mv;
		}

		@PostMapping("/fazerLogin")
		public String fazerLogin(HttpServletRequest request,Usuario usuario) {
			if (loginService.logar(usuario)) {
				request.getSession().setAttribute("usuarioLogado", usuario);
				return "redirect:contato";
			} else {
				return "login";
			}
		}
	}
	
}
