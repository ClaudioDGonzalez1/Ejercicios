import java.util.Scanner;
public class Envios {
    
    /*Consigna

Un correo calcula el costo de envío según el peso del paquete.

El programa debe mostrar un menú:

1 - Registrar paquete
2 - Calcular costo de envío
3 - Ver último costo calculado
0 - Salir
Reglas del sistema

El costo se calcula así:

Hasta 1 kg → $800
Más de 1 kg y hasta 5 kg → $800 + $300 por cada kg adicional
Más de 5 kg → tarifa plana de $2000
Qué debe hacer el programa
Permitir ingresar el peso del paquete
Calcular el costo cuando el usuario lo solicite
Mostrar el último costo calculado
Repetirse hasta que el usuario salga */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Integer opc = -1;
            Integer paquete;
            Integer pesoPaquete;
            Integer precioBase = 800;
            Integer tarifaPlana = 2000;
            Integer costoEnvio =0;
            Integer ultimoCosto = 0;
            
        while (opc != 0) {
                System.out.println("Ingrese la opcion deseada.");
            System.out.println("1. Registrar un paquete.");
            System.out.println("2. Calcular Envio");
            System.out.println("3. Ver ultimo calculo de Costo");
            System.out.println("0. Salir");
            opc = scanner.nextInt();

            switch (opc) {
                case 1: // registro de paquetes
                    System.out.println("Registro de paquetes.");
                    System.out.println("Ingrese su paquete");
                    paquete = scanner.nextInt();

                    
                    System.out.println("Paquete ingresado: " + paquete);
                    System.out.println("-----");
                    
                    break;
                case 2: // costo de envios
                    System.out.println("Costo de envio");
                    System.out.println("Ingrese el peso de su paquete");
                    pesoPaquete = scanner.nextInt();
                    System.out.println("Peso de su paquete: "+ pesoPaquete);

                    if(pesoPaquete <= 1){
                System.out.print("Valor a Abonar es de " + precioBase);
                    }else if ( pesoPaquete > 1 & pesoPaquete < 5){
                        costoEnvio = 800 + ((pesoPaquete - 1)*300);
                        System.out.println("Valor a abonar es de: $"+ costoEnvio);
                    }else {
                        System.out.println("Valor a abonar es de: $"+ tarifaPlana);
                    }
                    break;
                case 3: // ver ultimo calculo
                ultimoCosto = costoEnvio;
                    System.out.println("Ultimo Calculo de envio:" + ultimoCosto);
                    break;
                case 0: // ver ultimo calculo
                    System.out.println("Finalizado") ;
                    break;
            
                default:
                    System.out.println("Dato invalido");
                    break;
            }
                    if (opc !=0 ) {
                        System.out.println(" ");
                    System.out.println("Presione enter para continuar.");
                    scanner.nextLine();
                    scanner.nextLine();
                    }
        }
    }
}


