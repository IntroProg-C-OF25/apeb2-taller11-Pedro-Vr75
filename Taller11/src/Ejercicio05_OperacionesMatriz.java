
import java.util.Scanner;


public class Ejercicio05_OperacionesMatriz {
    public static void main(String[] args) {
        int n;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor para la matriz: ");
        n = tcl.nextInt();
        int Matriz[][]=new int[n][n];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                Matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
        }
        Suma(Matriz);
        Resta(Matriz);
        Multiplicacion(Matriz);
    }
    public static void Suma(int Matriz[][]){
        int suma=0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                suma += Matriz[i][j];
            }
        }
        System.out.println("La suma de la Matriz es: "+suma);
    }
    public static void Resta(int Matriz[][]){
        int resta=0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                resta -= Matriz[i][j];
            }
        }
        System.out.println("La resta de la Matriz es: "+resta);
    }
    public static void Multiplicacion(int Matriz[][]){
        int multi=1;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                multi= multi *Matriz[i][j];
            }
        }
        System.out.println("La multiplicacion de la Matriz es: "+multi);
    }
}
/*
ngrese el valor para la matriz: 4
1 2 3 4 
0 1 4 9 
9 1 7 9 
1 9 0 9 
La suma de la Matriz es: 69
La resta de la Matriz es: -69
La multiplicacion de la Matriz es: 0
*/