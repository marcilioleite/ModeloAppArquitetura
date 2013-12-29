
import mementos.CursoMemento;
import pojos.Curso;


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
		
		Curso curso = new Curso();
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
		
		System.out.println(curso.toString());
		
	}

}
