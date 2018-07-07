package br.edu.fapi.sga.curso.view.operacoes;

import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.model.curso.Curso;

import java.util.List;

public class Listar {
	public void listarCurso(CursoController cursoController, Curso curso) {
		if (curso.getCodigo() == -1) {
			System.out.println("");
			System.out.println("Não há cursos cadastrados.");
			System.out.println("");
		} else {
			List<Curso> listaCurso = cursoController.pesquisarListaCurso(curso);

			System.out.println("");
			System.out.println("----------------");
			System.out.println("LISTA DE CURSOS.");
			System.out.println("----------------");
			listarCursos(listaCurso);
			System.out.println("");
		}
	}

	private void listarCursos (List<Curso> listaCurso){
		for (Curso curso : listaCurso){
			listarOsCursos(curso);
		}
	}

	private void listarOsCursos (Curso curso){
		System.out.println("Nome do curso: "+curso.getNome());
		System.out.println("Duracao do curso: "+curso.getDuracao());
		System.out.println("Disciplinas do curso: "+curso.getDisciplinas());
		System.out.println(" --- ");
	}
}
