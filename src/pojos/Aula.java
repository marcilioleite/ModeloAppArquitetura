package pojos;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalTime;

public class Aula {

	private Turma turma;
	
	private LocalTime inicio;
	
	private LocalTime fim;
	
	private int diaSemana;
	
	private List<Chamada> chamadas;
	
	public Aula() {
		chamadas = new ArrayList<Chamada>();
	}
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public LocalTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalTime inicio) {
		this.inicio = inicio;
	}

	public LocalTime getFim() {
		return fim;
	}

	public void setFim(LocalTime fim) {
		this.fim = fim;
	}

	public int getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public List<Chamada> getChamadas() {
		return chamadas;
	}

	public void setChamadas(List<Chamada> chamadas) {
		this.chamadas = chamadas;
	}

}
