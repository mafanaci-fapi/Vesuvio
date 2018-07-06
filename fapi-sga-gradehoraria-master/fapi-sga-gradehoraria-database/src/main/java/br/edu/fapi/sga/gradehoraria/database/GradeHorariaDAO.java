package br.edu.fapi.sga.gradehoraria.database;

import br.edu.fapi.sga.model.gradehoraria.GradeHoraria;

import java.util.List;

public interface GradeHorariaDAO {

    int create(GradeHoraria gradeHoraria);

    GradeHoraria retrieve(GradeHoraria gradeHoraria);

    List<GradeHoraria> retrieveList(GradeHoraria gradeHoraria);

    int update(GradeHoraria gradeHoraria);

    int delete(GradeHoraria gradeHoraria);

}
