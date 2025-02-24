package weslley.aulas.br.main.service;

import java.util.List;
import java.util.Scanner;

import weslley.aulas.br.main.model.Produto;

public class MenuService {
	private static Scanner teclado = new Scanner(System.in);
	
	private EstoqueService estoqueService = new EstoqueService();

	public void startaMenu(List<Produto> bancoProdutos) {
		System.out.println("*********************************************************");
		System.out.println(" 1 - Adicionar novo produto ao estoque ");
		System.out.println(" 2 - Remover produto do estoque ");
		System.out.println(" 3 - Atualizar quantidade de um produto do estoque ");
		System.out.println("*********************************************************");

		Integer opcaoSelecionada = teclado.nextInt();

		switch (opcaoSelecionada) {
		case 1:
			estoqueService.cadastraproduto();
			break;
		case 2:
			estoqueService.removeProduto(bancoProdutos);
			break;
		case 3:
			estoqueService.atualizaQtdProduto(bancoProdutos);
			break;
		case 4:
			estoqueService.ExibeEstoqueCompleto(bancoProdutos);
			break;
		default:
			System.out.println("Opção invalida");
		}
	}
}
