package br.edu.fapi.sga.aviso.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.aviso.view.operacoes.Atualiza;
import br.edu.fapi.sga.aviso.view.operacoes.Cadastro;
import br.edu.fapi.sga.aviso.view.operacoes.Exclusao;
import br.edu.fapi.sga.aviso.view.operacoes.Listar;
import br.edu.fapi.sga.aviso.view.operacoes.Pesquisa;
import br.edu.fapi.sga.model.aviso.Aviso;

public class Menu {
    public void menu(){
        int opcao;
        int voltar = 1;
        Scanner scanner = new Scanner(System.in);
        Aviso aviso = new Aviso();        
        
        do {
        System.out.println("Escolha uma opção.");
        System.out.println("1 - Cadastrar um aviso.");
        System.out.println("2 - Excluir um aviso.");
        System.out.println("3 - Atualizar um aviso.");
        System.out.println("4 - Pesquisar um aviso.");
        System.out.println("5 - Listar avisos.");        
        System.out.println("0 - Voltar");
        
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao){
            case 1:
                Cadastro cadastro = new Cadastro();
                cadastro.cadastrarAviso(scanner, aviso);
                break;
            case 2:
                Exclusao exclusao = new Exclusao();
                exclusao.excluirAviso(scanner, aviso);
                break;
            case 3:
                Atualiza atualiza = new Atualiza();
                atualiza.atualizarAviso(scanner, aviso);
                break;
            case 4:
                Pesquisa pesquisa = new Pesquisa();
                pesquisa.pesquisarAviso(scanner, aviso);
                break;
            case 5:
                Listar listar = new Listar();
                listar.listarAviso(aviso);
                break;
            case 0:
                System.out.println("");
                voltar = 0;
                break;
            default:
                System.out.println("Opção inválida.");
        }
        } while (voltar != 0);    
    }
}
