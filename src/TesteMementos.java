import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import br.tpmarc.arqsoft.mementos.TurmaMemento;
import br.tpmarc.arqsoft.models.Aluno;
import br.tpmarc.arqsoft.models.Aula;
import br.tpmarc.arqsoft.models.Curso;
import br.tpmarc.arqsoft.models.Turma;

public class TesteMementos {

	public static void main(String[] args) {

		/*Aluno aluno = new Aluno();
		aluno.setEmail("tpmarc@gmail.com");
		aluno.setNascimento(new LocalDate(1989, 5, 14));
		aluno.setNome("Marcilio Leite");
		
		AlunoMemento memento = new AlunoMemento(aluno);
		
		System.out.println(aluno.toString());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getNascimento().toString());
		System.out.println();
		
		aluno.setNome("Macaco");
		aluno.setEmail("macaco@maca.com");
		aluno.setNascimento(new LocalDate(2012, 12, 12));
		
		System.out.println(aluno.toString());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getNascimento().toString());
		System.out.println();
		
		memento.undoRedo();
		
		System.out.println(aluno.toString());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getNascimento().toString());
		System.out.println();
		
		memento.undoRedo();
		
		System.out.println(aluno.toString());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getNascimento().toString());
		System.out.println();*/
		
		/*Curso curso = new Curso();
		curso.setCodigo("MAT");
		curso.setNome("Calculo");
		CursoMemento memento = new CursoMemento(curso);
		
		System.out.println(curso.toString());
		
		curso.setCodigo("LAB");
		curso.setNome("Laboratorio");
		
		System.out.println(curso.toString());
		
		memento.desfazRefaz();
		
		System.out.println(curso.toString());
		
		memento.desfazRefaz();
		
		System.out.println(curso.toString());*/
		
		Turma turma = new Turma();
		turma.setAno(2013);
		turma.setSemestre(2);
		Curso curso = new Curso();
		curso.setCodigo("LAB");
		curso.setNome("Laboratorio");
		turma.setCurso(curso);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno a1 = new Aluno();
		a1.setNome("Jose Marcilio");
		a1.setEmail("tpmarc@gmail.com");
		a1.setNascimento(new LocalDate(1989, 05, 14));
		alunos.add(a1);
		Aluno a2 = new Aluno();
		a2.setNome("Mayara Maira");
		a2.setEmail("mayaramairavitorio@gmail.com");
		a2.setNascimento(new LocalDate(1991, 12, 18));
		alunos.add(a2);
		turma.setAlunos(alunos);
		
		List<Aula> aulas = new ArrayList<Aula>();
		Aula au1 = new Aula();
		au1.setTurma(turma);
		au1.setDiaSemana(1);
		au1.setInicio(new LocalTime(8, 00, 00));
		au1.setFim(new LocalTime(10, 00, 00));
		aulas.add(au1);
		Aula au2 = new Aula();
		au2.setTurma(turma);
		au2.setDiaSemana(2);
		au2.setInicio(new LocalTime(12, 00, 00));
		au2.setFim(new LocalTime(14, 00, 00));
		aulas.add(au2);
		turma.setAulas(aulas);
		
		TurmaMemento memento = new TurmaMemento(turma);
		
		System.out.println("Turma:");
		System.out.println(turma.getCurso().toString());
		System.out.println(turma.getAno()+"."+turma.getSemestre());
		System.out.println(turma.getAlunos().toString());
		System.out.println(turma.getAulas().toString());
		System.out.println();
		
		Curso cu1 = new Curso();
		cu1.setCodigo("MPOO");
		cu1.setNome("Modelagem");
		turma.setCurso(cu1);
		turma.setAno(2012);
		turma.setSemestre(3);
		turma.getAlunos().remove(1);
		turma.getAulas().remove(0);
		
		System.out.println("Turma:");
		System.out.println(turma.getCurso().toString());
		System.out.println(turma.getAno()+"."+turma.getSemestre());
		System.out.println(turma.getAlunos().toString());
		System.out.println(turma.getAulas().toString());
		System.out.println();
		
		memento.desfazRefaz();
		
		System.out.println("Turma:");
		System.out.println(turma.getCurso().toString());
		System.out.println(turma.getAno()+"."+turma.getSemestre());
		System.out.println(turma.getAlunos().toString());
		System.out.println(turma.getAulas().toString());
		System.out.println();
		
		memento.desfazRefaz();
		
		System.out.println("Turma:");
		System.out.println(turma.getCurso().toString());
		System.out.println(turma.getAno()+"."+turma.getSemestre());
		System.out.println(turma.getAlunos().toString());
		System.out.println(turma.getAulas().toString());
		System.out.println();
	}

}
