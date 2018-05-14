package br.edu.fapi.sga.aviso.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.aviso.Aviso;

public class Atualiza {
    public void atualizarAviso(Scanner scanner, Aviso aviso) {
        int opcao;
        int codigo;
        int defCodigo = 0;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para atualizar um aviso ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("");
                System.out.println("ATUALIZAÇÃO DE AVISO.");
                do {
                    System.out.print("Digite o código do aviso que deseja alterar: ");
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
                    System.out.println("");
                    System.out.println("ALTERAÇÃO DAS INFORMAÇÕES DO AVISO DE CÓGIDO: "+codigo);
                    System.out.print("Digite o novo título do aviso: ");
                    aviso.setTitulo(scanner.nextLine());
                    System.out.print("Digite o novo conteúdo que o aviso conterá: ");
                    aviso.setConteudo(scanner.nextLine());
                    
                    System.out.println("");                       
                    System.out.println("----------------------------------");
                    System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
                    System.out.println("----------------------------------");
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
                System.out.println("Opção inválida.");
                System.out.println("");
                break;
            }
        }while (opcao != 0 && opcao != 1);
    }
    
}
