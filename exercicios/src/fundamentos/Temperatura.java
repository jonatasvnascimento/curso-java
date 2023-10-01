package fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		System.out.print("Digite a temperatura: ");
		
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		
		double celsiusToFahrenheit  = (1.8 * temp) + 32;
		double fahrenheitToCelsius  = (temp - 32) / 1.8;
		double celsiusToKelvin  = temp + 273.15;
		double kelvinToCelsius = temp - 273.15;
		
		System.out.println("A temperatura em Celsius para Fahrenheit: " + celsiusToFahrenheit);
		System.out.println("A temperatura em Fahrenheit para Celsius: " + fahrenheitToCelsius);
		System.out.println("A temperatura em Celsius para Kelvin: " + celsiusToKelvin);
		System.out.println("A temperatura em Kelvin para Celsius: " + kelvinToCelsius);
	}
}
