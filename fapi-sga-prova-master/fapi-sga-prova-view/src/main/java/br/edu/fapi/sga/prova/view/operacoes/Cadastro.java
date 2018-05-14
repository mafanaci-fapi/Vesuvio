package br.edu.fapi.sga.prova.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.prova.Prova;

public class Cadastro {
	public void cadastrarProva(Scanner scanner, Prova prova) {
		int opcao;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para cadastrar uma prova ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("CADASTRO DE PROVA.");
				do {
					System.out.print("Digite o codigo da prova: ");
					prova.setCodigo(scanner.nextInt());
					scanner.nextLine();
					if (prova.getCodigo() < 0) {
						System.out.println("O código não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				System.out.print("Digite a disciplina da prova: ");
				prova.setDisciplina(scanner.nextLine());
				System.out.print("Digite a turma em que a prova será aplicada: ");
				prova.setTurma(scanner.nextLine());
				System.out.print("Digite a 1ª questão da prova: ");
				prova.setQuestoes(0, scanner.nextLine());
				System.out.print("Digite a 2ª questão da prova: ");
				prova.setQuestoes(1, scanner.nextLine());
				System.out.print("Digite a 3ª questão da prova: ");
				prova.setQuestoes(2, scanner.nextLine());
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
				System.out.println("Opção inválida.");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}

}
