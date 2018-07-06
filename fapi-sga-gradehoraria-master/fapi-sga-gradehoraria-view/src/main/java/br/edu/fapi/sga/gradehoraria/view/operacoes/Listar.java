package br.edu.fapi.sga.gradehoraria.view.operacoes;

import br.edu.fapi.sga.gradehoraria.controller.GradeHorariaController;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;

public class Listar {

	public void listarGradeHoraria(GradeHorariaController gradeHorariaController, GradeHoraria gradeHoraria) {
		if (gradeHoraria.getCodigo() == -1) {
			System.out.println("");
			System.out.println("Nao ha grades cadastradas.");
			System.out.println("");
		} else {
			List<GradeHoraria> listaGradeHoraria = gradeHorariaController.pesquisarListaGradeHoraria(gradeHoraria);


			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("LISTA DE TURMAS COM GRADE HORARIA.");
			System.out.println("----------------------------------");
			System.out.print("Turma: " + gradeHoraria.getTurma());
			System.out.println("Curso:" + gradeHoraria.getCurso());
			listarGradeHorario(listaGradeHoraria);



		}
	}

	private void listarGradeHorario(List<GradeHoraria> gradeHorarias){
		for(GradeHoraria gradeHoraria : gradeHorarias){
			listarGradeHoraria(gradeHoraria);
		}

	}

	private void listarGradeHoraria(GradeHoraria gradeHoraria){
		System.out.print("Turma: " + gradeHoraria.getTurma());
		System.out.println("Curso:" + gradeHoraria.getCurso());
		System.out.println(" --- ");
		System.out.println("");
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.printf("%35s", gradeHoraria.getGrade(linha, coluna));
			}
			System.out.println("");
		}
		System.out.println(" --- ");
		System.out.println("");
	}

}
