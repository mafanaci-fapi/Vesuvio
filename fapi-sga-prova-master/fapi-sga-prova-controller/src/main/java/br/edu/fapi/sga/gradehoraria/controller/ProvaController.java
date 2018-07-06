package br.edu.fapi.sga.prova.controller;

import br.edu.fapi.sga.model.prova.Prova;

import java.util.List;

public interface ProvaController {

    int cadastrarProva(Prova prova);

    Prova pesquisarProva(Prova prova);

    List<Prova> pesquisarListaProva(Prova prova);

    int atualizarProva(Prova prova);

    int excluirProva(Prova prova);
}
