package br.edu.fapi.sga.curso.business.impl;

import br.edu.fapi.sga.curso.business.CursoBusiness;
import br.edu.fapi.sga.curso.database.CursoDAO;
import br.edu.fapi.sga.curso.database.impl.CursoDAOImpl;
import br.edu.fapi.sga.model.curso.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CursoBusinessImpl implements CursoBusiness {

    private CursoDAO cursoDAO;

    public CursoBusinessImpl() {

        this.cursoDAO = new CursoDAOImpl();
    }

    @Override
    public int cadastraCurso(Curso curso) {
        boolean controla = false;
        Scanner scanner = new Scanner(System.in);

        if (curso != null){

            do {
                controla = false;
                Integer temp = curso.getCodigo();

                if (temp == null){
                    System.out.println();
                    System.out.println("O codigo do curso nao pode estar vazio. Por favor digite novamente");
                    curso.setCodigo(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println();
                } else {
                    controla = true;
                }
            } while (controla == false);



            do {
                controla = false;
                if (curso.getNome().matches("^[0-9]*$") || curso.getNome().isEmpty()) {
                    System.out.println();
                    System.out.println("O nome do curso nao pode conter numeros ou não ser preenchido, por favor digite novamente.");
                    System.out.println();
                    curso.setNome(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            do {
                controla = false;
                if (curso.getDuracao().isEmpty()) {
                    System.out.println();
                    System.out.println("A duracao do curso deve ser preenchida. Por favor digite novamente.");
                    System.out.println();
                    curso.setDuracao(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            do {
                controla = false;
                List<String> disciplinasAux = curso.getDisciplinas();
                int contador = 0;

                int controlador = curso.tamanhoLista();


                for (int cont = 0; cont < controlador; cont++){
                    if (disciplinasAux.get(cont).isEmpty()){
                        System.out.println();
                        System.out.println("A disciplina "+(cont+1)+" do curso nao pode estar vazia. Por favor digite novamente");
                        disciplinasAux.remove(cont);
                        disciplinasAux.add(cont, scanner.nextLine());
                        System.out.println();
                        contador = contador - 1;
                    } else {
                        contador = contador + 1;
                    }
                }

                if (contador == curso.tamanhoLista()){
                    controla = true;
                }

            } while (controla == false);


            return cursoDAO.create(curso);
        }else{
            throw new IllegalArgumentException("Valores inválidos.");
        }
    }

    @Override
    public Curso pesquisaCurso(Curso curso) {
        if(curso != null){
            return cursoDAO.retrieve(curso);
        }else{
            throw new IllegalArgumentException("Valores inválidos.");
        }
    }

    @Override
    public List<Curso> pesquisaListaCursos(Curso curso) {
        if(curso != null){
            return cursoDAO.retrieveList(curso);
        }else{
            throw new IllegalArgumentException("Valores inválidos.");
        }
    }

    @Override
    public int atualizarCurso(Curso curso) {
        boolean controla = false;
        Scanner scanner = new Scanner(System.in);

        if(curso != null){
            do {
                controla = false;
                if (curso.getNome().matches("^[0-9]*$") || curso.getNome().isEmpty()) {
                    System.out.println();
                    System.out.println("O nome do curso nao pode conter numeros ou não ser preenchido, por favor digite novamente.");
                    System.out.println();
                    curso.setNome(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            do {
                controla = false;
                if (curso.getDuracao().isEmpty()) {
                    System.out.println();
                    System.out.println("A duracao do curso deve ser preenchida. Por favor digite novamente.");
                    System.out.println();
                    curso.setDuracao(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            do {
                controla = false;
                List<String> disciplinasAux = curso.getDisciplinas();
                int contador = 0;

                int controlador = curso.tamanhoLista();


                for (int cont = 0; cont < controlador; cont++){
                    if (disciplinasAux.get(cont).isEmpty()){
                        System.out.println();
                        System.out.println("A disciplina "+(cont+1)+" do curso nao pode estar vazia. Por favor digite novamente");
                        disciplinasAux.remove(cont);
                        disciplinasAux.add(cont, scanner.nextLine());
                        System.out.println();
                        contador = contador - 1;
                    } else {
                        contador = contador + 1;
                    }
                }

                if (contador == curso.tamanhoLista()){
                    controla = true;
                }

            } while (controla == false);

            return cursoDAO.update(curso);
        }else{
            throw new IllegalArgumentException("Valores inválidos");
        }
    }

    @Override
    public int excluirCurso(Curso curso) {
        if(curso != null){
            return cursoDAO.delete(curso);
        }else{
            throw new IllegalArgumentException("Valores inválidos.");
        }
    }
}
