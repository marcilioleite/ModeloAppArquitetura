package valitators;

import java.util.List;

import models.Aula;
import models.Chamada;
import models.Turma;

import org.joda.time.LocalTime;

public class AulaValidProxy extends Aula {

	private Aula real;
	
	public AulaValidProxy() {
		real = new Aula();
	}
	
	@Override
	public Turma getTurma() {
		return real.getTurma();
	}
	
	@Override
	public void setTurma(Turma turma) {
		if (turma != null) {
			real.setTurma(turma);
		}
	}
	
	@Override
	public LocalTime getInicio() {
		return real.getInicio();
	}
	
	@Override
	public void setInicio(LocalTime inicio) {
		if (inicio.isBefore(real.getFim())) {
			real.setInicio(inicio);
		}
	}
	
	@Override
	public LocalTime getFim() {
		return real.getFim();
	}
	
	@Override
	public void setFim(LocalTime fim) {
		if (fim.isAfter(real.getInicio())) {
			real.setFim(fim);
		}
	}
	
	@Override
	public int getDiaSemana() {
		return real.getDiaSemana();
	}
	
	@Override
	public void setDiaSemana(int diaSemana) {
		if (diaSemana > 0 && diaSemana < 8) {
			real.setDiaSemana(diaSemana);
		}
	}
	
	@Override
	public List<Chamada> getChamadas() {
		return real.getChamadas();
	}
	
	@Override
	public void setChamadas(List<Chamada> chamadas) {
		super.setChamadas(chamadas);
	}
	
	@Override
	public String toString() {
		return real.toString();
	}
}
