package curso;

public class Projeto3 {

	public static void main(String[] args) {
		double b,B,h, area; // primeiro define as variaveis
		// depois atribui valor a elas 
		b= 6.0;//Boa Prática, sempre indicar qual o tipo do número digitado,
		// no caso foi double então usamos o .0
		// mas em caso de float use f. ex 8f.
		B= 8.0;
		h= 5.0;
		
		area = (b + B) / 2.0 *h;
		
		System.out.println(area);
		
		int a, c;
		double resultado;
		
		a = 5;
		c =2;
		
		resultado = (double) a/c;
		System.out.print(resultado);
			
			

	}

}
