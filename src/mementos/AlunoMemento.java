package mementos;

import models.Aluno;

import org.joda.time.LocalDate;

public class AlunoMemento implements Memento {
	
	private Aluno alunoTarget;
	
	private String nome;
	
	private String email;
	
	private LocalDate nascimento;
	
	public AlunoMemento(Aluno a) {
		setAlunoTarget(a);
		nome = a.getNome();
		email = a.getEmail();
		nascimento = a.getNascimento();
	}
	
	@Override
	public void desfazRefaz() {
		String nomeNovo = nome;
		String emailNovo = email;
		LocalDate nascimentoNovo = nascimento;
		
		nome = alunoTarget.getNome();
		email = alunoTarget.getEmail();
		nascimento = alunoTarget.getNascimento();
		
		alunoTarget.setNome(nomeNovo);
		alunoTarget.setEmail(emailNovo);
		alunoTarget.setNascimento(nascimentoNovo);
	}

	public Aluno getAlunoTarget() {
		return alunoTarget;
	}

	public void setAlunoTarget(Aluno alunoTarget) {
		this.alunoTarget = alunoTarget;
	}

}
