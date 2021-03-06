package br.edu.fapi.sga.curso.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.model.curso.Curso;

public class Pesquisa {
	public void pesquisarCurso(CursoController cursoController, Scanner scanner, Curso curso) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para pesquisar um curso ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				do {
					System.out.println("");
					System.out.println("Digite o código do curso que deseja pesquisar.");
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
				if (codigo == curso.getCodigo()) {
					cursoController.pesquisarCurso(curso);

					System.out.println("Código: " + curso.getCodigo());
					System.out.println("Nome: " + curso.getNome());
					System.out.println("Duração: " + curso.getDuracao());
					System.out.println("Disciplinas: ");
                    System.out.println(curso.getDisciplinas());

				} else {
					System.out.println("");
					System.out.println("Curso nao encontrado.");
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opção invalida.");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}
}
