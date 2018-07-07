package br.edu.fapi.sga.aviso.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.aviso.controller.AvisoController;
import br.edu.fapi.sga.model.aviso.Aviso;

public class Pesquisa {
    public void pesquisarAviso(AvisoController avisoController, Scanner scanner, Aviso aviso) {
        int opcao;
        int defCodigo = 0;
        int codigo;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para pesquisar um aviso ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
                
        switch (opcao) {
            case 1:
                do{
                    System.out.println("");
                    System.out.print("Digite o código do aviso que deseja pesquisar: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    if (codigo < 0){
                        System.out.println("O código pesquisado não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                }while (defCodigo == 0);
                if (codigo == aviso.getCodigo()){
                    avisoController.pesquisarAviso(aviso);

                    System.out.println("");
                    System.out.println("Código: "+aviso.getCodigo());
                    System.out.println("Título: "+aviso.getTitulo());
                    System.out.println("Conteúdo: "+aviso.getConteudo());
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("Aviso não encontrado.");
                    System.out.println("");
                }
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}
