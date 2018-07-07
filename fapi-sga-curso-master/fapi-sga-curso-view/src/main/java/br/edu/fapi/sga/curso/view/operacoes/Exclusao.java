package br.edu.fapi.sga.curso.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.model.curso.Curso;

public class Exclusao {
	public void excluirCurso(CursoController cursoController, Scanner scanner, Curso curso) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para excluir um curso ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("EXCLUSAO DE CURSO.");
				do {
					System.out.print("Digite o codigo do curso: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O codigo digitado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);

				if (codigo == curso.getCodigo()) {
					curso.setCodigo(-1);

					cursoController.excluirCurso(curso);

					System.out.println("");
					System.out.println("---------------------------");
					System.out.println("CURSO EXCLUIDO COM SUCESSO.");
					System.out.println("---------------------------");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Curso nao encontrado");
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opçao invalida");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}
}
