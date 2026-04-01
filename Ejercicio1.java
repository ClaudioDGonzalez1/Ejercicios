import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args){

    

    Integer horas ;
    Integer precioHoras;
    Integer salario ;
    
    System.out.println("ingrese el precio x hora : ");
    precioHoras = scanner.nextInt();

      System.out.println("ingrese la cantidad de horas trabajadas: ");
    horas = scanner.nextInt();

    salario = horas * precioHoras ;
    System.out.println("El Salario total es de: " + salario);

    }
}
