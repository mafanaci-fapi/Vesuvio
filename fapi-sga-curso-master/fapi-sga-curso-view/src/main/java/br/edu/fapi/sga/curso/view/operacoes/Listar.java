package br.edu.fapi.sga.curso.view.operacoes;

import br.edu.fapi.sga.model.curso.Curso;

public class Listar {
	public void listarCurso(Curso curso) {
		if (curso.getCodigo() == -1) {
			System.out.println("");
			System.out.println("Não há cursos cadastrados.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("----------------");
			System.out.println("LISTA DE CURSOS.");
			System.out.println("----------------");
			System.out.println(curso.getNome());
			System.out.println(" --- ");
			System.out.println("");
		}
	}

}
