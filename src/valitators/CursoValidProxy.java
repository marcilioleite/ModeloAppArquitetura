package valitators;

import models.Curso;

public class CursoValidProxy extends Curso {

	private Curso real;
	
	public CursoValidProxy() {
		real = new Curso();
	}
	
	@Override
	public String getCodigo() {
		return real.getCodigo();
	}
	
	@Override
	public void setCodigo(String codigo) {
		real.setCodigo(codigo);
	}
	
	@Override
	public String getNome() {
		return real.getNome();
	}
	
	@Override
	public void setNome(String nome) {
		real.setNome(nome);
	}

	@Override
	public String toString() {
		return real.toString();
	}
	
}
