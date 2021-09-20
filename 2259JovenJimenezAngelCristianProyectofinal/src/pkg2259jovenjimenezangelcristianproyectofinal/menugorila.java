package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class menugorila {
    
    Scanner sc = new Scanner(System.in);

    //Aqui esta el menu del gorila, se utiliza para poder interactuar con el gorila
    
    //Creacion de Gorila 1 y 2
    Gorila Gaika = new Gorila(840.5f, 2, false, true, 1.3f, 2200.0f, 2, "Gris", true); //fuerzakg, numBrazos, alfa, tieneMelena, alturaM, pesoKG, numPatas, colorDominante, sexo (puede reproducirse)
    Gorila Koko = new Gorila(850.0f, 2, true, true, 1.5f, 2500.0f, 2, "Gris", false);
    
    //Para el menu
    Gorila gorila1 = new Gorila();
    Menuprincipal menup = new Menuprincipal();
    
    int eleccion = -1;
    
    public void menu4(){
        
    do{    
        System.out.println("************Seccion: Gorila************");
        System.out.println("**********¿Que quieres hacer?**********");
        System.out.println("0 para regresar al menu principal");
        System.out.println("1 para interactuar con el gorila");
        System.out.println("2 para molestar al gorila");
        System.out.println("3 para alimentar al gorila");
        System.out.println("4 para reproducir al gorila");
        System.out.println("***************************************");
   
    
        eleccion = Integer.parseInt(sc.next());
          
            
            switch(eleccion){
                
                case 0: menup.mainmenu();
                    break;
                    
                case 1: gorila1.interaccion();
                    break;
                    
                case 2: gorila1.atacar();
                    break;
                    
                case 3: 
                    String comida = "";
                    comida = sc.nextLine();
                    gorila1.comer(comida);
                    break;
                    
                case 4: 
                    String nombregorila = "";
                    nombregorila = sc.nextLine();
                    gorila1.reproducirse(nombregorila);
                    break;    
            
            }
        }while (eleccion != 0); 
    }
    
    
}
