/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
String telefone;*/

package Heranca;

public class ApresentacaoPessoa {

		public static void main (String args[]) {
			
			Pessoa pessoaTeste = new Pessoa("Natacha",28,"Rua: Java n�10 / Bairro: Desenvolvimento / Estado: POO","1128763546");
			
			pessoaTeste.infoPessoa(); 
			pessoaTeste.valTelefone();
			
			
			
		}
}
