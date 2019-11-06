package com.usjtECommerce.USJT.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.service.PedidoService;
import com.usjtECommerce.USJT.service.ProdutoService;

@Controller
public class PedidoController {
	PedidoService pedidoService = new PedidoService();
	ProdutoService prodService =  new ProdutoService();

	@RequestMapping("/carrinho")
	public ModelAndView produto(HttpServletRequest request, Usuario usuario) throws SQLException {
		HttpSession session = request.getSession();
		Usuario user;
		if (session.getAttribute("usuario") != null) {
			user = (Usuario) session.getAttribute("usuario");
		} else {
			user = new Usuario();
		}
		List<Pedido> pedido = pedidoService.ListaPedido(user.getId_usuario());
		ModelAndView mv = new ModelAndView("carrinho");
		mv.addObject("pedido", pedido);
		return mv;
	}

	@GetMapping(value = "/adicionar{id}")
	public ModelAndView adicionarCarrinho(HttpServletRequest request, @RequestParam Integer id) throws SQLException {
		HttpSession session = request.getSession();
		Usuario user;
		if (session.getAttribute("usuario") != null) {
			user = (Usuario) session.getAttribute("usuario");
		} else {
			user = new Usuario();
		}
		Produtos prod = prodService.detalhe(id);
		pedidoService.SalvarPedido(user, prod);
		List<Pedido> pedido = pedidoService.ListaPedido(user.getId_usuario());
		ModelAndView mv = new ModelAndView("carrinho");
		mv.addObject("pedido", pedido);
		return mv;
	}

}
