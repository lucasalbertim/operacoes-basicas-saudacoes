package basecamp;
import java.util.Scanner;
public class Calculadora {
	public static void calculadora(){
		
		double numero1, numero2;
		boolean condicao = false;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		numero2 = scan.nextDouble();
		
		do{	
		System.out.println("Qual operação você quer fazer ? ");
		System.out.print("1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão \n");
		int operacao = scan.nextInt();
		
		switch (operacao) {
		case 1:
			Calculadora.soma(numero1, numero2);
			condicao = true;
			break;
		case 2:
			Calculadora.subtracao(numero1, numero2);
			condicao = true;
			break;
		case 3:
			Calculadora.multiplicacao(numero1, numero2);
			condicao = true;
			break;
		case 4:
			Calculadora.divisao(numero1, numero2);
			condicao = true;
			break;
		default:
			System.out.println("Operacão invalida!, digite um numero valido!");
			condicao = false;
		}
		}while(condicao == false);
	}
	public static void soma(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		
		System.out.println("Valor da soma: " + numero1 + " + "  + numero2 + " = "  + resultado );
	}
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		
		System.out.println("Valor da subtração: " + numero1 + " - "  + numero2 + " = "  + resultado );
	}
	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		
		System.out.println("Valor da multiplição: " + numero1 + " x "  + numero2 + " = "  + resultado );
	}
	public static void divisao(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		
		System.out.println("Valor da divisão: " + numero1 + " / "  + numero2 + " = "  + resultado );
	}
}
