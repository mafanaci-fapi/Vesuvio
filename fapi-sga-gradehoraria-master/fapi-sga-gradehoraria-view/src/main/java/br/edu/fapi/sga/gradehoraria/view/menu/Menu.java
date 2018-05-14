package br.edu.fapi.sga.gradehoraria.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.gradehoraria.view.operacoes.Atualiza;
import br.edu.fapi.sga.gradehoraria.view.operacoes.Cadastro;
import br.edu.fapi.sga.gradehoraria.view.operacoes.Exclusao;
import br.edu.fapi.sga.gradehoraria.view.operacoes.Listar;
import br.edu.fapi.sga.gradehoraria.view.operacoes.Pesquisa;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

public class Menu {
	public void menu() {
		int opcao;
		int voltar = 1;
		Scanner scanner = new Scanner(System.in);
		GradeHoraria gradeHoraria = new GradeHoraria();

		do {
			System.out.println("Escolha uma opção.");
			System.out.println("1 - Cadastrar uma grade horária.");
			System.out.println("2 - Excluir uma grade horária.");
			System.out.println("3 - Atualizar uma grade horária.");
			System.out.println("4 - Pesquisar uma grade horária.");
			System.out.println("5 - Listar provas.");
			System.out.println("0 - Voltar");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Cadastro cadastro = new Cadastro();
				cadastro.cadastrarGradeHoraria(scanner, gradeHoraria);
				break;
			case 2:
				Exclusao exclusao = new Exclusao();
				exclusao.excluirGradeHoraria(scanner, gradeHoraria);
				break;
			case 3:
				Atualiza atualiza = new Atualiza();
				atualiza.atualizarGradeHoraria(scanner, gradeHoraria);
				break;
			case 4:
				Pesquisa pesquisa = new Pesquisa();
				pesquisa.pesquisarGradeHoraria(scanner, gradeHoraria);
				break;
			case 5:
				Listar listar = new Listar();
				listar.listarGradeHoraria(gradeHoraria);
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
