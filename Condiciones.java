import java.util.Scanner;

public class Condiciones {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Integer edad ;

    System.out.println("ingresa tu edad");

    edad = scanner.nextInt();
  boolean entrada = false;
  
            entrada = scanner.nextBoolean();
        if  (edad >=18 & entrada == true){
            System.out.println("tiene entrada");
            
        }
        System.out.println("Fin del programa");
    }
}