import br.tpmarc.arqsoft.facade.Facade;
import br.tpmarc.arqsoft.models.Curso;
import br.tpmarc.arqsoft.models.Turma;

public class TesteFachada {

	public static void main(String[] args) {
		
		Curso c = new Curso();
		c.setCodigo("MAT");
		//c.setNome("Matematica");
		//Facade.getInstancia().salvarCurso(c);
		
		Turma t = new Turma();
		t.setCurso(c);
		t.setAno(2014);
		t.setSemestre(2);
		//Facade.getInstancia().salvarTurma(t);
		
		c = Facade.getInstancia().buscarCursos(c).next();
		c.setNome("Calculo 12");
		Facade.getInstancia().salvarCurso(c);
		
		t = new Turma();
		t.setAno(2014);
		t = Facade.getInstancia().buscarTurmas(t).next();
		System.out.println(t.getCurso().toString());
			
	}
}
