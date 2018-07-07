package br.edu.fapi.sga.aviso.database.impl;

import br.edu.fapi.sga.aviso.database.AvisoDAO;
import br.edu.fapi.sga.model.aviso.Aviso;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.ArrayList;
import java.util.List;

public class AvisoDAOImpl implements AvisoDAO {

    @Override
    public int create(Aviso aviso) {
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("CADASTRO REALIZADO COM SUCESSO.");
        System.out.println("-------------------------------");
        System.out.println("");
        return 1;
    }

    @Override
    public Aviso retrieve(Aviso aviso) {
        Aviso avisoResultado = aviso;

        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("PESQUISA DE GRADE HORARIA.");
        System.out.println("--------------------------");
        System.out.println("");

        return avisoResultado;
    }

    @Override
    public List<Aviso> retrieveList(Aviso aviso) {
        System.out.println("Data Layer -> Avisos pesquisados com sucesso");

        Aviso avisoResultado1 = new Aviso();
        avisoResultado1.setCodigo(1);
        avisoResultado1.setTitulo("Volta as Aulas");
        avisoResultado1.setConteudo("Informamos que voltaremos as aulas no dia 30/07.");

        Aviso avisoResultado2 = new Aviso();
        avisoResultado2.setCodigo(1);
        avisoResultado2.setTitulo("Rematricula");
        avisoResultado2.setConteudo("Informamos que o periodo de rematricula ocorrera do dia 01/01 ao dia 31/12.");

        ArrayList<Aviso> listaAvisos = new ArrayList<>();
        listaAvisos.add(avisoResultado1);
        listaAvisos.add(avisoResultado2);

        return listaAvisos;
    }

    @Override
    public int update(Aviso aviso) {

        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("ATUALIZACAO REALIZADA COM SUCESSO.");
        System.out.println("----------------------------------");
        System.out.println("");

        return 1;
    }

    @Override
    public int delete(Aviso aviso) {

        aviso.setCodigo(-1);

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("AVISO EXCLUIDO COM SUCESSO.");
        System.out.println("---------------------------");
        System.out.println("");

        return 1;
    }
}
