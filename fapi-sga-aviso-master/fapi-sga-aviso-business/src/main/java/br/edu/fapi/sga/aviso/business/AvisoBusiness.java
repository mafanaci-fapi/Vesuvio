package br.edu.fapi.sga.aviso.business;

import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.List;

public interface AvisoBusiness {

    int cadastrarAviso(Aviso aviso);

    Aviso pesquisarAviso(Aviso aviso);

    List<Aviso> pesquisarListaAvisos(Aviso aviso);

    int atualizarAviso(Aviso aviso);

    int excluirAviso(Aviso aviso);

}
