package br.edu.fapi.sga.aviso.view.operacoes;

import br.edu.fapi.sga.aviso.controller.AvisoController;
import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.List;

public class Listar {
    public void listarAviso(AvisoController avisoController, Aviso aviso) {
        if (aviso.getCodigo()== -1){
            System.out.println("");
            System.out.println("Não ha avisos cadastrados.");
            System.out.println("");
        }else{
            List<Aviso> listaAvisos = avisoController.pesquisarListaAvisos(aviso);

            System.out.println("");
            System.out.println("----------------");
            System.out.println("LISTA DE AVISOS.");
            System.out.println("----------------");
            listarAviss(listaAvisos);
        }
    }

    private void listarAviss (List<Aviso> listaAvisos){
        for (Aviso avisos : listaAvisos){
            listarOsAvisos(avisos);
        }
    }

    private void listarOsAvisos (Aviso avisos) {
        System.out.println("Titulo: "+avisos.getTitulo());
        System.out.println("Conteudo: "+avisos.getConteudo());
        System.out.println(" --- ");
        System.out.println();
    }
    
}
