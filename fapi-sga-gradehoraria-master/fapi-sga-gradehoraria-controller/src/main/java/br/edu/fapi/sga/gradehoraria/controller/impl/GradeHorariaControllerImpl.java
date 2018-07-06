package br.edu.fapi.sga.gradehoraria.controller.impl;

import br.edu.fapi.sga.gradehoraria.business.GradeHorariaBusiness;
import br.edu.fapi.sga.gradehoraria.business.impl.GradeHorariaBusinessImpl;
import br.edu.fapi.sga.gradehoraria.controller.GradeHorariaController;
import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;

public class GradeHorariaControllerImpl implements GradeHorariaController {

    private GradeHorariaBusiness gradeHorariaBusiness;

    public GradeHorariaControllerImpl(){

        this.gradeHorariaBusiness = new GradeHorariaBusinessImpl();
    }

    public void setGradeHorariaBusiness(GradeHorariaBusinessImpl gradeHorariaBusiness){
        this.gradeHorariaBusiness = gradeHorariaBusiness;
    }

    @Override
    public int cadastrarGradeHoraria(GradeHoraria gradeHoraria) {
        return gradeHorariaBusiness.cadastrarGradeHoraria(gradeHoraria);
    }

    @Override
    public GradeHoraria pesquisarGradeHoraria(GradeHoraria gradeHoraria) {
        return gradeHorariaBusiness.pesquisarGradeHoraria(gradeHoraria);
    }

    @Override
    public List<GradeHoraria> pesquisarListaGradeHoraria(GradeHoraria gradeHoraria) {
        return gradeHorariaBusiness.pesquisarListaGradeHoraria(gradeHoraria);
    }

    @Override
    public int atualizarGradeHoraria(GradeHoraria gradeHoraria) {
        return gradeHorariaBusiness.atualizarGradeHoraria(gradeHoraria);
    }

    @Override
    public int excluirGradeHoraria(GradeHoraria gradeHoraria) {
        return gradeHorariaBusiness.excluirGradeHoraria(gradeHoraria);
    }
}
