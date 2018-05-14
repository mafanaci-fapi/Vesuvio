package br.edu.fapi.sga.gradehoraria.view.operacoes;

import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

public class Listar {

	public void listarGradeHoraria(GradeHoraria gradeHoraria) {
		if (gradeHoraria.getCodigo() == -1) {
			System.out.println("");
			System.out.println("NÃ£o hÃ¡ grades cadastradas.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("LISTA DE TURMAS COM GRADE HORÃ�RIA.");
			System.out.println("----------------------------------");
			System.out.print(gradeHoraria.getTurma());
			System.out.println(" --- ");
			System.out.println("");
		}
	}

}
