package br.edu.fapi.sga.gradehoraria.business.impl;

import br.edu.fapi.sga.gradehoraria.business.GradeHorariaBusiness;
import br.edu.fapi.sga.gradehoraria.database.GradeHorariaDAO;
import br.edu.fapi.sga.gradehoraria.database.impl.GradeHorariaDAOImpl;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;
import java.util.Scanner;

public class GradeHorariaBusinessImpl implements GradeHorariaBusiness {

    private GradeHorariaDAO gradeHorariaDAO;

    public GradeHorariaBusinessImpl(){

        this.gradeHorariaDAO = new GradeHorariaDAOImpl();

    }

    @Override
    public int cadastrarGradeHoraria(GradeHoraria gradeHoraria) {
        boolean controla;
        Scanner scanner = new Scanner(System.in);

        if(gradeHoraria != null){

            do {
                controla = false;
                Integer temp = gradeHoraria.getCodigo();

                if (temp == null){
                    System.out.println();
                    System.out.println("O codigo da grade nao pode estar vazio. Por favor digite novamente");
                    gradeHoraria.setCodigo(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println();
                } else {
                    controla = true;
                }
            } while (controla == false);


            do {
                controla = false;
                if (gradeHoraria.getCurso().matches("^[0-9]*$") || gradeHoraria.getCurso().isEmpty()) {
                    System.out.println();
                    System.out.println("O nome do curso nao pode conter numeros ou não ser preenchido, por favor digite novamente.");
                    System.out.println();
                    gradeHoraria.setCurso(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);


            do {
                controla = false;
                if (gradeHoraria.getTurma().isEmpty()) {
                    System.out.println();
                    System.out.println("O nome da turma deve ser preenchido, por favor digite novamente.");
                    System.out.println();
                    gradeHoraria.setTurma(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            do {
                controla = false;
                int contador = 0;

                for (int linha = 0; linha < 4; linha++){
                    for (int coluna = 0; coluna < 5; coluna++){

                        if (gradeHoraria.getGrade(linha, coluna).isEmpty()){
                            defineDia(linha, coluna);
                            String palavra = scanner.nextLine();
                            if (linha == 0 || linha == 1) {
                                gradeHoraria.setGrade(0, coluna, palavra);
                                gradeHoraria.setGrade(1, coluna, palavra);
                            }else {
                                gradeHoraria.setGrade(2, coluna, palavra);
                                gradeHoraria.setGrade(3, coluna, palavra);
                            }
                            contador = contador - 1;
                        } else {
                            contador = contador + 1;
                        }
                    }
                }

                if (contador == 20) {
                    controla = true;
                }

            }while (controla == false);

            return gradeHorariaDAO.create(gradeHoraria);

        }else{
            throw new IllegalArgumentException("Valores invalidos.");
        }
    }

    @Override
    public GradeHoraria pesquisarGradeHoraria(GradeHoraria gradeHoraria) {
        if(gradeHoraria != null){
            return gradeHorariaDAO.retrieve(gradeHoraria);
        }else{
            throw new IllegalArgumentException("Valores invalidos.");
        }
    }

    @Override
    public List<GradeHoraria> pesquisarListaGradeHoraria(GradeHoraria gradeHoraria) {
        if(gradeHoraria != null){
            return gradeHorariaDAO.retrieveList(gradeHoraria);
        }else{
            throw new IllegalArgumentException("Valores invalidos.");
        }
    }

    @Override
    public int atualizarGradeHoraria(GradeHoraria gradeHoraria) {
        Scanner scanner = new Scanner(System.in);
        boolean controla = false;

        if(gradeHoraria != null){
            do {
                int contador = 0;

                for (int linha = 0; linha < 4; linha++){
                    for (int coluna = 0; coluna < 5; coluna++){

                        if (gradeHoraria.getGrade(linha, coluna).isEmpty()){
                            defineDia(linha, coluna);
                            String palavra = scanner.nextLine();
                            if (linha == 0 || linha == 1) {
                                gradeHoraria.setGrade(0, coluna, palavra);
                                gradeHoraria.setGrade(1, coluna, palavra);
                            }else {
                                gradeHoraria.setGrade(2, coluna, palavra);
                                gradeHoraria.setGrade(3, coluna, palavra);
                            }
                            contador = contador - 1;
                        } else {
                            contador = contador + 1;
                        }
                    }
                }

                if (contador == 20) {
                    controla = true;
                }

            }while (controla == false);

            return gradeHorariaDAO.update(gradeHoraria);

        }else{
            throw new IllegalArgumentException("Valores invalidos.");
        }
    }

    @Override
    public int excluirGradeHoraria(GradeHoraria gradeHoraria) {
        if(gradeHoraria != null){
            return gradeHorariaDAO.delete(gradeHoraria);
        }else{
            throw new IllegalArgumentException("Valores invalidos.");
        }
    }

    private void defineDia (int linha, int coluna) {
        if (coluna == 0) {
            if (linha == 0 || linha == 1) {
                System.out.println("O nome da materia de Segunda nos horarios: 1/2 nao pode estar vazia. Por favor digite novamente");
            } else {
                System.out.println("O nome da materia de Segunda nos horarios: 3/4 nao pode estar vazia. Por favor digite novamente");
            }
        }else if (coluna == 1){
            if (linha == 0 || linha == 1) {
                System.out.println("O nome da materia de Terca nos horarios: 1/2 nao pode estar vazia. Por favor digite novamente");
            } else {
                System.out.println("O nome da materia de Terca nos horarios: 3/4 nao pode estar vazia. Por favor digite novamente");
            }
        }else if (coluna == 2){
            if (linha == 0 || linha == 1) {
                System.out.println("O nome da materia de Quarta nos horarios: 1/2 nao pode estar vazia. Por favor digite novamente");
            } else {
                System.out.println("O nome da materia de Quarta nos horarios: 3/4 nao pode estar vazia. Por favor digite novamente");
            }
        } else if (coluna == 3) {
            if (linha == 0 || linha == 1) {
                System.out.println("O nome da materia de Quinta nos horarios: 1/2 nao pode estar vazia. Por favor digite novamente");
            } else {
                System.out.println("O nome da materia de Quinta nos horarios: 3/4 nao pode estar vazia. Por favor digite novamente");
            }
        } else {
            if (linha == 0 || linha == 1) {
                System.out.println("O nome da materia de Sexta nos horarios: 1/2 nao pode estar vazia. Por favor digite novamente");
            } else {
                System.out.println("O nome da materia de Sexta nos horarios: 3/4 nao pode estar vazia. Por favor digite novamente");
            }
        }
    }
}
