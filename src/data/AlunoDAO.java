package data;

import com.db4o.ObjectSet;

import pojos.Aluno;

public class AlunoDAO extends DatabaseAdapterImpl<Aluno> implements DAO<Aluno> {

	public AlunoDAO() {
		super(Aluno.class);
	}

	@Override
	public void salvar(Aluno obj) {
		store(obj);
		commit();
	}

	@Override
	public ObjectSet<Aluno> buscar(Aluno exemplo) {
		ObjectSet<Aluno> alunos = queryByExample(exemplo);
		return alunos;
	}

	@Override
	public ObjectSet<Aluno> todos() {
		ObjectSet<Aluno> alunos = query();
		return alunos;
	}

	@Override
	public void apagar(Aluno obj) {
		delete(obj);
		commit();
	}

}
