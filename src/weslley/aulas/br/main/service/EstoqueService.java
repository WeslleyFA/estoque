package weslley.aulas.br.main.service;

import java.util.List;
import java.util.Scanner;

import weslley.aulas.br.main.model.Produto;

public class EstoqueService {
	private static Scanner teclado = new Scanner(System.in);

	public void  cadastraproduto() {
		System.out.println("***************** CADASTRO ********************");
		
		Produto novoProduto = new Produto();

		System.out.println("ID: ");
		novoProduto.setId(teclado.nextLong());

		System.out.println("Nome: ");
		novoProduto.setNome(teclado.next());

		System.out.println("Quantidade: ");
		novoProduto.setQuantidade(teclado.nextInt());	
		
		System.out.println("Produto criado a baixo: " + novoProduto);

	}

	public void removeProduto(List<Produto> bancoProdutos) {
		System.out.println("***************** REMOÇÃO ********************");
		
		ExibeEstoqueCompleto(bancoProdutos);
		
		System.out.println("ID do produto a ser removido: ");
		Long adsdas = teclado.nextLong();

		Produto produtoSelecionado = buscaProdudoById(adsdas, bancoProdutos);

		if (produtoSelecionado == null) {
			System.out.println("Produto não encontrado.");
			return;
		}

		bancoProdutos.remove(produtoSelecionado);
		System.out.println("Produto removido com sucesso.");

	}

	public void atualizaQtdProduto(List<Produto> bancoProdutos) {
		System.out.println("***************** ATUALIZAÇÃO DE QTD ********************\n");
		System.out.println("ID do produto que será atualizado a quantidade: ");
		Long idSelecionado = teclado.nextLong();

		Produto produtoSelecionado = buscaProdudoById(idSelecionado, bancoProdutos);

		if (produtoSelecionado == null) {
			System.out.println("Produto não encontrado.");
			return;
		}

		System.out.println("Prudoto selecionado: \n" + produtoSelecionado + "\n\n");
		System.out.println("Digite a quantidade atualizada: ");
		teclado.next();
		System.out.println("Atualização Realizada");

	}
	
	public void ExibeEstoqueCompleto(List<Produto> bancoProdutos) {
		System.out.println("***************************************************************************");
		System.out.println("ID \t Nome \t\t\t\t QUANTIDADE");
		for(Produto produto:  bancoProdutos) {
			System.out.print(produto.getId());
			System.out.print("\t " + produto.getNome());
			System.out.print("\t\t\t\t " + produto.getQuantidade() +" \n");
		}
		System.out.println("***************************************************************************");
	}

	private Produto buscaProdudoById(Long id, List<Produto> bancoProdutos) {
		for (Produto produto : bancoProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		// Se chegar aqui, é pq n encontrou nenhum produto com o ID que foi passado, por isso retorna null
		return null;
	}
}
