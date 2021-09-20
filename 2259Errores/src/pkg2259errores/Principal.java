package pkg2259errores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        
        System.out.println("Divisiones");
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Inserte el primer numero: ");
        
        try{
             numero1 = sc.nextInt(); //Para ingresar el numero1
        }catch(InputMismatchException | NumberFormatException e){
            System.out.println("El dato que me diste no es un numero");
            numero1 = Integer.parseInt(sc.next());
        }
        
        System.out.println("Inserte el segundo numero: ");
        
        try{
             numero2 = sc.nextInt(); //Para ingresar el numero1
        }catch(InputMismatchException | NumberFormatException e){
            System.out.println("El dato que me diste no es un numero");
            numero2 = Integer.parseInt(sc.next());
        }
        
        try{
            
            numero3 = numero1 / numero2; //Resultado de la division
            System.out.println("El resultado de la division es: " + numero3);
            
        }catch(ArithmeticException e){
            System.out.println("Me diste un valor que genera un error matematico");
            System.out.println("No se pueden hacer divisiones entre 0");
        }catch(RuntimeException e){
            System.out.println("Algo paso en tiempo de ejecucion");        
        }catch(Exception e){
            System.out.println("Me diste un valor que genera un error matematico"); 
        }
        
    }
 
}
