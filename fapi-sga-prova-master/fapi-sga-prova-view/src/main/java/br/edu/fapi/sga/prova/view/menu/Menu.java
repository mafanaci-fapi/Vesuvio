package br.edu.fapi.sga.prova.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.model.prova.Prova;
import br.edu.fapi.sga.prova.view.operacoes.Atualiza;
import br.edu.fapi.sga.prova.view.operacoes.Cadastro;
import br.edu.fapi.sga.prova.view.operacoes.Exclusao;
import br.edu.fapi.sga.prova.view.operacoes.Listar;
import br.edu.fapi.sga.prova.view.operacoes.Pesquisa;

public class Menu {
	public void menu() {
		int opcao;
		int voltar = 1;
		Scanner scanner = new Scanner(System.in);
		Prova prova = new Prova();

		do {
			System.out.println("Escolha uma opção.");
			System.out.println("1 - Cadastrar uma prova.");
			System.out.println("2 - Excluir uma prova.");
			System.out.println("3 - Atualizar uma prova.");
			System.out.println("4 - Pesquisar uma prova.");
			System.out.println("5 - Listar provas.");
			System.out.println("0 - Voltar");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Cadastro cadastro = new Cadastro();
				cadastro.cadastrarProva(scanner, prova);
				break;
			case 2:
				Exclusao exclusao = new Exclusao();
				exclusao.excluirProva(scanner, prova);
				break;
			case 3:
				Atualiza atualiza = new Atualiza();
				atualiza.atualizarProva(scanner, prova);
				break;
			case 4:
				Pesquisa pesquisa = new Pesquisa();
				pesquisa.pesquisarProva(scanner, prova);
				break;
			case 5:
				Listar listar = new Listar();
				listar.listarProva(prova);
				break;
			case 0:
				System.out.println("");
				voltar = 0;
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while (voltar != 0);
	}
}
