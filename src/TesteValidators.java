import br.tpmarc.arqsoft.exceptions.InvalidFieldException;
import br.tpmarc.arqsoft.exceptions.RequiredFieldException;
import br.tpmarc.arqsoft.models.Curso;
import br.tpmarc.arqsoft.validators.CursoValidator;


public class TesteValidators {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setCodigo("Mat");
		CursoValidator validator = new CursoValidator();
		
		try {
			validator.validate(curso);
		} catch (InvalidFieldException | RequiredFieldException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
