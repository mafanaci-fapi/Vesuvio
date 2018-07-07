package br.edu.fapi.sga.aviso.business.impl;

import br.edu.fapi.sga.aviso.business.AvisoBusiness;
import br.edu.fapi.sga.aviso.database.AvisoDAO;
import br.edu.fapi.sga.aviso.database.impl.AvisoDAOImpl;
import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.List;
import java.util.Scanner;

public class AvisoBusinessImpl implements AvisoBusiness{

    private AvisoDAO avisoDAO;

    public AvisoBusinessImpl(){

        this.avisoDAO = new AvisoDAOImpl();
    }

    public void setAvisoDAO(AvisoDAO avisoDAO) {

        this.avisoDAO = avisoDAO;
    }

    @Override
    public int cadastrarAviso(Aviso aviso) {
        if(aviso != null){
            return avisoDAO.create(aviso);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public Aviso pesquisarAviso(Aviso aviso) {
        boolean controla;
        Scanner scanner = new Scanner(System.in);

        if(aviso != null){

            do {
                controla = false;
                if (aviso.getTitulo().isEmpty()) {
                    System.out.println();
                    System.out.println("O titulo do aviso nao pode estar vazio");
                    System.out.println();
                    aviso.setTitulo(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            do {
                controla = false;
                if (aviso.getConteudo().isEmpty()) {
                    System.out.println();
                    System.out.println("O conteudo do aviso nao pode estar vazio");
                    System.out.println();
                    aviso.setConteudo(scanner.nextLine());
                }else{
                    controla = true;
                }
            } while (controla == false);

            return avisoDAO.retrieve(aviso);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public List<Aviso> pesquisarListaAvisos(Aviso aviso) {
        if(aviso != null){
            return avisoDAO.retrieveList(aviso);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public int atualizarAviso(Aviso aviso) {
        if(aviso != null){
            return avisoDAO.update(aviso);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }

    @Override
    public int excluirAviso(Aviso aviso) {
        if(aviso != null){
            return avisoDAO.delete(aviso);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
    }
}
