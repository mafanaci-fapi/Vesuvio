package br.edu.fapi.sga.gradehoraria.database.impl;

import br.edu.fapi.sga.gradehoraria.database.GradeHorariaDAO;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.ArrayList;
import java.util.List;

public class DummyGradeHorariaDAO implements GradeHorariaDAO {

    @Override
    public int create(GradeHoraria gradeHoraria) {
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("CADASTRO REALIZADO COM SUCESSO.");
        System.out.println("-------------------------------");
        System.out.println("");
        return 1;
    }

    @Override
    public GradeHoraria retrieve(GradeHoraria gradeHoraria) {
        System.out.println("Grade Horária:");
        System.out.println("");
        GradeHoraria gradeHorariaResultado = new GradeHoraria();
        gradeHorariaResultado.setCodigo(gradeHoraria.getCodigo());
        gradeHorariaResultado.setCurso(gradeHoraria.getCurso());
        gradeHorariaResultado.setTurma(gradeHoraria.getTurma());
        gradeHorariaResultado.setGrade(0,0, gradeHoraria.getGrade(0,0));
        gradeHorariaResultado.setGrade(1,0,gradeHoraria.getGrade(1,0));
        gradeHorariaResultado.setGrade(2,0,gradeHoraria.getGrade(2,0));
        gradeHorariaResultado.setGrade(3,0,gradeHoraria.getGrade(3,0));

        gradeHorariaResultado.setGrade(0,1,gradeHoraria.getGrade(0,1));
        gradeHorariaResultado.setGrade(1,1,gradeHoraria.getGrade(1,1));
        gradeHorariaResultado.setGrade(2,1,gradeHoraria.getGrade(2,1));
        gradeHorariaResultado.setGrade(3,1,gradeHoraria.getGrade(3,1));

        gradeHorariaResultado.setGrade(0,2,gradeHoraria.getGrade(0,2));
        gradeHorariaResultado.setGrade(1,2,gradeHoraria.getGrade(1,2));
        gradeHorariaResultado.setGrade(2,2,gradeHoraria.getGrade(2,2));
        gradeHorariaResultado.setGrade(3,2,gradeHoraria.getGrade(3,2));

        gradeHorariaResultado.setGrade(0,3,gradeHoraria.getGrade(0,3));
        gradeHorariaResultado.setGrade(1,3,gradeHoraria.getGrade(1,3));
        gradeHorariaResultado.setGrade(2,3,gradeHoraria.getGrade(2,3));
        gradeHorariaResultado.setGrade(3,3,gradeHoraria.getGrade(3,3));

        gradeHorariaResultado.setGrade(0,4,gradeHoraria.getGrade(0,4));
        gradeHorariaResultado.setGrade(1,4,gradeHoraria.getGrade(1,4));
        gradeHorariaResultado.setGrade(2,4,gradeHoraria.getGrade(2,4));
        gradeHorariaResultado.setGrade(3,4,gradeHoraria.getGrade(3,4));

        return gradeHorariaResultado;
    }

