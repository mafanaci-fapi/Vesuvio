package br.edu.fapi.sga.aviso.view.operacoes;

import br.edu.fapi.sga.model.aviso.Aviso;

public class Listar {
    public void listarAviso(Aviso aviso) {
        if (aviso.getCodigo()== -1){
            System.out.println("");
            System.out.println("Não há avisos cadastrados.");
            System.out.println("");
        }else{  
            System.out.println("");
            System.out.println("----------------");
            System.out.println("LISTA DE AVISOS.");
            System.out.println("----------------");
            System.out.println(aviso.getTitulo());
            System.out.println(" --- ");
            System.out.println("");
        }
    }
    
}
