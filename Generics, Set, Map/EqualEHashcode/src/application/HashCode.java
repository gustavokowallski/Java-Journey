package application;

public class HashCode {

	public static void main(String[] args) {
		String a = "José";
		String b = "Maria";
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		// se o hashCode dos objetos for diferente, ent os objs são diferentes
		// e se for igual muito provavelmente são iguais, pode haver colisão.
	}

}
