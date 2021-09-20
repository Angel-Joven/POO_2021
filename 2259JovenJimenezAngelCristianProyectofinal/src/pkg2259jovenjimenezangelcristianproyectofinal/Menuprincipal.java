package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class Menuprincipal {
    
    public void mainmenu(){
        
        //Este menu es el principal y se podra elegir a donde se va a querer ir
        //Para llamar a los metodos de las clases de los animales
        
        Scanner sc = new Scanner(System.in);
        menuleon menuleon1 = new menuleon();
        menujirafa menujirafa1 = new menujirafa();
        menuhipopotamo menuhipopotamo1 = new menuhipopotamo();
        menugorila menugorila1 = new menugorila();
        menuCreditos menucreditos1 = new menuCreditos();
        
        
        int eleccion = -1;
        
            System.out.println("*******************MENU********************");
            System.out.println("***********¿A donde quieres ir?************");
            System.out.println("0 para salir del zoologico");
            System.out.println("1 para visitar al leon");
            System.out.println("2 para visitar a la jirafa");
            System.out.println("3 para visitar al Hipopotamo");
            System.out.println("4 para visitar al Gorila");
            System.out.println("5 para ver los creditos");
            System.out.println("*******************************************");
            
            eleccion = Integer.parseInt(sc.next());
            
            switch(eleccion){
                
                case 0: System.out.println("Has salido del zoologico, ¡vuelva pronto!");
                    break;
                
                case 1: menuleon1.menu1();
                    break;
                    
                case 2: menujirafa1.menu2();
                    break;
                    
                case 3: menuhipopotamo1.menu3();
                    break;
                    
                case 4: menugorila1.menu4();
                    break; 
                
                case 5: menucreditos1.menu5();
                    break;
              
            } 
        
        } 

}
