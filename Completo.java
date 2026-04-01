import java.util.Scanner;

public class Completo{

    public static void main(String[] args){

    Scanner scanner = new Scanner (System.in);

    String producto1, producto2, producto3, producto4, producto5;

    Integer precio1, precio2, precio3, precio4, precio5;

    Integer totalProductos;
    Integer cantidadProductos;

    System.out.println("ingrese nombre de producto 1: ");
    producto1 = scanner.nextLine();
    System.out.println("ingrese nombre de producto 2: ");
    producto2 = scanner.nextLine();
    System.out.println("ingrese nombre de producto 3: ");
    producto3 = scanner.nextLine();
    System.out.println("ingrese nombre de producto 4: ");
    producto4 = scanner.nextLine();
    System.out.println("ingrese nombre de producto 5: ");
    producto5 = scanner.nextLine();

    System.out.println("ingrese el precio de producto 1: ");
    precio1 = scanner.nextInt();
    System.out.print("ingrese el precio de producto 2: ");
    precio2 = scanner.nextInt();
    System.out.println("ingrese el precio de producto 3: ");
    precio3 = scanner.nextInt();
    System.out.println("ingrese el precio de producto 4: ");
    precio4 = scanner.nextInt();
    System.out.println("ingrese el precio de producto 5: ");
    precio5 = scanner.nextInt();

    totalProductos = precio1 + precio2 + precio3 + precio4 + precio5 ;
    cantidadProductos =  5 ;


    }
}