package br.edu.fapi.sga.prova.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.prova.Prova;

public class Pesquisa {
	public void pesquisarProva(Scanner scanner, Prova prova) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para pesquisar uma prova ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				do {
					System.out.println("");
					System.out.print("Digite o código da prova que deseja pesquisar: ");
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
				if (codigo == prova.getCodigo()) {
					System.out.println("");
					System.out.println("Código: " + prova.getCodigo());
					System.out.println("Disciplina: " + prova.getDisciplina());
					System.out.println("Turma: " + prova.getTurma());
					System.out.println("Questões: ");
					System.out.println(prova.getQuestoes(0));
					System.out.println(" --- ");
					System.out.println(prova.getQuestoes(1));
					System.out.println(" --- ");
					System.out.println(prova.getQuestoes(2));
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Prova não encontrada.");
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
