package com.itb.inf2em.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2em.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produto")
public class LojaController {
	
	List<Produto> listaDeProduto = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String litarProdutos(Model model) {
		
		Produto produto;
		
		produto = new Produto();
		
		produto.setId(20l);
		produto.setNome("Televisor Samsung 75");
		produto.setDescricao("Televisor Tela Plana de Plasma Fullhd");
		produto.setPreco(7937.89);
		produto.setCodigoBarras("FMENAONVSJFOAN123456");
		
		Produto produto2 = new Produto();
		produto2.setId(21l);
		produto2.setNome("Fogão de 5 bocas eletronico");
		produto2.setCodigoBarras("FMENAONVSJFOAN123456");
		
		// Adicionando os produtos à lista
		listaDeProduto.add(produto);
		listaDeProduto.add(produto2);
		
		model.addAttribute("listaDeProduto", listaDeProduto);
		
		return "produtos";
	}
	
	@GetMapping("/novo-prod")
	public String novoProduto() {
		
		return "novo-prod";
	}
	
}
