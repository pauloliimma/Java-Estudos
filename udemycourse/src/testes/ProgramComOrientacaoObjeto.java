package testes;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class ProgramComOrientacaoObjeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();		
		//double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite os lado do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
//		xA = sc.nextDouble();
//		xB = sc.nextDouble();
//		xC = sc.nextDouble();
		System.out.println("Digite os lado do triangulo B:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
//		yA = sc.nextDouble();
//		yB = sc.nextDouble();
//		yC = sc.nextDouble();
		
		
		double areaX = x.area();
//		double p = (x.a + x.b + x.c) / 2.0;
//		double areaX = Math.sqrt(p * (p -x.a) * (p - x.b) * (p - x.c));
		
//		double p = (xA + xB + xC) / 2.0;
//		double areaX = Math.sqrt(p * (p -xA) * (p - xB) * (p - xC));
				
		
		double areaY = x.area();
//		p = (y.a + y.b + y.c) / 2.0;
//		double areaY = Math.sqrt(p * (p -y.a) * (p - y.b) * (p - y.c));
//		
//		p = (yA + yB + yC) / 2.0;
//		double areaY = Math.sqrt(p * (p -yA) * (p - yB) * (p - yC));
		
		System.out.printf("Tringulo X area: %4f%n", areaX);
		System.out.printf("Triangulo Y area: %4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		}
		else {
			System.out.println("Maior area: Y");
		}
		sc.close();
	}

}
