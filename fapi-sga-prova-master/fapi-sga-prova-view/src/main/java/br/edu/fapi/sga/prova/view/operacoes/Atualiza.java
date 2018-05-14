package br.edu.fapi.sga.prova.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.prova.Prova;

public class Atualiza {
	public void atualizarProva(Scanner scanner, Prova prova) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para atualizar uma prova ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("ATUALIZAÇÃO DE PROVA.");
				System.out.print("Digite o código da prova: ");
				do {
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo < 0);
				if (codigo == prova.getCodigo()) {
					System.out.println("");
					System.out.println("ALTERAÇÃO DAS INFORMAÇÕES DA PROVA DO CÓGIDO: " + codigo);
					System.out.print("Digite a disciplina da prova: ");
					prova.setDisciplina(scanner.nextLine());
					System.out.print("Digite a turma em que a prova será aplicada: ");
					prova.setTurma(scanner.nextLine());
					System.out.println("Digite as perguntas da prova. ");
					System.out.print("1ª: ");
					prova.setQuestoes(0, scanner.nextLine());
					System.out.print("2ª: ");
					prova.setQuestoes(1, scanner.nextLine());
					System.out.print("3ª: ");
					prova.setQuestoes(2, scanner.nextLine());

					System.out.println("");
					System.out.println("----------------------------------");
					System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
					System.out.println("----------------------------------");
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
