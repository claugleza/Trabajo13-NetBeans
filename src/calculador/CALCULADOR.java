
package calculador;

import java.util.Scanner;

public class CALCULADOR {


    public static void main(String[] args) {


        Operaciones calcul = new Operaciones();
	Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese dos números:");
        
 
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
   	System.out.println("4. División");
        
        int choice = teclado.nextInt();

 
        switch(choice) {
            case 1:
                System.out.println("El resultado de la suma es: " +calcul.suma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + calcul.resta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + calcul.multiplicacion(num1,num2));
                break;
            case 4:
               
                    System.out.println("El resultado de la división es: " +calcul.division(num1,num2));
                break;
            default:
                System.out.println("Opción no válida");
        }
        

      
    }
}