import java.util.Scanner;

public class Salario {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    Integer salario ;
    boolean horasExtras;
    Integer hsExtrasTrabajadas;
    Integer cantidadHoras;
    Integer valorHora = 25;
    Integer valorHoraExtra = 50;
    Integer totalHsExtra ;
    Integer totalCobrar;

        System.out.println("ingrese cantidad de horas trabajadas");
    cantidadHoras = scanner.nextInt();
    
    System.out.println("trabajo horas extras");
    horasExtras = scanner.nextBoolean();
    if(horasExtras == true){
    
    System.out.println("ingrese la cantidad de horas extras trabajadas");
    hsExtrasTrabajadas = scanner.nextInt();

    totalHsExtra = hsExtrasTrabajadas * valorHoraExtra;
    salario = cantidadHoras * valorHora;
    totalCobrar = totalHsExtra + salario;

    System.out.println("el salario que corresponde es " + "$" + totalCobrar);
    }
    else{
    salario = cantidadHoras * valorHora;
    System.out.println("el salario que corresponde es " + "$" + salario);
    }
 }
}