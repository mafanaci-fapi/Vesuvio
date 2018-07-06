package br.edu.fapi.sga.disciplina.database;

import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.List;

public interface DisciplinaDAO {

    //CRUD - Create Retrieve Update Delete
    //Cadastrar Buscar Atualizar Apagar

    int create(Disciplina disciplina);

    Aluno retrieve(Disciplina disciplina);

    List<Disciplina> retrieveList(Disciplina disciplina);

    int update(Disciplina disciplina);

    int delete(Disciplina disciplina);

}
