/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/

package Heranca;

public class Apresenta��oAdministrador {

	public static void main (String args[]) {
		
	Administrador admin1 = new Administrador("Bruno",28,"Rua Dev n�300 / Bairro POO","1187263745","Administrador financeiro",500);
		
		admin1.info();
	}
}
