package br.edu.fapi.sga.disciplina.controller;

import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.List;

public interface DisciplinaController {

    int cadastrarDisciplina(Disciplina disciplina);

    Disciplina pesquisarDisciplina(Disciplina disciplina);

    List<Disciplina> pesquisarListaDisciplina(Disciplina disciplina);

    int atualizarDisciplina(Disciplina disciplina);

    int excluirDisciplina(Disciplina disciplina);

}
