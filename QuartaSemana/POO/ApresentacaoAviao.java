/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package POO;

public class ApresentacaoAviao {

	public static void main (String args[]) {
		
		Aviao aviao1 = new Aviao();
		
        aviao1.setModeloAviao("boeing 707");
        aviao1.setCapacidadeAviao(400);
        aviao1.setVelocidadeAviao(380);
        
		
		System.out.println("Modelo: "+aviao1.getModeloAviao());	
		System.out.println("Capacidade total de passageiros: "+aviao1.getCapacidadeAviao());
		System.out.println("km/h "+aviao1.getVelocidadeAviao());
		
	}
}

				

