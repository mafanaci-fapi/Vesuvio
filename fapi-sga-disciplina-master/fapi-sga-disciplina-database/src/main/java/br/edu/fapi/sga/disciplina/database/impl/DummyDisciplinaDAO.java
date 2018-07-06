package br.edu.fapi.sga.disciplina.database.impl;

import br.edu.fapi.sga.disciplina.database.DisciplinaDAO;
import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DummyDisciplinaDAO implements DisciplinaDAO {

    public int create(Disciplina disciplina) {
        System.out.println("Disciplina cadastrada com sucesso");
        return 1;
    }

    public Disciplina retrieve(Disciplina disciplina) {
        System.out.println("Disciplina pesquisada com sucesso");
        Disciplina disciplinaResultado = new Disciplina();
        disciplinaResultado.setCodigo(1);
        return disciplinaResultado;
    }

 
    public List<Disciplina> retrieveList(Disciplina disciplina) {
        System.out.println("Disciplina pesquisada com sucesso");

        Disciplina disciplinaResultado1 = new Disciplina();
        disciplinaResultado1.setCodigo(1);
      

        Disciplina disciplinaResultado2 = new Disciplina();
        disciplinaResultado2.setCodigo(1);
       

        ArrayList<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
        listaDisciplina.add(disciplinaResultado1);
        listaDisciplina.add(disciplinaResultado2);

        return listaDisciplina;
    }

   
    public int update(Disciplina disciplina) {
        System.out.println("Disciplina atualizada com sucesso");
        return 1;
    }

    
    public int delete(Disciplina disciplina) {
        System.out.println("Disciplina apagada com sucesso");
        return 1;
    }

	
	
}
