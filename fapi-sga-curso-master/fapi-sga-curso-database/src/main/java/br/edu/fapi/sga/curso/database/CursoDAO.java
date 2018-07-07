package br.edu.fapi.sga.curso.database;

import br.edu.fapi.sga.model.aviso.Aviso;
import br.edu.fapi.sga.model.curso.Curso;

import java.util.List;

public interface CursoDAO {

    int create(Curso curso);

    Curso retrieve(Curso curso);

    List<Curso> retrieveList(Curso curso);

    int update(Curso curso);

    int delete(Curso curso);
}
