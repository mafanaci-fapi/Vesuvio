package br.edu.fapi.sga.gradehoraria.business;

import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;

public interface GradeHorariaBusiness {

    int cadastrarGradeHoraria(GradeHoraria gradeHoraria);

    GradeHoraria pesquisarGradeHoraria(GradeHoraria gradeHoraria);

    List<GradeHoraria> pesquisarListaGradeHoraria(GradeHoraria gradeHoraria);

    int atualizarGradeHoraria(GradeHoraria gradeHoraria);

    int excluirGradeHoraria(GradeHoraria gradeHoraria);
}
