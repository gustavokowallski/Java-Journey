package curso;

public class Main {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("A variavel x é : " + x + " metros ");
		System.out.printf("A variavel x é : %.2f metros %n", x); // opcionalmente formatado, 2 casas decimais e quebra de linha
		System.out.printf("RESULTADOS = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario); //%s formatação para string, %d formatação para idade %.(num)f formatação para double e casas decimais
	}
}
