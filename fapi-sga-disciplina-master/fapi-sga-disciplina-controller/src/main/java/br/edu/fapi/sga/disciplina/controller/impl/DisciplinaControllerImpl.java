package br.edu.fapi.sga.disciplina.controller.impl;

import br.edu.fapi.sga.disciplina.business.impl.DisciplinaBusinessImpl;
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

    
    public int cadastrarDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.cadastrarDisciplina(disciplina);
    }

   
    public Disciplina pesquisarDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.pesquisarDisciplina(disciplina);
    }

    
    public List<Disciplina> pesquisarListaDisciplinas(Disciplina disciplina) {
        return disciplinaBusiness.pesquisarListaDisciplina(disciplina);
    }

    
    public int atualizarDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.atualizarDisciplina(disciplina);
    }

    
    public int excluirDisciplina(Disciplina disciplina) {
        return disciplinaBusiness.excluirDisciplina(disciplina);
    }

	public int excluirAviso(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return 0;
	}
}