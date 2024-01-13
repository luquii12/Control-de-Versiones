package ControlVersiones;

import java.util.Scanner;

public class ControlVersiones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Triángulo:
		System.out.println("Introduce base");
		int base = in.nextInt();
		System.out.println("Introduce altura");
		int altura = in.nextInt();
		double area = calcularAreaTriangulo(base, altura);
		System.out.println("El area del triángulo es: " + area);
		
		// Circunferencia:
		System.out.println("Introduce el radio de la circunferencia: ");
		int radioC = in.nextInt();
		double areaC = calcularAreaCircunf(radioC);
		double perimetroC = calcularPerimetroCircunf(radioC);
		System.out.println("El área de la circunferencia es: " + areaC);
		System.out.println("El perímetro de la circunferencia es: " + perimetroC);

	}

	public static double calcularAreaTriangulo(int base, int altura) {
		return base * altura * 0.5;
	}
	public static double calcularAreaCircunf(int radio) {
		return Math.PI * radio * radio;
	}

	public static double calcularPerimetroCircunf(int radio) {
		return 2 * Math.PI * radio;
	}
}
