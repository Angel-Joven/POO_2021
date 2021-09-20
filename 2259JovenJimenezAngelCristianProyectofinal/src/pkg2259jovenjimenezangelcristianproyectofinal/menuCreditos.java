package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class menuCreditos {
    
    Scanner sc = new Scanner(System.in);
    
    //Aqui esta el menu para los creditos, se utiliza para poder ver datos generales 
    
    //Para el menu
    Menuprincipal menup = new Menuprincipal();
    
    int eleccion = -1;
    
    public void menu5(){
        
    do{    
        System.out.println("*************Seccion: Creditos*************");
        System.out.println("UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO");
        System.out.println("FACULTAD DE ESTUDIOS SUPERIORES ARAGON");
        System.out.println("INGENIERIA EN COMPUTACION");
        System.out.println("Alumno: JOVEN JIMENEZ ANGEL CRISTIAN");
        System.out.println("Grupo: 2259");
        System.out.println("PROYECTO FINAL: ZOOLOGICO");
        System.out.println("Fecha: 06 julio 2021");
        System.out.println("*******************************************");
        System.out.println("0 para regresar al menu principal");
        System.out.println("*******************************************");
   
    
        eleccion = Integer.parseInt(sc.next());
          
            
            switch(eleccion){
                
                case 0: menup.mainmenu();
                    break;   
            }
        }while (eleccion != 0); 
    }
    
}
