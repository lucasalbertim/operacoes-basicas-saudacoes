package basecamp;

public class Saudacoes {
	public static void saudacao(int horaConvertida) {
		if (horaConvertida >= 0500 && horaConvertida<=1159) {
			System.out.println("Bom dia, espero que esteja tudo bem, tenha um ótimo dia!");
		} else if (horaConvertida >= 1200 && horaConvertida <=1759) {
			System.out.println("Boa tarde, espero que esteja tudo bem, tenha um ótimo dia!");
		}else{
			System.out.println("Boa noite, espero que esteja tudo bem, tenha um ótimo dia!");
		}
	}
}
