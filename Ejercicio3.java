import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args){

    Scanner scanner = new Scanner (System.in);
    
    String nombre;
    String apellido;
    String curso;
    Integer dni;
    Integer edad;
    Integer fechaNac;

    System.out.println("ingrese su nombre: ");
    nombre = scanner.nextLine();

    System.out.println("Ingrese su apellido: ");
    apellido = scanner.nextLine();

    System.out.println("Ingrese su curso: ");
    curso = scanner.nextLine();

    System.out.println("Ingrese su Numero de Documento: ");
    dni = scanner.nextInt();

    System.out.println("Ingrese su edad: ");
    edad = scanner.nextInt();

    System.out.println("Ingrese su fecha de nacimiento: ");
    fechaNac = scanner.nextInt();

    }
    }