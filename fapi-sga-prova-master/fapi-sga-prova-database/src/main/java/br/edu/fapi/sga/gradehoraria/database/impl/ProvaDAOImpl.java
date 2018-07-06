package br.edu.fapi.sga.prova.database.impl;

import br.edu.fapi.sga.prova.database.ProvaDAO;
import br.edu.fapi.sga.model.prova.Prova;

import java.util.ArrayList;
import java.util.List;

public class ProvaDAOImpl implements ProvaDAO {

    @Override
    public int create(Prova prova) {
        System.out.println("\n-------------------------------");
        System.out.println("CADASTRO REALIZADO COM SUCESSO.");
        System.out.println("-------------------------------\n");
        return 1;
    }

    @Override
    public Prova retrieve(Prova prova) {
        System.out.println("Prova:\n");
        
        Prova provaResultado = new Prova();
        provaResultado.setCodigo(prova.getCodigo());
        provaResultado.setDisciplina(prova.getDisciplina());
        provaResultado.setTurma(prova.getTurma());
        
        System.out.println("\n--------------------------");
        System.out.println("PESQUISA DE PROVAS.");
        System.out.println("--------------------------\n");

        return provaResultado;
    }

    @Override
    public List<Prova> retrieveList(Prova prova){
        System.out.println("Provas:");

        Prova provaResultado1 = new Prova();
        Prova provaResultado2 = new Prova();
        Prova provaResultado3 = new Prova();

        provaResultado1.setCodigo(1);
        provaResultado1.setTurma("4º Período");
        

        ArrayList<Prova> listaProvas = new ArrayList();
        listaProvas.add(provaResultado1);
        listaProvas.add(provaResultado2);
        listaProvas.add(provaResultado3);

        return listaProvas;

    }

    @Override
    public int update(Prova prova){
        System.out.println("\n----------------------------------");
        System.out.println("ATUALIZAÃ‡ÃƒO REALIZADA COM SUCESSO.");
        System.out.println("----------------------------------\n");
        return 1;
    }

    @Override
    public int delete(Prova prova){
        prova.setCodigo(-1);

        System.out.println("\n---------------------------");
        System.out.println("PROVA EXCLUIDA COM SUCESSO.");
        System.out.println("---------------------------\n");
        return 1;
    }
}
