package br.edu.fapi.sga.curso.controller.impl;

import br.edu.fapi.sga.curso.business.impl.CursoBusinessImpl;
import br.edu.fapi.sga.curso.controller.CursoController;
import br.edu.fapi.sga.model.curso.Curso;

import java.util.List;

public class CursoControllerImpl implements CursoController {

    private CursoBusinessImpl cursoBusiness;

    public CursoControllerImpl(){

        this.cursoBusiness = new CursoBusinessImpl();
    }

    public void setCursoBusiness (CursoBusinessImpl cursoBusiness){

        this.cursoBusiness = cursoBusiness;
    }

    @Override
    public int cadastrarCurso(Curso curso) {

        return cursoBusiness.cadastraCurso(curso);
    }

    @Override
    public Curso pesquisarCurso(Curso curso) {

        return cursoBusiness.pesquisaCurso(curso);
    }

    @Override
    public List<Curso> pesquisarListaCurso(Curso curso) {

        return cursoBusiness.pesquisaListaCursos(curso);
    }

    @Override
    public int atualizarCurso(Curso curso) {

        return cursoBusiness.atualizarCurso(curso);
    }

    @Override
    public int excluirCurso(Curso curso) {

        return cursoBusiness.excluirCurso(curso);
    }
}
