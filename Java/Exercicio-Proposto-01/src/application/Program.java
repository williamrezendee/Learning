package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import enums.Color;
import entities.Circle;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);
		
		// INSTANCIANDO A CLASSE INTERNA "INNER"
		Program program = new Program();
		Inner inner = program.new Inner();
		
		System.out.print("Enter the number of shapes: ");
		int number = in.nextInt();
		
		// CHAMADA A MÉTODOS INTERNOS DA CLASSE ANINHADA
		inner.ShapesData(number, in);
		inner.ShowShapesArea();
		in.close();
	}
	// Nested class
	protected class Inner {
		// AQUI TEMOS UM EXEMPLO DE CLASSE ANINHADA. 
		// É UMA CLASSE INTERNA À CLASSE PROGRAM.
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		protected void ShapesData(int number, Scanner in) {
			for (int i = 0; i < number; i++) {
				System.out.printf("Shape #%d data: \n", i + 1);
				System.out.print("Rectangle or Circle (R/C)? ");
				char character = Character.toUpperCase(in.next().charAt(0));
				System.out.print("Color (Black, Blue or Red): ");
				in.nextLine();
				String str = new String(in.nextLine());
				Color color = Color.valueOf(str.toUpperCase().trim());
				
				if (character == 'R') {
					System.out.print("Width: ");
					double width = in.nextDouble();
					System.out.print("Height: ");
					double height = in.nextDouble();
					shapes.add(new Rectangle(width, height, color)); // POLIMORFISMO APLICADO
				}
				else if(character == 'C') {
					System.out.print("Radius: ");
					double radius = in.nextDouble();
					shapes.add(new Circle(radius, color)); // POLIMORFISMO APLICADO
				}
			}
		}
		protected void ShowShapesArea() {
			System.out.println();
			System.out.println("SHAPES AREAS: ");
			for (Shape sp : shapes) {
				double area = sp.Area();
				if (sp instanceof Rectangle) {
					System.out.printf("Rectangle area: %.2f\n", area);
				}
				else if (sp instanceof Circle) {
					System.out.printf("Circle area: %.2f\n", area);
				}
			}
		}		
	}
}
