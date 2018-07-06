package br.edu.fapi.sga.disciplina.business.impl;

import br.edu.fapi.sga.disciplina.business.DisciplinaBusiness;
import br.edu.fapi.sga.disciplina.database.DisciplinaDAO;
import br.edu.fapi.sga.disciplina.database.impl.DummyDisciplinaDAO;
import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.List;

public class DisciplinaBusinessImpl implements DisciplinaBusiness{

    private DisciplinaDAO disciplinaDAO;

    public DisciplinaBusinessImpl(){
        this.disciplinaDAO = new DummyDisciplinaDAO();
    }

    public void setDisciplinaDAO(DisciplinaDAO disciplinaDAO) {
        this.disciplinaDAO = disciplinaDAO;
    }

   
    public int cadastrarDisciplina(Disciplina disciplina) {
        

        if(disciplina != null){
            return disciplinaDAO.create(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido");
        }
    }

    
    public Disciplina pesquisarDisciplina(Disciplina disciplina) {
     
        if(disciplina != null){
            return disciplinaDAO.retrieve(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido");
        }
    }

    
    public List<Disciplina> pesquisarListadisciplinas(Disciplina disciplina) {
        if(disciplina != null){
            return disciplinaDAO.retrieveList(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido");
        }
    }

   
    public int atualizarDisciplina(Disciplina disciplina) {
        if(disciplina != null){
            return disciplinaDAO.update(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido");
        }
    }

   
    public int excluirDisciplina(Disciplina disciplina) {
        if(disciplina != null){
            return disciplinaDAO.delete(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido");
        }
    }

	public Disciplina pesquisarAviso(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Disciplina> pesquisarListaDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		return null;
	}
}
