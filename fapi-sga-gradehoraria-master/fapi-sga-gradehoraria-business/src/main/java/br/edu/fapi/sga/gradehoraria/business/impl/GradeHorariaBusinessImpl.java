package br.edu.fapi.sga.gradehoraria.business.impl;

import br.edu.fapi.sga.gradehoraria.business.GradeHorariaBusiness;
import br.edu.fapi.sga.gradehoraria.database.GradeHorariaDAO;
import br.edu.fapi.sga.gradehoraria.database.impl.DummyGradeHorariaDAO;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;
import java.util.Scanner;

public class GradeHorariaBusinessImpl implements GradeHorariaBusiness {

    private GradeHorariaDAO gradeHorariaDAO;

    public GradeHorariaBusinessImpl(){

        this.gradeHorariaDAO = new DummyGradeHorariaDAO();

    }

    @Override
    public int cadastrarGradeHoraria(GradeHoraria gradeHoraria) {
        boolean controla;
        Scanner scanner = new Scanner(System.in);

        if(gradeHoraria != null){

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
        if(gradeHoraria != null){
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
}
