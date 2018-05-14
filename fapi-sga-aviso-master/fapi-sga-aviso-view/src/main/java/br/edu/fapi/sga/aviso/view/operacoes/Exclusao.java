package br.edu.fapi.sga.aviso.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.aviso.Aviso;

public class Exclusao {
    public void excluirAviso(Scanner scanner, Aviso aviso) {
        int opcao;
        int codigo;
        int defCodigo = 0;
        
        do {       
        System.out.println("");
        System.out.println("Digite 1 para excluir um aviso ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("EXCLUSÃO DE AVISO.");
                do{
                    System.out.print("Digite o codigo do aviso que deseja excluir: ");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    if (codigo < 0){
                        System.out.println("O código digitado não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                } while (defCodigo == 0);
                if (codigo == aviso.getCodigo()){
                    aviso.setCodigo(-1);
                    System.out.println("");
                    System.out.println("---------------------------");
                    System.out.println("AVISO EXCLUIDO COM SUCESSO.");
                    System.out.println("---------------------------");
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("Aviso não encontrado");
                    System.out.println("");
                }       
                break;
            case 0:
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}
