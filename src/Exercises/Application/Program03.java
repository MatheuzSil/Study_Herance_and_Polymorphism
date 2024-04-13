package Exercises.Application;

import Exercises.entities.exercise03.Circle;
import Exercises.entities.exercise03.Rectangle;
import Exercises.entities.exercise03.Shape;
import Exercises.entities.exercise03.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {

        List <Shape> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print("Rectangle or Circle: (r/c)? ");
            char shape = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (shape == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, height, width));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape: list) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}
