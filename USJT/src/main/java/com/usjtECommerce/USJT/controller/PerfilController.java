package com.usjtECommerce.USJT.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usjtECommerce.USJT.model.Cliente;
import com.usjtECommerce.USJT.model.Compra;
import com.usjtECommerce.USJT.model.Pedido;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.model.Usuario;
import com.usjtECommerce.USJT.model.MetodosPagto;
import com.usjtECommerce.USJT.service.ClienteService;
import com.usjtECommerce.USJT.service.CompraService;
import com.usjtECommerce.USJT.service.MetodosPagtoService;
import com.usjtECommerce.USJT.service.PedidoService;
import com.usjtECommerce.USJT.service.ProdutoService;

@Controller
public class PerfilController {
	CompraService service =  new CompraService();
	ClienteService cliService = new ClienteService();
	PedidoService pedService = new PedidoService();
	MetodosPagtoService pagtoService = new MetodosPagtoService();
	ProdutoService prodService = new ProdutoService();
	
	@GetMapping(value = "/perfil")
	public ModelAndView perfil(HttpServletRequest request ) throws SQLException{
		HttpSession session = request.getSession();
		if(session.getAttribute("usuario") !=null) {
		Usuario perfil = (Usuario) session.getAttribute("usuario");
		ArrayList<Compra> compras =  service.listaCompra(perfil.getId_usuario());
		Cliente cliente = cliService.findCliente(perfil.getId_usuario());
		ArrayList<MetodosPagto> listaPagto = pagtoService.getMetodos(perfil.getId_usuario());
		ArrayList<Pedido> listaPedido=  pedService.ListaPedidoConfirmado(perfil.getId_usuario());

		ModelAndView mv = new ModelAndView("perfil");
		mv.addObject("usuario",perfil);
		mv.addObject("historicoCompras",compras);
		mv.addObject("perfil", cliente);
		mv.addObject("pedidos", listaPedido);
		mv.addObject("metodosPagto", listaPagto);
		mv.addObject(new Produtos());
		return mv;
		} else {
		ModelAndView mv = new ModelAndView("perfil");
		 mv.addObject(new Usuario());
		 return mv;
		}
	}
	
	@PostMapping("/anunciar")
	public ModelAndView anunciar(HttpServletRequest request,Produtos prod) throws SQLException {
	    HttpSession session = request.getSession();
	    Usuario user = (Usuario) session.getAttribute("usuario");
	    prodService.anunciar(prod,user);
	    return perfil( request );
	}
}
