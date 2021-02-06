package Empresa;

import java.util.InputMismatchException;


public class Main {
	public int getAnexo() {
		int anexo= 0;
		SaidaUsuario.qualAnexo();
		try {
			anexo = EntradaUsuario.getInt();
			while(anexo < 1 || anexo >5 ) {
				System.out.println("Por favor digite um valor v�lido, atente-se ao menu: ");
				SaidaUsuario.qualAnexo();
				anexo = EntradaUsuario.getInt();
			}
			
		}catch (InputMismatchException e) {
			System.out.println("Voc� digitou uma entrada inv�lida, por favor tente novamente!\nErro: "+e);
			this.getAnexo();
		}
		catch(NumberFormatException ne) {
			System.out.println("Voc� digitou uma entrada inv�lida, por favor tente novamente!\nErro: "+ne);
			this.getAnexo();
		}
		return anexo;
	}
	
	public void execucaoPrograma() {
		// TODO Auto-generated constructor stub
		int anexo;
		
		System.out.println("Ol� empres�rio! Bem vindo! Vamos planejar seu futuro?\n");
		System.out.println("Qual a atividade da sua empresa? (Escolha um n�mero): ");
		
		anexo = this.getAnexo();
		System.out.println(anexo);
		switch (anexo) {
			case 1: {
				//chama a classe do case 1
				System.out.println("Voce digitou 1");
				EmpresaTest emp = new EmpresaTest();
				emp.run();
				break;
			}
			
			case 2: {
				//chama a classe do case 1
				System.out.println("Voce digitou 2");
				AnexoII emp = new AnexoII();
				emp.run();
				break;
			}
			case 0:{
				System.out.println("problemas de escopo");
				break;
			}
			default:
				System.out.println("Saindo do programa");
				break;
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.execucaoPrograma();
	}
}