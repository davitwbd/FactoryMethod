package festa.festa15Anos;

import festa.Convidados;
import festa.Festa;

public class Festa15AnosDaJulia extends Festa {

	
	@Override   
	public Convidados getConvidados() {
		return new ConvidadosDaJulia();
	}

}
