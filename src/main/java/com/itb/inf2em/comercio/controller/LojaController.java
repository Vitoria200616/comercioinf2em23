package com.itb.inf2em.comercio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2em.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produto")
public class LojaController {

	@GetMapping("/listar")
	public String litarProdutos() {
		
		Produto produto;
		
		produto = new Produto();
		
		produto.setNome("Televisor Samsung 75'");
		
		
		return "produtos";
	}
	
}
