package interfaceexercise;

import java.util.Scanner;

public class MainIfEx {
    public static void main(String[] args) {
        System.out.print("Please enter the side length of EquilateralTriangle: ");
        Scanner in = new Scanner(System.in);
        double sideLength = in.nextDouble();
        EquilateralTriangle et = new EquilateralTriangle(sideLength);
        System.out.println("The perimeter of this EquilateralTriangle is: " + et.getPerimeter());
        et.getInteriorAngle();
        System.out.println();
        System.out.print("Please enter the side length of Square: ");
        sideLength = in.nextDouble();
        Square square = new Square(sideLength);
        System.out.println("The perimeter of this EquilateralTriangle is: " + square.getPerimeter());
       square.getInteriorAngle();
    }
}
