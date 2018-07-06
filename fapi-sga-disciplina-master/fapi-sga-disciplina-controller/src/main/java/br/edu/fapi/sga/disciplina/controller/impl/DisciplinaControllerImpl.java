package br.edu.fapi.sga.disciplina.controller.impl;

import br.edu.fapi.sga.disciplina.business.DisciplinaBusinessImpl;
import br.edu.fapi.sga.disciplina.controller.DisciplinaController;
import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.List;

public class DisciplinaControllerImpl implements DisciplinaController {

    private DisciplinaBusinessImpl disciplinaBusiness;

    public DisciplinaControllerImpl() {
        this.disciplinaBusiness = new DisciplinaBusinessImpl();
    }

    public void setDisciplinaBusiness(DisciplinaBusinessImpl disciplinaBusiness) {
        this.disciplinaBusiness = disciplinaBusiness;
    }

    @Override
    public int cadastrarDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.cadastrarDisciplina(disciplina);
    }

    @Override
    public Disciplina pesquisarDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.pesquisarDisciplina(disciplina);
    }

    @Override
    public List<Disciplina> pesquisarListaDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.pesquisarListaDisciplina(disciplina);
    }

    @Override
    public int atualizarDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.atualizarDisciplina(disciplina);
    }

    @Override
    public int excluirDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.excluirDisciplina(disciplina);
    }
}
