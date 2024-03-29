package com.usjtECommerce.USJT.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.service.LoginService;

@Controller
public class loginController {
	@Controller
	public class LoginController {
		private LoginService loginService = new LoginService();
		
		@GetMapping(value = { "/login" })
		public ModelAndView login(HttpServletRequest request,Usuario usuario) {
			HttpSession session = request.getSession();
			if(session.getAttribute("usuarioLogado") != null) {
				ModelAndView mv = new ModelAndView("perfil");
				mv.addObject(new Usuario());
				return mv;
		}else {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject(new Usuario());
			return mv;
		}
		}
		@PostMapping("/fazerLogin")
		public String fazerLogin(HttpServletRequest request,Usuario usuario) throws SQLException {
			if (loginService.verificarLogin(usuario)) {
				Usuario user = loginService.sessao(usuario);
				request.getSession().setAttribute("usuarioLogado", user);
				request.getSession().setAttribute("usuario", user);
				return "redirect:perfil";
			} else {
				return "login";
			}
		}
	}
}
