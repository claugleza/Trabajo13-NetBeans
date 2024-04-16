
package calculador;

import java.util.Scanner;

public class CALCULADOR {


    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        
       System.out.println("por favor ingrese dos nnumeros; ");
       //definimos numeros que seran introducidos por teclado 
       int num1= teclado.nextInt();
        int num2 = teclado.nextInt();
        
        //definimos las operaciones 
        int suma= num1+num2;
        int resta= num1-num2;
        int multiplicacion = num1*num2;
        int division = num1/num2;
        
        //menu escrito para ver ls opciones que podremos elegir 
        System.out.println("seleccione la operacion que desa realizar : ");
        System.out.println("1. Suma ");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicaacion");
        System.out.println("4. Division ");
        
        int choice= teclado.nextInt();
        
        //swich para elegir la opcion que quermaos realizar 
        switch(choice){
            case 1:
                System.out.println("el resultado de la suma es: "+suma);
                break;
             
            case 2: 
                System.out.println("el resultado de la resta es: "+resta);
                break;
                
            case 3 : 
                System.out.println("el resultado de la multiplicacion es : "+multiplicacion);
              break;
              
            case 4 : 
                System.out.println("el resultado de la division es : "+division);
                break;
                
            default:
                System.out.println("opcion no valida");
        }
        
    }
    
}
