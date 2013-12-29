package data;

import pojos.Chamada;

import com.db4o.ObjectSet;

public class ChamadaDAO extends DatabaseAdapterImpl<Chamada> implements DAO<Chamada> {

	public ChamadaDAO() {
		super(Chamada.class);
	}

	@Override
	public void salvar(Chamada obj) {
		store(obj);
		commit();
	}

	@Override
	public ObjectSet<Chamada> buscar(Chamada exemplo) {
		ObjectSet<Chamada> chamadas = queryByExample(exemplo);
		return chamadas;
	}

	@Override
	public ObjectSet<Chamada> todos() {
		ObjectSet<Chamada> chamadas = query();
		return chamadas;
	}

	@Override
	public void apagar(Chamada obj) {
		delete(obj);
		commit();
	}

}
