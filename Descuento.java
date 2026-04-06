package Clase8;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer precio;

        System.out.println("Ingresa el total de tu compra");
        precio = scanner.nextInt();

        
        if(precio >= 10000){
            System.out.println("Obtuviste Descuento GRANDE");
        }else if (precio >= 5000){
            System.out.println("Obtuviste Descueto MEDIO");
        }else if (precio >= 2500){
            System.out.println("Obtuviste Descuento PEQUEÑO");
        }else {
            System.out.println("No obtuviste Descuento");
        }
        scanner.close();

}
}