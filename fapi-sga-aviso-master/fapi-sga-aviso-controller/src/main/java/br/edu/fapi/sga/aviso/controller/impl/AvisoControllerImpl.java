package br.edu.fapi.sga.aviso.controller.impl;

import br.edu.fapi.sga.aviso.business.impl.AvisoBusinessImpl;
import br.edu.fapi.sga.aviso.controller.AvisoController;
import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.List;

public class AvisoControllerImpl implements AvisoController {

    private AvisoBusinessImpl avisoBusiness;

    public AvisoControllerImpl() {

        this.avisoBusiness = new AvisoBusinessImpl();
    }

    public void setAvisoBusiness(AvisoBusinessImpl avisoBusiness) {

        this.avisoBusiness = avisoBusiness;
    }

    @Override
    public int cadastrarAviso(Aviso aviso) {
        return avisoBusiness.cadastrarAviso(aviso);
    }

    @Override
    public Aviso pesquisarAviso(Aviso aviso) {

        return avisoBusiness.pesquisarAviso(aviso);
    }

    @Override
    public List<Aviso> pesquisarListaAvisos(Aviso aviso) {

        return avisoBusiness.pesquisarListaAvisos(aviso);
    }

    @Override
    public int atualizarAviso(Aviso aviso) {

        return avisoBusiness.atualizarAviso(aviso);
    }

    @Override
    public int excluirAviso(Aviso aviso) {

        return avisoBusiness.excluirAviso(aviso);
    }
}
