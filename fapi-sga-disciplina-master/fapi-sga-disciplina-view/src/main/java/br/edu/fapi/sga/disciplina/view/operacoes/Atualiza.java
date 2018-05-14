package br.edu.fapi.sga.disciplina.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.disciplina.Disciplina;

public class Atualiza {
	public void atualizarDisciplina(Scanner scanner, Disciplina disciplina) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para atualizar a disciplina ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("ATUALIZAÇÃO DE DISCIPLINA.");
				System.out.println("");
				do {
					System.out.print("Digite o código da disciplina: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == disciplina.getCodigo()) {
					System.out.println("");
					System.out.println("ALTERAÇÃO DAS INFORMAÇÕES DA DISCIPLINA DO CÓGIDO: " + codigo);
					System.out.print("Digite o nome da disciplina: ");
					disciplina.setNome(scanner.nextLine());
					System.out.print("Digite o professor da disciplina: ");
					disciplina.setProfessor(scanner.nextLine());
					System.out.print("Digite o curso da disciplina: ");
					disciplina.setCurso(scanner.nextLine());

					System.out.println("");
					System.out.println("-------------------------------");
					System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
					System.out.println("-------------------------------");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Disciplina não encontrada");
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
