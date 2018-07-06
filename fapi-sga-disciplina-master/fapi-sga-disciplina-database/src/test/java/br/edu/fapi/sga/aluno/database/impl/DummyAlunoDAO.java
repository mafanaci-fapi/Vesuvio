package br.edu.fapi.sga.aluno.database.impl;

import br.edu.fapi.sga.aluno.database.AlunoDAO;
import br.edu.fapi.sga.model.aluno.Aluno;
import br.edu.fapi.sga.model.aviso.Aviso;

import java.util.ArrayList;
import java.util.List;

public class DummyAlunoDAO implements AlunoDAO {

    @Override
    public int create(Aluno aluno) {
        System.out.println("Data Layer -> Aluno cadastrado com sucesso");
        return 1;
    }

    @Override
    public Aluno retrieve(Aluno aluno) {
        System.out.println("Data Layer -> Aluno pesquisado com sucesso");
        Aluno alunoResultado = new Aluno();
        alunoResultado.setCodigo(1);
        alunoResultado.setNome("Teste Nome");
        alunoResultado.setCpf("Teste CPF");
        alunoResultado.setRg("Teste RG");
        alunoResultado.setTelefone("Teste telefone");
        alunoResultado.setEmail("Teste email");
        alunoResultado.setEndereço("Teste endereço");
        
        return alunoResultado;
    }

    @Override
    public List<Aluno> retrieveList(Aluno aluno) {
        System.out.println("Data Layer -> Alunos pesquisados com sucesso");

        Aluno alunoResultado1 = new Aluno();
        alunoResultado1.setCodigo(1);
        alunoResultado1.setNome("Teste Nome");
        alunoResultado1.setCpf("Teste CPF");
        alunoResultado1.setRg("Teste RG");
        alunoResultado1.setTelefone("Teste telefone");
        alunoResultado1.setEmail("Teste email");
        alunoResultado1.setEndereço("Teste endereço");
        

        Aluno alunoResultado2 = new Aluno();
        alunoResultado2.setCodigo(1);
        alunoResultado2.setNome("Teste Nome");
        alunoResultado2.setCpf("Teste CPF");
        alunoResultado2.setRg("Teste RG");
        alunoResultado2.setTelefone("Teste telefone");
        alunoResultado2.setEmail("Teste email");
        alunoResultado2.setEndereço("Teste endereço");

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(alunoResultado1);
        listaAlunos.add(alunoResultado2);

        return listaAlunos;
    }

	@Override
	public int update(Aluno aluno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Aluno aluno) {
		// TODO Auto-generated method stub
		return 0;
	}
}
   