package br.edu.fapi.sga.gradehoraria.controller;

import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;

public interface GradeHorariaController {

    int cadastrarGradeHoraria(GradeHoraria gradeHoraria);

    GradeHoraria pesquisarGradeHoraria(GradeHoraria gradeHoraria);

    List<GradeHoraria> pesquisarListaGradeHoraria(GradeHoraria gradeHoraria);

    int atualizarGradeHoraria(GradeHoraria gradeHoraria);

    int excluirGradeHoraria(GradeHoraria gradeHoraria);
}
