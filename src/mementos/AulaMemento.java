package mementos;

import java.util.ArrayList;
import java.util.List;

import models.Aula;
import models.Chamada;
import models.Turma;

import org.joda.time.LocalTime;

public class AulaMemento implements Memento {

	private Aula aulaTarget;
	
	private Turma turma;
	
	private LocalTime inicio;
	
	private LocalTime fim;
	
	private int diaSemana;
	
	private List<Chamada> chamadas;

	public AulaMemento(Aula a) {
		setAulaTarget(a);
		turma = a.getTurma();
		inicio = a.getInicio();
		fim = a.getFim();
		diaSemana = a.getDiaSemana();
		chamadas = new ArrayList<Chamada>(a.getChamadas());
	}
	
	@Override
	public void desfazRefaz() {
		Turma turmaNovo = turma;
		LocalTime inicioNovo = inicio;
		LocalTime fimNovo = fim;
		int diaSemanaNovo = diaSemana;
		List<Chamada> chamadasNovo = chamadas;
		
		turma = aulaTarget.getTurma();
		inicio = aulaTarget.getInicio();
		fim = aulaTarget.getFim();
		diaSemanaNovo = aulaTarget.getDiaSemana();
		chamadasNovo = aulaTarget.getChamadas();
		
		aulaTarget.setTurma(turmaNovo);
		aulaTarget.setInicio(inicioNovo);
		aulaTarget.setFim(fimNovo);
		aulaTarget.setDiaSemana(diaSemanaNovo);
		aulaTarget.setChamadas(chamadasNovo);
	}
	
	public Aula getAulaTarget() {
		return aulaTarget;
	}

	public void setAulaTarget(Aula aulaTarget) {
		this.aulaTarget = aulaTarget;
	}
	
}
