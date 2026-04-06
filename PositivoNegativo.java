package Clase8;

import java.util.Scanner;

public class PositivoNegativo {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Integer numero;

    System.out.println("Ingrese un numero");
    numero = scanner.nextInt();

    if(numero > 0){
        System.out.println("El numero ingresado es POSITIVO");
    }else if (numero == 0){
        System.out.println("El numero es 0");
    }else{
        System.out.println("El numero ingresado es NEGATIVO");
    }
    scanner.close();
}    
}
