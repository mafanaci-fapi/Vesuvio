package br.edu.fapi.sga.prova.database;

import br.edu.fapi.sga.model.prova.Prova;

import java.util.List;

public interface ProvaDAO {

    int create(Prova prova);

    Prova retrieve(Prova prova);

    List<Prova> retrieveList(Prova prova);

    int update(Prova prova);

    int delete(Prova prova);

}
