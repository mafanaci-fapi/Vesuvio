package br.edu.fapi.sga.gradehoraria.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.gradehoraria.controller.GradeHorariaController;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

public class Pesquisa {
	public void pesquisarGradeHoraria(GradeHorariaController gradeHorariaController, Scanner scanner, GradeHoraria gradeHoraria) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para pesquisar uma grade ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				do {
					System.out.println("");
					System.out.print("Digite o codigo da grade que deseja exibir: ");
					codigo = scanner.nextInt();
					scanner.nextLine();
					if (codigo < 0) {
						System.out
								.println("O codigo pesquisado nao pode ser menor que 0. Por favor digite novamente.");
						System.out.println("");
					} else {
						defCodigo = 1;
					}
				} while (defCodigo == 0);
				if (codigo == gradeHoraria.getCodigo()) {
					gradeHorariaController.pesquisarGradeHoraria(gradeHoraria);

					System.out.println("Codigo: " + gradeHoraria.getCodigo());
					System.out.println("Curso: " + gradeHoraria.getCurso());
					System.out.println("Turma: " + gradeHoraria.getTurma());
					System.out.println("Grade Horaria: ");
					for (int linha = 0; linha < 4; linha++) {
						for (int coluna = 0; coluna < 5; coluna++) {
							System.out.printf("%35s", gradeHoraria.getGrade(linha, coluna));
						}
						System.out.println("");
					}
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Grade nao encontrada.");
					System.out.println("");
				}
				break;
			case 0:
				System.out.println("");
				break;
			default:
				System.out.println("Opcao invalida.");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}

}
