package br.edu.fapi.sga.prova.controller.impl;

import br.edu.fapi.sga.prova.business.ProvaBusiness;
import br.edu.fapi.sga.prova.business.impl.ProvaBusinessImpl;
import br.edu.fapi.sga.prova.controller.ProvaController;
import br.edu.fapi.sga.model.prova.Prova;

import java.util.List;

public class ProvaControllerImpl implements ProvaController {

    private ProvaBusiness provaBusiness;

    public ProvaControllerImpl(){

        this.provaBusiness = new ProvaBusinessImpl();
    }

    public void setProvaBusiness(ProvaBusinessImpl provaBusiness){
        this.provaBusiness = provaBusiness;
    }

    @Override
    public int cadastrarProva(Prova prova) {
        return provaBusiness.cadastrarProva(prova);
    }

    @Override
    public Prova pesquisarProva(Prova prova) {
        return provaBusiness.pesquisarProva(prova);
    }

    @Override
    public List<Prova> pesquisarListaProva(Prova prova) {
        return provaBusiness.pesquisarListaProva(prova);
    }

    @Override
    public int atualizarProva(Prova prova) {
        return provaBusiness.atualizarProva(prova);
    }

    @Override
    public int excluirProva(Prova prova) {
        return provaBusiness.excluirProva(prova);
    }
}
