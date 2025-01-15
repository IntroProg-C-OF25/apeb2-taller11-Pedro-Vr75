
import java.util.Scanner;
public class Ejercicio02_Areas {

    public static void main(String[] args) {
        int opcion;
        double lado, base, altura;
        Scanner tcl = new Scanner(System.in);
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Rectangulo");
        System.out.print("Ingrese su opcion: ");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado: ");
                lado = tcl.nextDouble();
                cuadrado(lado);
                System.out.print("El area del cuadrado es: " + cuadrado(lado));
                break;
            case 2:
                System.out.println("Ingrese base y altura: ");
                base = tcl.nextDouble();
                altura = tcl.nextDouble();
                triangulo(base, altura);
                System.out.print("El area del triangulo es: " + triangulo(base, altura));
                break;
            case 3:
                System.out.println("Ingrese base y altura: ");
                base = tcl.nextDouble();
                altura = tcl.nextDouble();
                rectangulo(base, altura);
                System.out.print("El area del rectangulo es: "+ rectangulo(base, altura));
                break;
            default:
                throw new AssertionError();
        }
    }

    public static double cuadrado(double lado) {
        return lado * lado * lado * lado;

    }

    public static double triangulo(double base, double altura) {
        return (base * altura) / 2;

    }

    public static double rectangulo(double base, double altura) {
        return base * altura;

    }
}
/*
1. Cuadrado
2. Triangulo
3. Rectangulo
Ingrese su opcion: 1
Ingrese el lado: 
5
El area del cuadrado es: 625.
*/