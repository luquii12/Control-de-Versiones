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

	}

	public static double calcularAreaTriangulo(int base, int altura) {
		return base * altura * 0.5;
	}
}
