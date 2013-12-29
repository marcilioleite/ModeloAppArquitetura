import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.joda.time.DateTimeConstants;

import models.Curso;
import valitators.CursoValidProxy;


public class TesteProxies {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		Curso valid = new CursoValidProxy();
		
		valid.setCodigo("MAT");
		valid.setNome("Matematica");
		
		try {
			BeanUtils.copyProperties(curso, valid);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println(curso.toString());
		
	}

}
