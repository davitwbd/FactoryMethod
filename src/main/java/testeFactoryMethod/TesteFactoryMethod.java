package testeFactoryMethod;

import festa.festa15Anos.Festa15AnosDaJulia;
import festa.festaCasamento.FestaCasamentoJose_e_Julia;

/** Factory Method 
 * 
 *  Definição: Define uma interface para criar um objeto, mas permite que as 
 *             subclasses decidam qua classe instanciar(retornar).
 *
 *  O Factory Method permite uma classe delegar a instanciação a subclasse.*/
public class TesteFactoryMethod {
	
	public static void main(String[] args) {
		System.out.println("Festa #1");
		Festa15AnosDaJulia festa1 = new Festa15AnosDaJulia();
		festa1.enviarConvite();
		
		System.out.println("Festa #2");
		FestaCasamentoJose_e_Julia festa2 = new FestaCasamentoJose_e_Julia();
		festa2.enviarConvite();
	}
}
