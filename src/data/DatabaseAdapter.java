package data;

import com.db4o.ObjectSet;

public interface DatabaseAdapter<T> {

	void store(T obj);
	
	void delete (T obj);
	
	ObjectSet<T> query();
	
	ObjectSet<T> queryByExample(T exemplo);
	
	void commit();
	
	void rollback();
	
	void close();
}
