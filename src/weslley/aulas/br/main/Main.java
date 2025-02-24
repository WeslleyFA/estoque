package weslley.aulas.br.main;

import java.util.ArrayList;
import java.util.List;

import weslley.aulas.br.main.model.Produto;
import weslley.aulas.br.main.service.MenuService;

public class Main {
	
	
	public static void main(String[] args) {
		// Dados iniciais, pro 'banco' ja vir com dados
		List<Produto> produtosBanco = new ArrayList<>();
		Produto p1 = new Produto(1L, "Bola", 5);
		Produto p2 = new Produto(2L, "Escada", 3);
		Produto p3 = new Produto(3L, "Tinta", 7);
		Produto p4 = new Produto(4L, "Estojo", 2);
		
		produtosBanco.add(p1);
		produtosBanco.add(p2);
		produtosBanco.add(p3);
		produtosBanco.add(p4);
		
		MenuService menu = new MenuService();
		
		System.out.println(" \\\\\\\\\\\\\\\\\\\\ SISTEMA DE ESTOQUE ////////////////////// \n");
		while(true) {
			menu.startaMenu(produtosBanco);
		}
		
		

	}

}
