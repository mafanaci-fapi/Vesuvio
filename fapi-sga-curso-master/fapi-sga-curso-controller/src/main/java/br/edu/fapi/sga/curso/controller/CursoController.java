package br.edu.fapi.sga.curso.controller;

import br.edu.fapi.sga.model.curso.Curso;

import java.util.List;

public interface CursoController {

    int cadastrarCurso(Curso curso);

    Curso pesquisarCurso(Curso curso);

    List<Curso> pesquisarListaCurso(Curso curso);

    int atualizarCurso (Curso curso);

    int excluirCurso (Curso curso);
}
