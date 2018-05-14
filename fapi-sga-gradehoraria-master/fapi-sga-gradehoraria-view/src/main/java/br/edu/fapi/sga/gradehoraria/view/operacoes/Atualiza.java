package br.edu.fapi.sga.gradehoraria.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

public class Atualiza {
	public void atualizarGradeHoraria(Scanner scanner, GradeHoraria gradeHoraria) {
		int opcao;
		int codigo;
		int defCodigo = 0;

		do {
			System.out.println("");
			System.out.println("Digite 1 para atualizar uma grade ou 0 para voltar.");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("ATUALIZAÇÃO DE GRADE.");
				do {
					System.out.print("Digite o código da grade: ");
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
					System.out.println("");
					System.out.println("ALTERAÇÃO DA GRADE DA TURMA: " + gradeHoraria.getTurma());
					System.out.println("");
					System.out.println("Digite as aulas de segunda-feira. ");
					System.out.print("1ª/2ª Aulas: ");
					String defAula = scanner.nextLine();
					gradeHoraria.setGrade(0, 0, defAula);
					gradeHoraria.setGrade(1, 0, defAula);
					System.out.print("3ª/4ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(2, 0, defAula);
					gradeHoraria.setGrade(3, 0, defAula);
					System.out.println("");
					System.out.println("Digite as aulas de terça-feira. ");
					System.out.print("1ª/2ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(0, 1, defAula);
					gradeHoraria.setGrade(1, 1, defAula);
					System.out.print("3ª/4ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(2, 1, defAula);
					gradeHoraria.setGrade(3, 1, defAula);
					System.out.println("");
					System.out.println("Digite as aulas de quarta-feira. ");
					System.out.print("1ª/2ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(0, 2, defAula);
					gradeHoraria.setGrade(1, 2, defAula);
					System.out.print("3ª/4ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(2, 2, defAula);
					gradeHoraria.setGrade(3, 2, defAula);
					System.out.println("");
					System.out.println("Digite as aulas de quinta-feira. ");
					System.out.print("1ª/2ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(0, 3, defAula);
					gradeHoraria.setGrade(1, 3, defAula);
					System.out.print("3ª/4ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(2, 3, defAula);
					gradeHoraria.setGrade(3, 3, defAula);
					System.out.println("");
					System.out.println("Digite as aulas de sexta-feira. ");
					System.out.print("1ª/2ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(0, 4, defAula);
					gradeHoraria.setGrade(1, 4, defAula);
					System.out.print("3ª/4ª Aulas: ");
					defAula = scanner.nextLine();
					gradeHoraria.setGrade(2, 4, defAula);
					gradeHoraria.setGrade(3, 4, defAula);

					System.out.println("");
					System.out.println("----------------------------------");
					System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
					System.out.println("----------------------------------");
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
				System.out.println("Opção inválida.");
				System.out.println("");
				break;
			}
		} while (opcao != 0 && opcao != 1);
	}

}
