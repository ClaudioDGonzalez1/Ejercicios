package Clase8;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Integer temperatura;

        System.out.println("Ingrese la temperatura");
        temperatura = scanner.nextInt();

        if(temperatura > 30){
            System.out.println("La temperatura es ALTA");
        }else if (temperatura > 15){
            System.out.println("La temperatura es AGRADABLE");
        }else{
            System.out.println("La temperatura es BAJA");
        }
        scanner.close();
    }
}
