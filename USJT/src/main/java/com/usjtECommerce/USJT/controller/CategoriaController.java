package com.usjtECommerce.USJT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usjtECommerce.USJT.model.Categoria;
import com.usjtECommerce.USJT.model.Produtos;
import com.usjtECommerce.USJT.service.CategoriaService;
import com.usjtECommerce.USJT.service.ProdutoService;


@Controller
public class CategoriaController {
	@Autowired
	private CategoriaService catService;
	
	@Autowired
	private ProdutoService prodService;
	
	@RequestMapping("/buscar")
	public ModelAndView busca(){
		System.out.println("Entrando em /categoria");
		List<Categoria> cat = catService.findAll();
		List<Produtos> prod = prodService.findAll();
		ModelAndView mv = new ModelAndView("busca");
		mv.addObject("categoria",cat);
		mv.addObject("produtos",prod);
		return mv;
	}
}
