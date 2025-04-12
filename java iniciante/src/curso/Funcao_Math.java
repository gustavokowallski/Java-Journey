package curso;

public class Funcao_Math {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;

		double raiz1 = Math.sqrt(x);        // raiz quadrada de x
		double raiz2 = Math.sqrt(y);        // raiz quadrada de y
		double raiz3 = Math.sqrt(25.0);     // raiz quadrada de 25

		double pot1 = Math.pow(x, y);       // x elevado a y
		double pot2 = Math.pow(2.0, 3.0);   // 2 elevado a 3

		double abs1 = Math.abs(z);          // valor absoluto de z

		System.out.println("Raiz quadrada de " + x + " = " + raiz1);
		System.out.println("Raiz quadrada de " + y + " = " + raiz2);
		System.out.println("Raiz quadrada de 25 = " + raiz3);
		System.out.println(x + " elevado a " + y + " = " + pot1);
		System.out.println("2 elevado a 3 = " + pot2);
		System.out.println("Valor absoluto de " + z + " = " + abs1);
	}
}

