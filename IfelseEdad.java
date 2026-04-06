package Clase8;

import java.util.Scanner;

public class IfelseEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer edad ;
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        
        if(edad >= 18){
            System.out.println("Eres Adulto");
        }else if (edad >=13){
            System.out.println("Eres Adolescente");
    }else
        System.out.println("Eres un Niño");
    
        scanner.close();
}
}


