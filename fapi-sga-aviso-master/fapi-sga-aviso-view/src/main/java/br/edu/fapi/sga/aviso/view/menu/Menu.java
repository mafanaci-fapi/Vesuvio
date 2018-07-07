package br.edu.fapi.sga.aviso.view.menu;

import br.edu.fapi.sga.aviso.controller.AvisoController;
import br.edu.fapi.sga.aviso.controller.impl.AvisoControllerImpl;
import br.edu.fapi.sga.aviso.view.operacoes.*;
import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.Scanner;

public class Menu {
    public void menu() {
        AvisoController avisoController = new AvisoControllerImpl();

        int opcao;
        int voltar = 1;
        Scanner scanner = new Scanner(System.in);
        Aviso aviso = new Aviso();

        do {
            System.out.println("Escolha uma opcao.");
            System.out.println("1 - Cadastrar um aviso.");
            System.out.println("2 - Excluir um aviso.");
            System.out.println("3 - Atualizar um aviso.");
            System.out.println("4 - Pesquisar um aviso.");
            System.out.println("5 - Listar avisos.");
            System.out.println("0 - Voltar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Cadastro cadastro = new Cadastro();
                    cadastro.cadastrarAviso(avisoController, scanner, aviso);
                    break;
                case 2:
                    Exclusao exclusao = new Exclusao();
                    exclusao.excluirAviso(avisoController, scanner, aviso);
                    break;
                case 3:
                    Atualiza atualiza = new Atualiza();
                    atualiza.atualizarAviso(avisoController, scanner, aviso);
                    break;
                case 4:
                    Pesquisa pesquisa = new Pesquisa();
                    pesquisa.pesquisarAviso(avisoController, scanner, aviso);
                    break;
                case 5:
                    Listar listar = new Listar();
                    listar.listarAviso(avisoController, aviso);
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
