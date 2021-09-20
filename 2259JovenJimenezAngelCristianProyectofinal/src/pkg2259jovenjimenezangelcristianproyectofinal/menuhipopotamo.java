package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class menuhipopotamo {
    
    Scanner sc = new Scanner(System.in);

    //Aqui esta el menu del hipopotamo, se utiliza para poder interactuar con el hipopotamo
    
     //Creacion de Hipopotamo 1 y 2
    Hipopotamo Gloria = new Hipopotamo(1.5f, 45, false, 1.3f, 2200.0f, 4, "Gris", true); //longitudDientescm, numeroDientes, tieneMelena, alturaM, pesoKG, numPatas, colorDominante, sexo (puede reproducirse)
    Hipopotamo MotoMoto = new Hipopotamo(2.0f, 45, false, 1.4f, 2500.0f, 4, "Gris", false);
    
    //Para el menu
    Hipopotamo hipopotamo1 = new Hipopotamo();
    Menuprincipal menup = new Menuprincipal();
    
    int eleccion = -1;
    
    public void menu3(){
        
    do{    
        System.out.println("**********Seccion: Hipopotamo**********");
        System.out.println("**********¿Que quieres hacer?**********");
        System.out.println("0 para regresar al menu principal");
        System.out.println("1 para observar al hipopotamo");
        System.out.println("2 para molestar al hipopotamo");
        System.out.println("3 para alimentar al hipopotamo");
        System.out.println("4 para reproducir al hipopotamo");
        System.out.println("***************************************");
   
    
        eleccion = Integer.parseInt(sc.next());
          
            
            switch(eleccion){
                
                case 0: menup.mainmenu();
                    break;
                    
                case 1: hipopotamo1.nadar();
                    break;
                    
                case 2: hipopotamo1.atacar();
                    break;
                    
                case 3: 
                    String comida = "";
                    comida = sc.nextLine();
                    hipopotamo1.comer(comida);
                    break;
                    
                case 4: 
                    String nombrehipopotamo = "";
                    nombrehipopotamo = sc.nextLine();
                    hipopotamo1.reproducirse(nombrehipopotamo);
                    break;    
            
            }
        }while (eleccion != 0); 
    }
    
}
