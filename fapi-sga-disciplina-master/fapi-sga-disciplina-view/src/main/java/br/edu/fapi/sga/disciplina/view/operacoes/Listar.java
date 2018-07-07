package br.edu.fapi.sga.disciplina.view.operacoes;

import br.edu.fapi.sga.model.disciplina.Disciplina;

public class Listar {
	public void listarDisciplina(Disciplina disciplina) {
		if (disciplina.getCodigo() == -1) {
			System.out.println("");
			System.out.println("Não há disciplinas cadastradas.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("---------------------");
			System.out.println("LISTA DE DISCIPLINAS.");
			System.out.println("---------------------");
			System.out.println(disciplina.getNome());
			System.out.println(" --- ");
			System.out.println("");
		}
	}
}