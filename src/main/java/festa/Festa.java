package festa;

import java.util.List;

import model.Convidado;

/** Factory Method 
 * 
 *  Definição: Define uma interface para criar um objeto, mas permite que as 
 *             subclasses decidam qua classe instanciar(retornar).
 *
 *  O Factory Method permite uma classe delegar a instanciação a subclasse. 
 *  
 *  Ou seja a classe que extender esta classe abstrata terá que implementar o 
 *  método abstrato (Factory Method) e então explicitar que classe será retornada.
 *  Obs: a classe a ser retornada deve implementar a mesma interface.**/
public abstract class Festa {

	public abstract Convidados getConvidados();//-> Factory Method - Metodo Abstrato que fabrica o recurso necessário à classe.//
	
	public void enviarConvite(){
 		List<Convidado> convidados = getConvidados().todos();//->
		
		for(Convidado convidado : convidados){
			System.out.println("Convite em viado para: " + convidado.getNome());
		}
		System.out.println("\n");
	}
}




