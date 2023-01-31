import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = "1";
        double length = 0;
        String operation = null;

        while (figure.equals("1") || figure.equals("2")) {
            System.out.println("Que figura deseas calcular? \n1. Circulo\n2. Cuadrado\n3. Salir del programa");
            figure = scanner.nextLine();

            if (figure.equals("1")) {
                System.out.println("Cual es la longitud del radio?");
                length = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Que operacion deseas realizar? (area or circunferencia)");
                operation = scanner.nextLine();
            } else if (figure.equals("2")) {
                System.out.println("Cual es la longitud del lado?");
                length = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Que operacion deseas realizar? (diagonal, perimetro o area)");
                operation = scanner.nextLine();
            } else if (figure.equals("3")) {
                System.out.println("Saliendo...\n");
                System.exit(0);
            } else {
                System.out.println("Operacion invalida\n");
                continue;
            }

            if (figure.equals("1")) {
                Circle circle = new Circle(length);
                if (operation.equals("circunferencia")) {
                    System.out.println("La circunferencia del circulo es: \n" + circle.getCircumference() + "\n");
                } else if (operation.equals("area")) {
                    System.out.println("El area del ciruclo es: \n" + circle.getArea() + "\n");
                } else {
                    System.out.println("Operacion invalida para un circulo\n");
                }
            } else if (figure.equals("2")) {
                Square square = new Square(length);
                if (operation.equals("diagonal")) {
                    System.out.println("La diagonal del cuadrado es: \n" + square.getDiagonal() + "\n");
                } else if (operation.equals("perimeter")) {
                    System.out.println("El perimetro del cuadrado es: \n" + square.getPerimeter() + "\n");
                } else if (operation.equals("area")) {
                    System.out.println("El area del cuadrado es: \n" + square.getArea() + "\n");
                } else {
                    System.out.println("Operacion invalida para un cuadrado\n");
                }
            }
        }

        System.out.println("Gracias!");
    }
}