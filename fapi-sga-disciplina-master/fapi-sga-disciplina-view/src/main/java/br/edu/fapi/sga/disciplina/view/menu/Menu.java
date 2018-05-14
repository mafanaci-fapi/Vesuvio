package br.edu.fapi.sga.disciplina.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.disciplina.view.operacoes.Atualiza;
import br.edu.fapi.sga.disciplina.view.operacoes.Cadastro;
import br.edu.fapi.sga.disciplina.view.operacoes.Exclusao;
import br.edu.fapi.sga.disciplina.view.operacoes.Listar;
import br.edu.fapi.sga.disciplina.view.operacoes.Pesquisa;
import br.edu.fapi.sga.model.disciplina.Disciplina;

public class Menu {
	public void menu() {
		int opcao;
		int voltar = 1;
		Scanner scanner = new Scanner(System.in);
		Disciplina disciplina = new Disciplina();

		do {
			System.out.println("Escolha uma opção.");
			System.out.println("1 - Cadastrar uma disciplina.");
			System.out.println("2 - Excluir uma disciplina.");
			System.out.println("3 - Atualizar uma disciplina.");
			System.out.println("4 - Pesquisar uma disciplina.");
			System.out.println("5 - Listar uma disciplina.");
			System.out.println("0 - Voltar");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Cadastro cadastro = new Cadastro();
				cadastro.cadastrarDisciplina(scanner, disciplina);
				break;
			case 2:
				Exclusao exclusao = new Exclusao();
				exclusao.excluirDisciplina(scanner, disciplina);
				break;
			case 3:
				Atualiza atualiza = new Atualiza();
				atualiza.atualizarDisciplina(scanner, disciplina);
				break;
			case 4:
				Pesquisa pesquisa = new Pesquisa();
				pesquisa.pesquisarDisciplina(scanner, disciplina);
				break;
			case 5:
				Listar listar = new Listar();
				listar.listarDisciplina(disciplina);
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
