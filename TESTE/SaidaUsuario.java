package Empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "1- Anexo I - Com�rcio\r\n"
				  + "2- Anexo II - Industria\r\n"
				  + "3- Anexo III - Servi�o\r\n"
				  + "4- Anexo  IV � Constru��o Civil\r\n"
				  + "5- Anexo  V �� Servi�os de cunho intelectual\r\n";
		System.out.println(menuAnexo);
	}
	
	public static void relatorio(List<Float> pagamento, float total, float imposto) {
		for (int i = 0; i <= 11; i++) {
			System.out.printf("Faturamento mes %d foi de %.2f\n", i+1, pagamento.get(i) );
		}
		System.out.println("Faturamento total de: "+total);
		System.out.println("Ent�o seu imposto � de: "+imposto);
	}

}