package principal;

import java.util.Scanner;
import java.text.DecimalFormat;


public class aula2exer1_DaviCampos_190026600 {
	
	public static void pulaLinhas(int linhas) {
		int i;
		for(i=0;i<linhas;i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat mascara = new DecimalFormat("#0.00");
		DecimalFormat porcentagem = new DecimalFormat("0");
		final float PISOT = 1000.00F;
		float percentual;
		float piso;
		
		System.out.println("Digite o percentual desejado:");
		percentual = ler.nextInt();
		
		piso = PISOT*(percentual/100);
		
		pulaLinhas(7);
		System.out.println("O percentual escolhido foi " + porcentagem.format(percentual) +"%!");
		System.out.println("E o resultado final foi R$" + mascara.format(piso) +"!");
		
	}

}
