package data;

import com.db4o.ObjectSet;

public class DatabaseAdapterImpl<T> implements DatabaseAdapter<T> {

	private Database db;
	
	private Class<T> clazz;
	
	public DatabaseAdapterImpl(Class<T> clazz) {
		db = Database.getInstancia();
		this.clazz = clazz;
	}
	
	public void store(T obj) {
		db.getDatabase().store(obj);
	}
	
	public void delete(T obj) {
		db.getDatabase().delete(obj);
	}
	
	public ObjectSet<T> query() {
		return db.getDatabase().query(clazz);
	}
	
	public ObjectSet<T> queryByExample(T exemplo) {
		return db.getDatabase().queryByExample(exemplo);
	}
	
	public void commit() {
		db.getDatabase().commit();
	}
	
	public void rollback() {
		db.getDatabase().rollback();
	}
	
	public void close() {
		if (db.getDatabase() != null) {
			db.getDatabase().close();
		}
		db.getDatabase().close();
	}
	
}
