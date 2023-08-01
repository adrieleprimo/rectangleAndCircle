package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List <Shape> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for (int i = 1; i<=n;i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if ( answer == 'c') {
				System.out.print("Radius: ");
				Double circleRadius = sc.nextDouble();
				list.add(new Circle (color, circleRadius));
			}
			else if ( answer == 'r') {
				System.out.print("Width: ");
				Double rectangleWidth = sc.nextDouble();
				System.out.print("Height: ");
				Double rectangleHeight = sc.nextDouble();
				list.add(new Rectangle(color, rectangleWidth, rectangleHeight));
			}	
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		list.forEach(System.out::print);
		sc.close();
  }
}
