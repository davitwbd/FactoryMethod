package festa.festa15Anos;

import java.util.Arrays;
import java.util.List;

import festa.Convidados;
import model.Convidado;

public class ConvidadosDaJulia implements Convidados {

	@Override
	public List<Convidado> todos() {
		List<Convidado> lista = null;
	
		Convidado  convidado1 = new Convidado("José", "josé@gmail.com");
		Convidado  convidado2 = new Convidado("Maria", "maria@hotmail.com");
		Convidado  convidado3 = new Convidado("Ana Julia", "anajulia@gmail.com");
		
		lista = Arrays.asList(convidado1, convidado2, convidado3);
		
		return lista;
	}

}
