package br.edu.fapi.sga.disciplina.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.disciplina.Disciplina;

public class Cadastro {
	public void cadastrarDisciplina(Scanner scanner, Disciplina disciplina) {
		int opcao;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para cadastrar a disciplina ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("CADASTRO DE DISCIPLINA.");
				System.out.println("");
				do {
					System.out.print("Digite o código da disciplina: ");
					disciplina.setCodigo(scanner.nextInt());
					scanner.nextLine();
					if (disciplina.getCodigo() < 0) {
						System.out.println("O código não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				System.out.print("Digite o nome da disciplina: ");
				disciplina.setNome(scanner.nextLine());
				System.out.print("Digite o professor da disciplina: ");
				disciplina.setProfessor(scanner.nextLine());
				System.out.print("Digite o curso da disciplina: ");
				disciplina.setCurso(scanner.nextLine());
				System.out.println("");
				System.out.println("-------------------------------");
				System.out.println("CADASTRO REALIZADO COM SUCESSO.");
				System.out.println("-------------------------------");
				System.out.println("");
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opção Inválida.");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}
}
