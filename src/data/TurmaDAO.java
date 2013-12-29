package data;

import models.Turma;

import com.db4o.ObjectSet;

public class TurmaDAO extends DatabaseAdapterImpl<Turma> implements DAO<Turma> {

	public TurmaDAO() {
		super(Turma.class);
	}

	@Override
	public void salvar(Turma obj) {
		store(obj);
		commit();
	}

	@Override
	public ObjectSet<Turma> buscar(Turma exemplo) {
		ObjectSet<Turma> turmas = queryByExample(exemplo);
		return turmas;
	}

	@Override
	public ObjectSet<Turma> todos() {
		ObjectSet<Turma> turmas = query();
		return turmas;
	}

	@Override
	public void apagar(Turma obj) {
		delete(obj);
		commit();
	}

}
