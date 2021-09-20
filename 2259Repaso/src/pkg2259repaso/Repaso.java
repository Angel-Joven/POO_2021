package pkg2259repaso;

import java.util.Scanner;

public class Repaso {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        Leon simba = new Leon(5, true, 0, 1, 50, 4, "Morado", false);
        Leon mufasa = new Leon(5, true, 1, 1.5f, 150.3f, 4, "Amarillo", false);
        Leon nala = new Leon(5, false, 0, 1.2f, 45, 4, "Naranja", true);
        
        int eleccion = -1;
        
        do { 
            System.out.println("**********MENU**********");
            System.out.println("0 para salir");
            System.out.println("1 para moletar al leon");
            System.out.println("2 para apagar las luces");
            System.out.println("3 para alimentar al leon");
            System.out.println("4 Simba y Nala");
            System.out.println("*************************");
            
            eleccion = Integer.parseInt(sc.next());
            
            if (eleccion == 1) {
                simba.atacar();
            }else{
                if(eleccion == 2){
                    simba.dormir();
                }else if(eleccion == 3){
                    System.out.println("¿Con que alimentas al leon?");
                    String comida = "";
                    comida = sc.nextLine();
                    simba.comer(comida);
                }else if(eleccion == 4){
                    simba.reproducirse(nala); 
                }else if(eleccion == 0){
                    System.out.println("Adios, vuelve pronto!");
                }else{
                    System.out.println("Opcion no valida, revise el menu de opciones");
                
                    
                }
                
            }
            
        } while (eleccion != 0);
        
        
        
        
        /*
        System.out.println("El estado de simba en la manada es: " + simba.getAlfa);
        System.out.println("La melena de simba es: " + simba.isMelena);
        System.out.println("Simba tiene un total de garras: " + simba.getNumPatas() * simba.numGarrasPata);
        System.out.println("Simba mide: " + simba.getAlturaM() + " metros");
        System.out.println("Simba pesa: " + simba.getPesoKg() + " Kg");
        System.out.println("Simba es de color: " + simba.getColorDominante());
        System.out.println("Simba es del genero: " + simba.getSexo());
        System.out.println("---------------------------");
        System.out.println("Mufasa pesa: " + mufasa.getPesoKg() + " Kg");
        System.out.println("---------------------------");
        
        simba.dormir();
        System.out.println("---------------------------");
        mufasa.comer("Carne"); //A != a != á != Á
        */
        
        
        
        /*
                
        String nombre = "";
        
        
        System.out.println("Hola, dame tu nombre: ");
        nombre = sc.nextLine(); //Para ingresar datos
        System.out.println("Hola " + nombre + ", =)");
        
        for(int i = 0; i <= 2; i++){
        nombre = "";
        System.out.println("Hola, dame tu nombre: ");
        nombre = sc.nextLine(); //Para ingresar datos
        System.out.println("Hola " + nombre + ", =)");
        }
        */
        
        
        
    }
    
}
