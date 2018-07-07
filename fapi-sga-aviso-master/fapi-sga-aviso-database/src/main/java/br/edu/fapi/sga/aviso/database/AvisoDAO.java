package br.edu.fapi.sga.aviso.database;

import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.List;

public interface AvisoDAO {

    //CRUD - Create Retrieve Update Delete
    //Cadastrar Buscar Atualizar Apagar

    int create(Aviso aviso);

    Aviso retrieve(Aviso aviso);

    List<Aviso> retrieveList(Aviso aviso);

    int update(Aviso aviso);

    int delete(Aviso aviso);

}
