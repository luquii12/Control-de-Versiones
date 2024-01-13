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

		// Cilindro:
		System.out.println("Introduce radio");
		int radioCil = in.nextInt();
		System.out.println("Introduce altura");
		int alturaCil = in.nextInt();
		double areaCil = calcularAreaCilindro(radioCil, alturaCil);
		System.out.println("El área del Cilindrro es: " + areaCil);
		
		// Rectángulo:
		System.out.println("Introduce un lado del rectángulo: ");
		int lado1 = in.nextInt();
		System.out.println("Introduce el otro lado del rectángulo: ");
		int lado2 = in.nextInt();
		double areaRect = calcularAreaRectangulo(lado1, lado2);
		System.out.println("El área del rectángulo es: " + areaRect);
		
		//Cubo:
		System.out.println("Introduce primer lado del cubo: ");
		int lado1C = in.nextInt();
		System.out.println("Introduce el segundo lado del cubo: ");
		int lado2C = in.nextInt();
		System.out.println("Introduce el tercer lado del cubo: ");
		int lado3C = in.nextInt();
		double areaCubo = calcularAreaCubo(lado1C, lado2C);
		System.out.println("El área del cubo es: " + areaCubo);
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

	public static double calcularAreaCilindro(int radio, int altura) {
		return 2 * Math.PI * radio * (altura + radio);
	}
	public static double calcularAreaRectangulo(int lado1, int lado2) {
		return lado1 * lado2;
	}
	public static double calcularAreaCubo(int lado1, int lado2) {
		return 6 * lado1 + lado2;
	}

}
