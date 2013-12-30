package br.tpmarc.arqsoft.data;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Database {
	
	private static Database instancia;

	private ObjectContainer objectContainer;
	
	private Database() {
		try {
			if (objectContainer == null || objectContainer.ext().isClosed()) {
				objectContainer = Db4oEmbedded.openFile("banco.db4o");
			}
		} catch (Exception ie) {
		}
	}
	
	public ObjectContainer getObjectContainer() {
		return this.objectContainer;
	}
	
	public static Database getInstancia() {
		if (instancia == null) {
			instancia = new Database();
		}
		return instancia;
	}
}
