
import java.util.Scanner;

public class Ejercicio03_Promedios {
    public static void main(String[] args) {
        double p1,p2,p3,p4;
        Scanner tcl = new Scanner(System.in); 
        System.out.print("Ingrese el parametro 1: (1-10): ");
        p1=tcl.nextDouble();
        System.out.print("Ingrese el parametro 2: (1-10): ");
        p2=tcl.nextDouble();
        System.out.print("Ingrese el parametro 3: (1-10): ");
        p3=tcl.nextDouble();
        System.out.print("Ingrese el parametro 4: (1-10): ");
        p4=tcl.nextDouble();
        System.out.println("--------------------------------------");
        System.out.println("Su promedio cualitativo es " + pcualitativo(p1,p2,p3,p4));
        System.out.println("--------------------------------------");
    }
    public static String pcualitativo(double p1,double p2,double p3,double p4) {
        double prom;
        prom = (p1+p2+p3+p4)/4;
        if (prom < 5) {
            return "Regular";
        } else if (prom >5 && prom<8){
            return "Bueno";
        } else if (prom >8 && prom<9){
            return "Muy Bueno";
        } else if (prom >9){
            return "Sobresaliente";
        } else {
        return null;
        }
    }
}
/*
Ingrese el parametro 1: (1-10): 8
Ingrese el parametro 2: (1-10): 9
Ingrese el parametro 3: (1-10): 7
Ingrese el parametro 4: (1-10): 10
--------------------------------------
Su promedio cualitativo es Muy Bueno
--------------------------------------
*/