package br.edu.fapi.sga.gradehoraria.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.gradehoraria.controller.GradeHorariaController;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

public class Exclusao {
	public void excluirGradeHoraria(GradeHorariaController gradeHorariaController, Scanner scanner, GradeHoraria gradeHoraria) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para excluir uma grade horaria ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("EXCLUSAO DE GRADE.");
				do {
					System.out.print("Digite o codigo da grade: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out.println("O codigo digitado nao pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == gradeHoraria.getCodigo()) {
					gradeHorariaController.excluirGradeHoraria(gradeHoraria);
				} else {
					System.out.println("");
					System.out.println("Grade nao encontrada");
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opcao invalida");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}

}
