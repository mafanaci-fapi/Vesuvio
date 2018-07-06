
package br.edu.fapi.sga.aluno.database;

import br.edu.fapi.sga.model.aluno.Aluno;

import java.util.List;

public interface AlunoDAO {

    

    int create(Aluno aluno);

    Aluno retrieve(Aluno aluno);

    List<Aluno> retrieveList(Aluno aluno);

    int update(Aluno aluno);

    int delete(Aluno aluno);

}
