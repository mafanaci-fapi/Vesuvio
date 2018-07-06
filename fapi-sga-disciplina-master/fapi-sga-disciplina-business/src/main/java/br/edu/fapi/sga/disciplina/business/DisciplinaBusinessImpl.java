package br.edu.fapi.sga.aluno.business;

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

    @Override
    public int cadastrarDisciplina(Disciplina disciplina) {

        if(disciplina != null){
            return disciplinaDAO.create(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public Disciplina pesquisarDisciplina(Disciplina disciplina) {
        
    	if(disciplina != null){
            return disciplinaDAO.retrieve(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public List<Disciplina> pesquisarListadisciplina(Disciplina disciplina) {
        if(disciplina != null){
            return disciplinaDAO.retrieveList(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public int atualizarDisciplina(Disciplina disciplina) {
        if(disciplina != null){
            return disciplinaDAO.update(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public int excluirDisciplina(Disciplina disciplina) {
        if(disciplina != null){
            return disciplinaDAO.delete(disciplina);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }
}
