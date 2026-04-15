import java.util.Scanner;

public class TareaClaseWhile {
    /*Enunciado
Crear un programa que muestre este menú:
1 - Sumar dos números
2 - Restar dos números
3 - Ver cantidad de operaciones realizadas
0 - Salir
El programa debe:
Repetirse hasta que el usuario elija 0
Ejecutar la opción elegida
Contar cuántas operaciones se realizaron (solo suma/resta) */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opc;
    int num;
    int suma = 0;
    int resta = 0;
    int operacionesSuma = 0;
    int operacionesResta = 0;
    

    System.out.println("Ingrese su opcion ingrese 1 para sumar, 2 para restar o 0 para cancelar");
    opc = scanner.nextInt();

    while (opc != 0) {
        
    if (opc == 1) {
        System.out.println("ingrese un numero");
        num = scanner.nextInt();
        while (num != 0) {
            suma += num;

            operacionesSuma ++;
        System.out.println("Ingrese el siguiente numero (0 para terminar)");
            num = scanner.nextInt();
        }
    }else if (opc == 2) {
        System.out.println("ingrese un numero");
        num = scanner.nextInt();
        while (num != 0) {
            resta -= num;

            operacionesResta ++;
            System.out.println("increse el sieguiente numero ( 0 para terminar )");
            num = scanner.nextInt();
        }
    }else {
        System.out.println("no se inicio ninguna operacion");
    }

    System.out.println("Ingrese su opcion ingrese 1 para sumar, 2 para restar o 0 para cancelar");
    opc = scanner.nextInt();

        }
        if (operacionesSuma >0 || operacionesResta > 0) {
            System.out.println("el total de operaciones de SUMA es:" + operacionesSuma);
            System.out.println("el total de operaciones de RESTA es:" + operacionesResta);
        }else{
            System.out.println("no se ingresaron datos");
        }
        scanner.close();
        }
        
    } 




