package br.tpmarc.arqsoft.facade;

import br.tpmarc.arqsoft.data.ChamadaDAO;
import br.tpmarc.arqsoft.data.CursoDAO;
import br.tpmarc.arqsoft.data.TurmaDAO;
import br.tpmarc.arqsoft.models.Chamada;
import br.tpmarc.arqsoft.models.Curso;
import br.tpmarc.arqsoft.models.Turma;

import com.db4o.ObjectSet;

public class Facade {

	private static Facade instancia;
	
	private Facade() {
	}
	
	public void salvarCurso(Curso curso) {
		CursoDAO cursos = new CursoDAO();
		cursos.salvar(curso);
	}
	
	public void apagarCurso(Curso curso) {
		CursoDAO cursos = new CursoDAO();
		cursos.apagar(curso);
	}
	
	public ObjectSet<Curso> buscarCursos(Curso exemplo) {
		CursoDAO cursos = new CursoDAO();
		return cursos.buscar(exemplo);
	}
	
	public ObjectSet<Curso> listarCursos() {
		CursoDAO cursos = new CursoDAO();
		return cursos.todos();
	}
	
	public void salvarChamada(Chamada chamada) {
		ChamadaDAO chamadas = new ChamadaDAO();
		chamadas.salvar(chamada);
	}
	
	public void apagarChamada(Chamada chamada) {
		ChamadaDAO chamadas = new ChamadaDAO();
		chamadas.apagar(chamada);
	}
	

	public ObjectSet<Chamada> buscarChamadas(Chamada exemplo) {
		ChamadaDAO chamadas = new ChamadaDAO();
		return chamadas.buscar(exemplo);
	}
	
	public ObjectSet<Chamada> listarChamadas() {
		ChamadaDAO chamadas = new ChamadaDAO();
		return chamadas.todos();
	}
	
	public void salvarTurma(Turma turma) {
		TurmaDAO turmas = new TurmaDAO();
		turmas.salvar(turma);
	}
	
	public void apagarTurma(Turma turma) {
		TurmaDAO turmas = new TurmaDAO();
		turmas.apagar(turma);
	}
	
	public ObjectSet<Turma> buscarTurmas(Turma exemplo) {
		TurmaDAO turmas = new TurmaDAO();
		return turmas.buscar(exemplo);
	}

	public ObjectSet<Turma> listarTurmas() {
		TurmaDAO turmas = new TurmaDAO();
		return turmas.todos();
	}
	
	public static Facade getInstancia() {
		if (instancia == null) {
			instancia = new Facade();
		}
		return instancia;
	}

}
