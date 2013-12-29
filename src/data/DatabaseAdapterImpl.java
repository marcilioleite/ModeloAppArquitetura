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
		db.commit();
	}
	
	public void rollback() {
		db.rollBack();
	}
	
	public void close() {
		db.close();
	}
	
}
