
package com.usjtECommerce.USJT.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.usjtECommerce.USJT.model.Categoria;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.service.CategoriaService;
import com.usjtECommerce.USJT.service.ProdutoService;

@Controller
public class ProdutoController {
	ProdutoService prodService = new ProdutoService();
	CategoriaService catService = new CategoriaService();
	
	@RequestMapping("/buscar")
	public ModelAndView produto() throws SQLException{
		System.out.println("Entrando em /categoria");
		List<Produtos> prod = prodService.listarProduto();
		List<Categoria> cat = catService.listarCategoria();
		ModelAndView mv = new ModelAndView("busca");
		mv.addObject("categoria",cat);
		mv.addObject("produtos",prod);
		return mv;
	}
	
	@GetMapping("/produto/detalhe{id}")
	public ModelAndView produtoDetalhe(@RequestParam Integer id) throws SQLException {
	  Produtos prod = new Produtos();
	  prod = prodService.detalhe(id);
	  ModelAndView mv = new ModelAndView("produto");
	  mv.addObject("produto",prod);
	  return mv;
	}
}
