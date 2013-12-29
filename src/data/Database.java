package data;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Database {
	
	private static Database instancia;

	private ObjectContainer database;
	
	private Database() {
		try {
			if (database == null || database.ext().isClosed()) {
				database = Db4oEmbedded.openFile("banco.db4o");
			}
		} catch (Exception ie) {
		}
	}
	
	public void commit() {
		database.commit();
	}

	public void rollBack() {
		database.rollback();
	}

	public void close() {
		if (this.database != null) {
			this.database.close();
		}
	}

	public ObjectContainer getDatabase() {
		return this.database;
	}
	
	public static Database getInstancia() {
		if (instancia == null) {
			instancia = new Database();
		}
		return instancia;
	}
}
