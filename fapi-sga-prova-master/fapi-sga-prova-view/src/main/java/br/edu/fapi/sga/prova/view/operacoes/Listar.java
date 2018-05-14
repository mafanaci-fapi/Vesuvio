package br.edu.fapi.sga.prova.view.operacoes;

import br.edu.fapi.sga.model.prova.Prova;

public class Listar {
	public void listarProva(Prova prova) {
		if (prova.getCodigo() == -1) {
			System.out.println("");
			System.out.println("Não há provas cadastradas.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("----------------");
			System.out.println("LISTA DE PROVAS.");
			System.out.println("----------------");
			System.out.print(prova.getDisciplina());
			System.out.print(" - ");
			System.out.println(prova.getTurma());
			System.out.println(" --- ");
			System.out.println("");
		}
	}

}
