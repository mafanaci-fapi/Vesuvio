package br.edu.fapi.sga.aviso.view.operacoes;

import java.util.Scanner;

import br.edu.fapi.sga.aviso.controller.AvisoController;
import br.edu.fapi.sga.model.aviso.Aviso;

public class Cadastro {
    public void cadastrarAviso(AvisoController avisoController, Scanner scanner, Aviso aviso) {
        int opcao;
        int defCodigo = 0;
        
        do{
        System.out.println("");
        System.out.println("Digite 1 para cadastrar um aviso ou 0 para voltar.");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                System.out.println("CADASTRO DE AVISO.");
                do{
                    System.out.print("Digite o codigo do aviso: ");
                    aviso.setCodigo(scanner.nextInt());
                    scanner.nextLine();
                    if (aviso.getCodigo() < 0){
                        System.out.println("O código não pode ser menor que 0. Por favor digite novamente.");
                        System.out.println("");
                    }else{
                        defCodigo = 1;
                    }
                }while (defCodigo == 0);
                System.out.print("Digite o titulo do aviso: ");
                aviso.setTitulo(scanner.nextLine());
                System.out.print("Digite o conteúdo do aviso: ");
                aviso.setConteudo(scanner.nextLine());

                avisoController.cadastrarAviso(aviso);
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
