package br.edu.fapi.sga.gradehoraria.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

public class Exclusao {
	public void excluirGradeHoraria(Scanner scanner, GradeHoraria gradeHoraria) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para excluir uma grade horária ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("EXCLUSÃO DE GRADE.");
				do {
					System.out.print("Digite o codigo da grade: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == gradeHoraria.getCodigo()) {
					gradeHoraria.setCodigo(-1);
					System.out.println("");
					System.out.println("---------------------------");
					System.out.println("GRADE EXCLUIDA COM SUCESSO.");
					System.out.println("---------------------------");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Grade não encontrada");
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
