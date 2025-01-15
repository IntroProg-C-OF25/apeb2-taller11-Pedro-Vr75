
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01_ProcesoArreglos {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner tcl = new Scanner(System.in);
        int sumamatriz = 0;
        double promediomatriz = 0;
        int filas, columnas;
        System.out.print("Ingrese el valor de filas y colunmas: ");
        filas = tcl.nextInt();
        columnas = tcl.nextInt();
        int Matriz[][] = new int[filas][columnas];
        generarMatriz(Matriz);
        presentarMatriz(Matriz);
        paresMatriz(Matriz);
        promedioMatriz(Matriz);
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void paresMatriz(int Matriz[][]) {
        System.out.print("Los elementos pares son: \n");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print((Matriz[i][j] % 2) == 0 ? Matriz[i][j] + " " : " ");
            }
            System.out.println("");
        }
        System.out.print("Los elementos impares son: \n");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                System.out.print((Matriz[i][j] % 2) != 0 ? Matriz[i][j] + " " : " ");
            }
            System.out.println("");
        }
    }

    public static void promedioMatriz(int Matriz[][]) {
        int sumamatriz = 0;
        double promediomatriz = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) {
                sumamatriz += Matriz[i][j];
            }
        }
        promediomatriz = sumamatriz / (Matriz.length * Matriz[0].length);
        System.out.println("El promedio es " + promediomatriz);
    }
}
/*
Ingrese el valor de filas y colunmas: 5
4
2 8 8 5 
6 0 3 6 
4 1 8 2 
6 0 4 8 
6 9 1 5 
Los elementos pares son: 
2 8 8  
6 0  6 
4  8 2 
6 0 4 8 
6    
Los elementos impares son: 
   5 
  3  
 1   
    
 9 1 5 
El promedio es 4.0
*/