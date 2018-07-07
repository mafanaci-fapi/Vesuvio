package br.edu.fapi.sga.disciplina.business;


import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.List;

public interface DisciplinaBusiness {

    int cadastrarDisciplina(Disciplina disciplina);

    Disciplina pesquisarAviso(Disciplina disciplina);

    List<Disciplina> pesquisarListaDisciplina(Disciplina disciplina);

    int atualizarDisciplina(Disciplina disciplina);

    int excluirDisciplina(Disciplina disciplina);

}
