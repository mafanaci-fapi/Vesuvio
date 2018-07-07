package br.edu.fapi.sga.curso.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.curso.controller.impl.CursoControllerImpl;
import br.edu.fapi.sga.curso.view.operacoes.Atualiza;
import br.edu.fapi.sga.curso.view.operacoes.Cadastro;
import br.edu.fapi.sga.curso.view.operacoes.Exclusao;
import br.edu.fapi.sga.curso.view.operacoes.Listar;
import br.edu.fapi.sga.curso.view.operacoes.Pesquisa;
import br.edu.fapi.sga.model.curso.Curso;

public class Menu {
	public void menu() {
		CursoController cursoController = new CursoControllerImpl();

		int opcao;
		int voltar = 1;
		Scanner scanner = new Scanner(System.in);
		Curso curso = new Curso();

		do {
			System.out.println("Escolha uma opcao.");
			System.out.println("1 - Cadastrar um curso.");
			System.out.println("2 - Excluir um curso.");
			System.out.println("3 - Atualizar um curso.");
			System.out.println("4 - Pesquisar um curso.");
			System.out.println("5 - Listar um curso.");
			System.out.println("0 - Voltar");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Cadastro cadastro = new Cadastro();
				cadastro.cadastrarCurso(cursoController, scanner, curso);
				break;
			case 2:
				Exclusao exclusao = new Exclusao();
				exclusao.excluirCurso(cursoController, scanner, curso);
				break;
			case 3:
				Atualiza atualiza = new Atualiza();
				atualiza.atualizarCurso(cursoController, scanner, curso);
				break;
			case 4:
				Pesquisa pesquisa = new Pesquisa();
				pesquisa.pesquisarCurso(cursoController, scanner, curso);
				break;
			case 5:
				Listar listar = new Listar();
				listar.listarCurso(cursoController, curso);
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
