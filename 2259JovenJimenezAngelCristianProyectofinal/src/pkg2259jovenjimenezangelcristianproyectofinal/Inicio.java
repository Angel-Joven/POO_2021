package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class Inicio {


    public static void main(String[] args) {
        // TODO code application logic here
     
        //Este menu es una introduccion (como cuando inicias un juego y te dice "presione tal boton"
        
        Scanner sc = new Scanner(System.in);
        Menuprincipal menup = new Menuprincipal();
        int eleccion = -1;
        
        System.out.println("**********BIENVENIDO AL ZOO JOVEN**********");
        System.out.println("1 para entrar al Zoologico");
        System.out.println("0 para salir al Zoologico");
        System.out.println("*******************************************");
     
        eleccion = Integer.parseInt(sc.next());
            
            switch(eleccion){
                
                case 1: menup.mainmenu();
                    break;
                    
                case 0: System.out.println("¡Vuelva pronto!");
                    break;
              
            } 
        
         } 
}
