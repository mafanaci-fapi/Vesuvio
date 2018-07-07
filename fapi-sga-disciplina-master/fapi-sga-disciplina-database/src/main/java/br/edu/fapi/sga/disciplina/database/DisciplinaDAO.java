package br.edu.fapi.sga.disciplina.database;

import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.List;

public interface DisciplinaDAO {

   
    int create(Disciplina disciplina);

    Disciplina retrieve(Disciplina disciplina);

    List<Disciplina> retrieveList(Disciplina disciplina);

    int update(Disciplina disciplina);

    int delete(Disciplina disciplina);

}