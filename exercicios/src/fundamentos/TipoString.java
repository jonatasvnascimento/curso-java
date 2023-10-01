package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Teste".charAt(0));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 102;
		var salario = 65442.65;

		System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nSalario: %.2f", nome, sobrenome, idade, salario);
	
		String frase = String.format("Nome: %s \nSobrenome: %s \nIdade: %d \nSalario: %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		s = s.concat("BVC");
		boolean contain = s.contains("A");
		int pos = s.indexOf(0);
		s = s.substring(1,2);
	}
}
