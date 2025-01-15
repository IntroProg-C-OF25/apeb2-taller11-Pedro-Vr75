
import java.util.Scanner;


public class Ejercicio04_LuzeInmoviliaria {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, cedula;
        System.out.println("===Seleccione un procedimiento para realizar===");
        System.out.println("1. Calcular el valor de la Luz");
        System.out.println("2. Calcular Predio Inmoviliario");
        int opcion = tcl.nextInt();
        System.out.print("Ingrese su nombre: ");
        nombre = tcl.next();
        tcl.next();
        System.out.print("Ingrese su numero de cedula: ");
        cedula = tcl.next();
        switch (opcion){
            case 1:
                Calcularluz( nombre, cedula);
                
                break;
            case 2:
                CalcularPredio(nombre, cedula);
                break;
        }
    }
    public static void Calcularluz(String nombre, String cedula){
        double klw, cklw;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor por kilowatio: ");
        klw = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilowatios al mes: ");
        cklw = tcl.nextDouble();
        System.out.println("Cliente "+nombre+", con cédula "+cedula+", debe cancelar el valor de $"+(klw*cklw));
    }
    public static void CalcularPredio(String nombre, String cedula){
        Scanner tcl = new Scanner(System.in);
        double vinmueble;
        System.out.print("Ingrese el valor del inmueble: ");
        vinmueble = tcl.nextDouble();
        System.out.println("Cliente "+nombre+", con cédula "+cedula+", tiene un bien inmueble valorado en $"+vinmueble+
                " y tiene que pagar de predio $"+(vinmueble*0.02));
              
    }
}
/*
===Seleccione un procedimiento para realizar===
1. Calcular el valor de la Luz
2. Calcular Predio Inmoviliario
2
Ingrese su nombre: Pedro Vargas
Ingrese su numero de cedula: 1150256269
Ingrese el valor del inmueble: 16600
Cliente Pedro, con c�dula 1150256269, tiene un bien inmueble valorado en $16600.0y tiene que pagar de predio $332.0
*/
