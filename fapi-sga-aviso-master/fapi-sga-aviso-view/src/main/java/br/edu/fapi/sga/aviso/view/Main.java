package br.edu.fapi.sga.aviso.view;

import java.util.Scanner;

import br.edu.fapi.sga.aviso.view.funcionario.Coordenador;
import br.edu.fapi.sga.aviso.view.funcionario.DiretorAcademico;
import br.edu.fapi.sga.aviso.view.funcionario.Professor;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Digite seu cargo:");
			System.out.println("1 - Professor");
			System.out.println("2 - Coordenador");
			System.out.println("3 - Diretor Acadêmico");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Professor professor = new Professor();
				professor.manterAviso();
				break;
			case 2:
				Coordenador coordenador = new Coordenador();
				coordenador.manterAviso();
				break;
			case 3:
				DiretorAcademico diretorAcademico = new DiretorAcademico();
				diretorAcademico.manterAviso();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (opcao < 1 || opcao > 3);
	}
}
