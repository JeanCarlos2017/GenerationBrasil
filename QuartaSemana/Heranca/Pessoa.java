/*1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
String telefone;*/

package Heranca;

public class Pessoa {

	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	
	/*Constructor*/
	public Pessoa(String nome, int idade, String endereco, String telefone) {
		
		this.nome=nome;
		this.idade=idade;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void infoPessoa() {
		
		System.out.println("**************************************************************************************");
		System.out.println("Informa��es pessoais:\n");
		System.out.println("Nome: " + nome +"\nIdade: " + idade + " anos" + " \nEndere�o: " + endereco + "\nTelefone: " +  telefone);
		
	}
	

	public void valTelefone() {
		
		if (getTelefone().length()>10) {
			
			System.out.println("\nTelefone inv�lido!!!\n\n***********************************************************************************\n");
			
		}
		else
		{
			System.out.println("\nTelefone v�lido!!!\n\n**************************************************************************************\n");
			
		

			
		}
	}
	
}
