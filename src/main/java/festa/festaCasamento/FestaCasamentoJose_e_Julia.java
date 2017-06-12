package festa.festaCasamento;

import festa.Convidados;
import festa.Festa;

public class FestaCasamentoJose_e_Julia extends Festa{

	@Override
	public Convidados getConvidados() {
		return new ConvidadosDoCasamento();
	}

}
