package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Teste");
		System.out.print("1\n");

		System.out.println("Teste");
		System.out.println("Qualidade");

		System.out.printf("Mensagem: %d %d %d %d %n", 1, 2, 3, 4);
		System.out.printf("Salario: %.1f %n", 123.123);

		System.out.printf("Nome: %s %n", "Jon");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.printf("Nome: %s \n"
				+ "Sobrenome: %s \n"
						+ "Idade: %d"
								+ "", nome, sobrenome, idade);
		
		scanner.close();
	}
}
