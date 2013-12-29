package mementos;

import java.util.HashMap;
import java.util.Map;

import models.Aluno;
import models.Aula;
import models.Chamada;

import org.joda.time.LocalDate;

public class ChamadaMemento implements Memento {

	private Chamada chamadaTarget;
	
	private Aula aula;
	
	private LocalDate data;
	
	private Map<Aluno, Boolean> comparecimentos;
	
	public ChamadaMemento(Chamada c) {
		setChamadaTarget(c);
		aula = c.getAula();
		data = c.getData();
		comparecimentos = new HashMap<Aluno, Boolean>(c.getComparecimentos());
	}
	
	@Override
	public void desfazRefaz() {
		Aula aulaNovo = aula;
		LocalDate dataNovo = data;
		Map<Aluno, Boolean> comparecimentosNovo = comparecimentos;
		
		aula = chamadaTarget.getAula();
		data = chamadaTarget.getData();
		comparecimentos = chamadaTarget.getComparecimentos();
		
		chamadaTarget.setAula(aulaNovo);
		chamadaTarget.setData(dataNovo);
		chamadaTarget.setComparecimentos(comparecimentosNovo);
	}

	public Chamada getChamadaTarget() {
		return chamadaTarget;
	}

	public void setChamadaTarget(Chamada chamadaTarget) {
		this.chamadaTarget = chamadaTarget;
	}
	
}
