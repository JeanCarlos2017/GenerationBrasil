/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

package POO;

public class Aviao {

	/* Atributos */

	String modeloAviao;
	int capacidadeAviao;
	double velocidadeAviao;

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public int getCapacidadeAviao() {
		return capacidadeAviao;
	}

	public void setCapacidadeAviao(int capacidadeAviao) {
		this.capacidadeAviao = capacidadeAviao;
	}

	public double getVelocidadeAviao() {
		return velocidadeAviao;
	}

	public void setVelocidadeAviao(double velocidadeAviao) {
		this.velocidadeAviao = velocidadeAviao;
	}

}
