package br.edu.fapi.sga.disciplina.database.impl;

import br.edu.fapi.sga.disciplina.database.DisciplinaDAO;
import br.edu.fapi.sga.model.disciplina.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DummyDisciplinaDAO implements DisciplinaDAO {

    @Override
    public int create(Disciplina disciplina) {
        System.out.println("Data Layer -> Disciplina cadastrado com sucesso");
        return 1;
    }

    @Override
    public Disciplina retrieve(Disciplina disciplina) {
        System.out.println("Data Layer -> Disciplina pesquisada com sucesso");
        Disciplina Resultado = new Disciplina();
        disciplinaResultado.setCodigo(1);
        disciplinaResultado.setConteudo("Teste Conteudo");
        disciplinaResultado.setTitulo("Teste Titulo");
        return disciplinaResultado;
    }

    @Override
    public List<Disciplina> retrieveList(Disciplina disciplina) {
        System.out.println("Data Layer -> Disciplina Listada com sucesso");

        Disciplina disciplinaResultado1 = new Disciplina();
        disciplinaResultado1.setCodigo(1);
        disciplinaResultado1.setConteudo("Teste Conteudo 1");
        disciplinaResultado1.setTitulo("Teste Titulo 1");

        Disciplina disciplinaResultado2 = new Disciplina();
        disciplinaResultado2.setCodigo(1);
        disciplinaResultado2.setConteudo("Teste Conteudo 2");
        disciplinaResultado2.setTitulo("Teste Titulo 2");

        ArrayList<Disciplina> listaDisciplina = new ArrayList<>();
        listaDisciplina.add(disciplinaResultado1);
        listaDisciplina.add(disciplinaResultado2);

        return listaDisciplina;
    }

    @Override
    public int update(Disciplina disciplina) {
        System.out.println("Data Layer -> Disciplina atualizada com sucesso");
        return 1;
    }

    @Override
    public int delete(Disciplina disciplina) {
        System.out.println("Data Layer -> Disciplina apagada com sucesso");
        return 1;
    }
}
