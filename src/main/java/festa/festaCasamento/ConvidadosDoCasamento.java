package festa.festaCasamento;

import java.util.Arrays;
import java.util.List;

import festa.Convidados;
import model.Convidado;

public class ConvidadosDoCasamento implements Convidados{

	@Override
	public List<Convidado> todos() {
		List<Convidado> lista = null;
		
		Convidado  pai = new Convidado("Pedro", "pedro@gmail.com");
		Convidado  mae = new Convidado("Maria", "mariaLurdis@gmail.com");
		Convidado  avo = new Convidado("Florentina", "florentina@gmail.com");
		Convidado  tio = new Convidado("Sebastiao", "sebastiao@hotmail.com");
		
		lista = Arrays.asList(pai, mae, avo, tio);
		
		return lista;
	}

}
