package com.usjtECommerce.USJT.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.service.CompraService;
import com.usjtECommerce.USJT.service.PedidoService;

@Controller
public class CompraController {
	CompraService service = new CompraService();
	PedidoService pedidoService = new PedidoService();
	@PostMapping("/comprar")
	public String fazerLogin(HttpServletRequest request) throws SQLException {
		HttpSession session = request.getSession();
		Usuario user = (Usuario) session.getAttribute("usuario");
		ArrayList<Pedido> ped = pedidoService.ListaPedido(user.getId_usuario());
		service.comprar(user, ped);
		return "redirect:perfil";
	}
}
