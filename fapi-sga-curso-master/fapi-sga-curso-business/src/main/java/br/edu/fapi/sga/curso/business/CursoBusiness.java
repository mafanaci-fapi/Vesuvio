package br.edu.fapi.sga.curso.business;

import br.edu.fapi.sga.model.curso.Curso;

import java.util.List;

public interface CursoBusiness {

    int cadastraCurso (Curso curso);

    Curso pesquisaCurso (Curso curso);

    List<Curso> pesquisaListaCursos (Curso curso);

    int atualizarCurso (Curso curso);

    int excluirCurso (Curso curso);

}
