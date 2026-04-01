import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args){

    Scanner scanner = new Scanner (System.in);

       Integer edad1;
       Integer edad2;
       Integer edad3;
       Integer edad4;

       Integer totalEdad;
       Integer promedioEdad;


        System.out.println("Ingrese edad1");
        edad1 = scanner.nextInt();
        System.out.println("Ingrese edad2");
        edad2 = scanner.nextInt();
        System.out.println("Ingrese edad3");
        edad3 = scanner.nextInt();
        System.out.println("Ingrese edad4");
        edad4 = scanner.nextInt();

        totalEdad = edad1 + edad2 + edad3 + edad4 ;
        promedioEdad = totalEdad / 4 ;

        System.out.println("El Promedio de edades es " + promedioEdad);
    }
}