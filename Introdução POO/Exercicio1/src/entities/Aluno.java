package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	String condicao;
	
	public double notaFinal() { // calcula a nota final
		return (nota1+nota2+nota3);
		
	}
	
	public String getCondicao(){ //depois eu crio outra expressão de comparação, para ver se nota final é 
		//igual ou maior que 16, dai ele retorna se passou e o quanto faltava;
		if (notaFinal()>=60) {
			return "PASS"; 
		}
		else {
			double min = 60 - notaFinal();
			return "FAILED MISSING %.2f%n"+min+"";
		}
		
	}
	
	public String toString(){
		return "o Aluno: "
				+ name
				+ " Teve as notas "
				+ String.format("%.2f%n", notaFinal())
				+ getCondicao();
				
				
				
				
	}
	

	
}

