package br.edu.fapi.sga.disciplina.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.disciplina.Disciplina;

public class Pesquisa {
	public void pesquisarDisciplina(Scanner scanner, Disciplina disciplina) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para pesquisar uma disciplina ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				do {
					System.out.println("");
					System.out.println("Digite o código da disciplina que deseja pesquisar.");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out
								.println("O código pesquisado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == disciplina.getCodigo()) {
					System.out.println("");
					System.out.println("Código: " + disciplina.getCodigo());
					System.out.println("Nome: " + disciplina.getNome());
					System.out.println("Professor: " + disciplina.getProfessor());
					System.out.println("Curso: " + disciplina.getCurso());
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Disciplina não encontrada.");
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opção inválida");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}
}
