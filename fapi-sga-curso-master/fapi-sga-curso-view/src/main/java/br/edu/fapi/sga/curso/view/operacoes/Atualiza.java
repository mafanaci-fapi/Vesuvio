package br.edu.fapi.sga.curso.view.operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.model.curso.Curso;

public class Atualiza {
	public void atualizarCurso(CursoController cursoController, Scanner scanner, Curso curso) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para atualizar um curso ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("ATUALIZAÇÃO DE CURSO.");
				do {
					System.out.print("Digite o código do curso: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == curso.getCodigo()) {
					List<String> disciplinasAux = new ArrayList();

					System.out.println("");
					System.out.println("ALTERAÇÃO DAS INFORMAÇÕES DA DISCIPLINA DO CÓGIDO: " + codigo);
					System.out.println("");
					System.out.print("Digite o nome do curso: ");
					curso.setNome(scanner.nextLine());
					System.out.print("Digite a duração do curso: ");
					curso.setDuracao(scanner.nextLine());
					System.out.println("Digite as disciplinas do curso. ");
					System.out.print("1: ");
					disciplinasAux.add(scanner.nextLine());
					System.out.print("2: ");
					disciplinasAux.add(scanner.nextLine());
					System.out.print("3: ");
					disciplinasAux.add(scanner.nextLine());

					curso.setDisciplinas(disciplinasAux);
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
				System.out.println("Opção inválida.");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}

}
