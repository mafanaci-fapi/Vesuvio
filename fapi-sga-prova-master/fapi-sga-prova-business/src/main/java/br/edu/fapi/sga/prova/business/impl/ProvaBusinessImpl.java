package br.edu.fapi.sga.prova.business.impl;

import br.edu.fapi.sga.prova.business.ProvaBusiness;
import br.edu.fapi.sga.prova.database.ProvaDAO;
import br.edu.fapi.sga.prova.database.impl.ProvaDAOImpl;
import br.edu.fapi.sga.model.prova.Prova;

import java.util.List;
import java.util.Scanner;

public class ProvaBusinessImpl implements ProvaBusiness {

    private ProvaDAO provaDAO;

    public ProvaBusinessImpl(){

        this.provaDAO = new ProvaDAOImpl();

    }

    @Override
    public int cadastrarProva(Prova prova) {
    	boolean validar = false;
    	Scanner scanner = new Scanner (System.in);
        
        if(prova != null){

            do {
            	validar = false;
                if (prova.getCodigo == null) {
                	System.out.println("Insira o código da prova: ");
                    prova.setCodigo(scanner.nextInt());
                }else{
                	validar = true;
                }
            } while (validar == false);


            do {
            	validar = false;
                if (prova.getTurma == null) {
                	System.out.println("Insira a turma: ");
                    prova.setTurma(scanner.nextLine());
                }else{
                	validar = true;
                }
            } while (validar == false);
            
            do {
            	validar = false;
                if (prova.getDisciplina == null) {
                	System.out.println("Insira a disciplina: ");
                    prova.setDisciplina(scanner.nextLine());
                }else{
                	validar = true;
                }
            } while (validar == false);
            
        	for(int i = 0; i < 3; i++){
            	System.out.println("Insira a questão " + i + ": ");
                prova.setDisciplina(scanner.nextLine());
        	}

            return provaDAO.create(prova);

        }else{
            throw new IllegalArgumentException("Essa prova não pôde ser criada.");
        }
        
    }

    @Override
    public Prova pesquisarProva(Prova prova) {
    	if(prova != null){
            return provaDAO.retrieve(prova);
        }else{
            throw new IllegalArgumentException("Pesquisa inválida.");
        }
    }
    
    @Override
    public List<Prova> pesquisarListaProvas(Prova prova) {
        if(prova != null){
            return provaDAO.retrieveList(prova);
        }else{
            throw new IllegalArgumentException("Pesquisa inválida.");
        }
    }

    @Override
    public int atualizarProva(Prova prova) {

    	System.out.println("Insira o código da prova: ");
        prova.setCodigo(scanner.nextInt());
        
        System.out.println("Insira o turma: ");
        prova.setCodigo(scanner.nextLine());
        
        System.out.println("Insira a disciplina: ");
        prova.setCodigo(scanner.nextLine());

        for(int i = 0; i < 3; i++){
        	System.out.println("Insira a questão " + i + ": ");
            prova.setDisciplina(scanner.nextLine());
        }
    }

    @Override
    public int excluirProva(Prova prova) {
        if(prova != null){
            return provaDAO.delete(prova);
        }else{
            throw new IllegalArgumentException("Esta prova não pôde ser excluída.");
        }
    }
}
