package festa;

import java.util.List;

import model.Convidado;

/** Factory Method 
 * 
 *  Defini��o: Define uma interface para criar um objeto, mas permite que as 
 *             subclasses decidam qua classe instanciar(retornar).
 *
 *  O Factory Method permite uma classe delegar a instancia��o a subclasse. 
 *  
 *  Ou seja a classe que extender esta classe abstrata ter� que implementar o 
 *  m�todo abstrato (Factory Method) e ent�o explicitar que classe ser� retornada.
 *  Obs: a classe a ser retornada deve implementar a mesma interface.**/
public abstract class Festa {

	public abstract Convidados getConvidados();//-> Factory Method - Metodo Abstrato que fabrica o recurso necess�rio � classe.//
	
	public void enviarConvite(){
 		List<Convidado> convidados = getConvidados().todos();//->
		
		for(Convidado convidado : convidados){
			System.out.println("Convite em viado para: " + convidado.getNome());
		}
		System.out.println("\n");
	}
}




