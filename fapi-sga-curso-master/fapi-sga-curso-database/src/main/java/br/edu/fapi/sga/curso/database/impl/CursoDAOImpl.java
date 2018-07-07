package br.edu.fapi.sga.curso.database.impl;

import br.edu.fapi.sga.curso.database.CursoDAO;
import br.edu.fapi.sga.model.curso.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoDAOImpl implements CursoDAO {
    @Override
    public int create(Curso curso) {
        System.out.println("-------------------------------");
        System.out.println("CADASTRO REALIZADO COM SUCESSO.");
        System.out.println("-------------------------------");
        System.out.println("");
        return 1;
    }

    @Override
    public Curso retrieve(Curso curso) {
        Curso cursoResultado = curso;

        System.out.println("");
        System.out.println("------------------");
        System.out.println("PESQUISA DE CURSO.");
        System.out.println("------------------");
        System.out.println("");

        return cursoResultado;
    }

    @Override
    public List<Curso> retrieveList(Curso curso) {
        Curso cursoResultado1 = new Curso();
        Curso cursoResultado2 = new Curso();
        Curso cursoResultado3 = new Curso();
        List<String> disciplinasAux1 = new ArrayList();
        List<String> disciplinasAux2 = new ArrayList();
        List<String> disciplinasAux3 = new ArrayList();
        List<Curso> listaCursos = new ArrayList();

        cursoResultado1.setCodigo(1);
        cursoResultado1.setNome("Analise e Desenvolvimento de Sistemas");
        cursoResultado1.setDuracao("2,5 Anos");
        disciplinasAux1.add("Programacao Orientada a Objetos");
        disciplinasAux1.add("Banco de Dados II");
        disciplinasAux1.add("Desenvolvimento Web");
        cursoResultado1.setDisciplinas(disciplinasAux1);

        listaCursos.add(cursoResultado1);

        cursoResultado2.setCodigo(2);
        cursoResultado2.setNome("Administracao");
        cursoResultado2.setDuracao("4 Anos");
        disciplinasAux2.add("Contabilidade");
        disciplinasAux2.add("Fundamentos da Administracao");
        disciplinasAux2.add("Calculo");
        cursoResultado2.setDisciplinas(disciplinasAux2);

        listaCursos.add(cursoResultado2);

        cursoResultado3.setCodigo(3);
        cursoResultado3.setNome("Direito");
        cursoResultado3.setDuracao("5 Anos");
        disciplinasAux3.add("Penal");
        disciplinasAux3.add("Civil");
        disciplinasAux3.add("Trabalhista");
        cursoResultado3.setDisciplinas(disciplinasAux3);

        listaCursos.add(cursoResultado3);

        return listaCursos;
    }

    @Override
    public int update(Curso curso) {
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("ATUALIZACAO REALIZADA COM SUCESSO.");
        System.out.println("----------------------------------");
        System.out.println("");

        return 1;
    }

    @Override
    public int delete(Curso curso) {
        curso.setCodigo(-1);

        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("CURSO EXCLUIDO COM SUCESSO.");
        System.out.println("---------------------------");
        System.out.println("");

        return 1;
    }
}