    @Override
    public List<GradeHoraria> retrieveList(GradeHoraria gradeHoraria){
        System.out.println("Grades pesquisadas com sucesso.");

        GradeHoraria gradeHorariaResultado1 = new GradeHoraria();
        GradeHoraria gradeHorariaResultado2 = new GradeHoraria();
        GradeHoraria gradeHorariaResultado3 = new GradeHoraria();

        gradeHorariaResultado1.setCodigo(1);
        gradeHorariaResultado1.setCurso("Analise e Desenvolvimento de Sistemas");
        gradeHorariaResultado1.setTurma("TADS 4º Periodo");
        gradeHorariaResultado1.setGrade(0 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado1.setGrade(1 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado1.setGrade(2 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado1.setGrade(3 , 0 ,"Desenvolvimento Web");

        gradeHorariaResultado1.setGrade( 0, 1 ,"Banco de Dados II");
        gradeHorariaResultado1.setGrade( 1, 1 ,"Banco de Dados II");
        gradeHorariaResultado1.setGrade( 2, 1 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado1.setGrade( 3, 1 ,"Programacao Orientada a Objetos");

        gradeHorariaResultado1.setGrade(0 , 2 ,"Analise e Projeto");
        gradeHorariaResultado1.setGrade(1 , 2 ,"Analise e Projeto");
        gradeHorariaResultado1.setGrade(2 , 2 ,"Engenharia de Software");
        gradeHorariaResultado1.setGrade(3 , 2 ,"Engenharia de Software");

        gradeHorariaResultado1.setGrade(0 , 3 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado1.setGrade(1 , 3 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado1.setGrade(2 , 3 ,"Banco de Dados II");
        gradeHorariaResultado1.setGrade(3 , 3 ,"Banco de Dados II");

        gradeHorariaResultado1.setGrade(0 , 4 ,"Engenharia de Software");
        gradeHorariaResultado1.setGrade(1 , 4 ,"Engenharia de Software");
        gradeHorariaResultado1.setGrade(2 , 4 ,"Analise e Projeto");
        gradeHorariaResultado1.setGrade(3 , 4 ,"Analise e Projeto");


        gradeHorariaResultado2.setCodigo(2);
        gradeHorariaResultado2.setCurso("Administracao");
        gradeHorariaResultado2.setTurma("TADS 4º Periodo");
        gradeHorariaResultado2.setGrade(0 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado2.setGrade(1 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado2.setGrade(2 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado2.setGrade(3 , 0 ,"Desenvolvimento Web");

        gradeHorariaResultado2.setGrade(0 , 1 ,"Banco de Dados II");
        gradeHorariaResultado2.setGrade(1 , 1 ,"Banco de Dados II");
        gradeHorariaResultado2.setGrade(2 , 1 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado2.setGrade(3 , 1 ,"Programacao Orientada a Objetos");

        gradeHorariaResultado2.setGrade(0 , 2 ,"Analise e Projeto");
        gradeHorariaResultado2.setGrade(1 , 2 ,"Analise e Projeto");
        gradeHorariaResultado2.setGrade(2 , 2 ,"Engenharia de Software");
        gradeHorariaResultado2.setGrade(3 , 2 ,"Engenharia de Software");

        gradeHorariaResultado2.setGrade(0 , 3 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado2.setGrade(1 , 3 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado2.setGrade(2 , 3 ,"Banco de Dados II");
        gradeHorariaResultado2.setGrade(3 , 3 ,"Banco de Dados II");

        gradeHorariaResultado2.setGrade(0 , 4 ,"Engenharia de Software");
        gradeHorariaResultado2.setGrade(1 , 4 ,"Engenharia de Software");
        gradeHorariaResultado2.setGrade(2 , 4 ,"Analise e Projeto");
        gradeHorariaResultado2.setGrade(3 , 4 ,"Analise e Projeto");


        gradeHorariaResultado2.setCodigo(3);
        gradeHorariaResultado2.setCurso("Logistica");
        gradeHorariaResultado2.setTurma("Logistica 3º Periodo");
        gradeHorariaResultado2.setGrade(0 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado2.setGrade(1 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado2.setGrade(2 , 0 ,"Desenvolvimento Web");
        gradeHorariaResultado2.setGrade(3 , 0 ,"Desenvolvimento Web");

        gradeHorariaResultado2.setGrade(0 , 1 ,"Banco de Dados II");
        gradeHorariaResultado2.setGrade(1 , 1 ,"Banco de Dados II");
        gradeHorariaResultado2.setGrade(2 , 1 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado2.setGrade(3 , 1 ,"Programacao Orientada a Objetos");

        gradeHorariaResultado2.setGrade(0 , 2 ,"Analise e Projeto");
        gradeHorariaResultado2.setGrade(1 , 2 ,"Analise e Projeto");
        gradeHorariaResultado2.setGrade(2 , 2 ,"Engenharia de Software");
        gradeHorariaResultado2.setGrade(3 , 2 ,"Engenharia de Software");

        gradeHorariaResultado2.setGrade(0 , 3 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado2.setGrade(1 , 3 ,"Programacao Orientada a Objetos");
        gradeHorariaResultado2.setGrade(2 , 3 ,"Banco de Dados II");
        gradeHorariaResultado2.setGrade(3 , 3 ,"Banco de Dados II");

        gradeHorariaResultado2.setGrade(0 , 4 ,"Engenharia de Software");
        gradeHorariaResultado2.setGrade(1 , 4 ,"Engenharia de Software");
        gradeHorariaResultado2.setGrade(2 , 4 ,"Analise e Projeto");
        gradeHorariaResultado2.setGrade(3 , 4 ,"Analise e Projeto");

        ArrayList<GradeHoraria> listaGradesHorarias = new ArrayList();
        listaGradesHorarias.add(gradeHorariaResultado1);
        listaGradesHorarias.add(gradeHorariaResultado2);
        listaGradesHorarias.add(gradeHorariaResultado3);

        return listaGradesHorarias;

    }

    @Override
    public int update(GradeHoraria gradeHoraria){
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
        System.out.println("----------------------------------");
        System.out.println("");
        return 1;
    }

    @Override
    public int delete(GradeHoraria gradeHoraria){
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("GRADE EXCLUIDA COM SUCESSO.");
        System.out.println("---------------------------");
        System.out.println("");
        return 1;
    }
}
