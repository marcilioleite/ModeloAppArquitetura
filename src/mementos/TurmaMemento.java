package mementos;

import java.util.List;

import pojos.Aluno;
import pojos.Aula;
import pojos.Curso;
import pojos.Turma;

public class TurmaMemento implements Memento {
	
	private Turma turmaTarget;
	
	private int ano;
	
	private int semestre;
	
	private Curso curso;
	
	private List<Aula> aulas;
	
	private List<Aluno> alunos;
	
	public TurmaMemento(Turma t) {
		setTurmaTarget(t);
		ano = t.getAno();
		semestre = t.getSemestre();
		curso = t.getCurso();
		aulas = t.getAulas();
		alunos = t.getAlunos();
	}
	
	@Override
	public void desfazRefaz() {
		int anoNovo = ano;
		int semestreNovo = semestre;
		Curso cursoNovo = curso;
		List<Aula> aulasNovo = aulas;
		List<Aluno> alunosNovo = alunos;
		
		ano = turmaTarget.getAno();
		semestre = turmaTarget.getSemestre();
		curso = turmaTarget.getCurso();
		aulas = turmaTarget.getAulas();
		alunos = turmaTarget.getAlunos();
		
		turmaTarget.setAno(anoNovo);
		turmaTarget.setSemestre(semestreNovo);
		turmaTarget.setCurso(cursoNovo);
		turmaTarget.setAulas(aulasNovo);
		turmaTarget.setAlunos(alunosNovo);
	}

	public Turma getTurmaTarget() {
		return turmaTarget;
	}

	public void setTurmaTarget(Turma turmaTarget) {
		this.turmaTarget = turmaTarget;
	}
	
}
