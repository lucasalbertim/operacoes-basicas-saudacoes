package basecamp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int escolha;
		
		System.out.println("Oque deseja fazer? ");
		System.out.print("1-Calculadora \n2-Comprimentar ");
		escolha = scan.nextInt();
		
		switch(escolha) {
		case 1:
			Calculadora.calculadora();
			break;
		case 2:
			LocalDateTime timenow = LocalDateTime.now();
			DateTimeFormatter formater = DateTimeFormatter.ofPattern("HHmm");
			String horaAtual = formater.format(timenow);
			int horaConvertida = Integer.parseInt(horaAtual);
			//System.out.println(horaConvertida);
			Saudacoes.saudacao(horaConvertida);
			break;
		default:
			System.out.println("Operacão invalida!, digite um numero valido!");
			break;
		}
		
	}
}


