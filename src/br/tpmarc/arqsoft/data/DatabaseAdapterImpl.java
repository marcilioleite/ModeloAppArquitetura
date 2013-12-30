package br.tpmarc.arqsoft.data;

import com.db4o.ObjectSet;

public class DatabaseAdapterImpl<T> implements DatabaseAdapter<T> {

	private Database db;
	
	private Class<T> clazz;
	
	public DatabaseAdapterImpl(Class<T> clazz) {
		db = Database.getInstancia();
		this.clazz = clazz;
	}
	
	public void store(T obj) {
		db.getObjectContainer().store(obj);
	}
	
	public void delete(T obj) {
		db.getObjectContainer().delete(obj);
	}
	
	public ObjectSet<T> query() {
		return db.getObjectContainer().query(clazz);
	}
	
	public ObjectSet<T> queryByExample(T exemplo) {
		return db.getObjectContainer().queryByExample(exemplo);
	}
	
	public void commit() {
		db.getObjectContainer().commit();
	}
	
	public void rollback() {
		db.getObjectContainer().rollback();
	}
	
	public void close() {
		if (db.getObjectContainer() != null) {
			db.getObjectContainer().close();
		}
		db.getObjectContainer().close();
	}
	
}
