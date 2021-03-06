package br.edu.fapi.sga.curso.view.operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.model.curso.Curso;

public class Cadastro {
	public void cadastrarCurso(CursoController cursoController, Scanner scanner, Curso curso) {
		int opcao;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para cadastrar um curso ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("CADASTRO DE CURSO.");
				do {
					System.out.print("Digite o código do curso: ");
					curso.setCodigo(scanner.nextInt());
					scanner.nextLine();
					if (curso.getCodigo() < 0) {
						System.out.println("O código não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				List<String> disciplinasAux = new ArrayList();
				System.out.print("Digite o nome do curso: ");
				curso.setNome(scanner.nextLine());
				System.out.print("Digite a duração do curso: ");
				curso.setDuracao(scanner.nextLine());
				System.out.print("Digite a disciplina 1 do curso: ");
				disciplinasAux.add(scanner.nextLine());
				System.out.print("Digite a disciplina 2 do curso: ");
				disciplinasAux.add(scanner.nextLine());
				System.out.print("Digite a disciplina 3 do curso: ");
				disciplinasAux.add(scanner.nextLine());

				curso.setDisciplinas(disciplinasAux);

				cursoController.cadastrarCurso(curso);
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
