package Clase8;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        Integer numero ;
        
        System.out.println("Ingrese un numero");

        numero = scanner.nextInt();
     if(numero >= 50){
     System.out.println("El numero ingresado es mayor a ALTO");
     }else if( numero >=20 ){
        System.out.println(" El numero ingresado es MEDIO");
     }else{
        System.out.println("El numero ingresado es BAJO");
     }
     scanner.close();
}
}