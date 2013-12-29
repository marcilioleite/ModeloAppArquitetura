package data;

import models.Curso;

import com.db4o.ObjectSet;

public class CursoDAO extends DatabaseAdapterImpl<Curso> implements DAO<Curso> {

	public CursoDAO() {
		super(Curso.class);
	}

	@Override
	public void salvar(Curso obj) {
		store(obj);
		commit();
	}

	@Override
	public ObjectSet<Curso> buscar(Curso exemplo) {
		ObjectSet<Curso> cursos = queryByExample(exemplo);
		return cursos;
	}

	@Override
	public ObjectSet<Curso> todos() {
		ObjectSet<Curso> cursos = query();
		return cursos;
	}

	@Override
	public void apagar(Curso obj) {
		delete(obj);
		commit();
	}

}
