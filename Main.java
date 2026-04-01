import java.util.Scanner;

public class Main{

public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print("Hola, ingresa tu nombre");

    String user = scanner.nextLine();

    System.out.print("Hola " + user + " ingresa tu edad");

    Integer edad = scanner.nextInt();

System.out.print("Hola " + " y tengo " + " anios" + " y mido "  + "cm de altura");

}
}