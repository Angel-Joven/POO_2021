package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class menuleon {
   
    Scanner sc = new Scanner(System.in);
    
    //Aqui esta el menu del leon, se utiliza para poder interactuar con el leon
    
    //Creacion de Leon 1 y 2
    Leon Nala = new Leon(4, true, false, 150.0f, 126.0f, 4, "Amarillo", true); //numGarraspPata, tieneMelena, esAlfa, alturaM, pesoKG, numPatas, colorDominante, sexo (puede reproducirse)
    Leon Simba = new Leon(4, true, true, 181.5f, 190.0f, 4, "Amarillo", false);
    
    //Para el menu
    Leon leon1 = new Leon();
    Menuprincipal menup = new Menuprincipal();
    
    int eleccion = -1;
    
    public void menu1(){
        
    do{    
        System.out.println("**********Seccion: Leon**********");
        System.out.println("*******¿Que quieres hacer?*******");
        System.out.println("0 para regresar al menu principal");
        System.out.println("1 para observar al leon");
        System.out.println("2 para molestar al leon");
        System.out.println("3 para alimentar al leon");
        System.out.println("4 para reproducir al leon");
        System.out.println("*********************************");
   
    
        eleccion = Integer.parseInt(sc.next());
          
            
            switch(eleccion){
                
                case 0: menup.mainmenu();
                    break;
                    
                case 1: leon1.rugir();
                    break;
                    
                case 2: leon1.atacar();
                    break;
                    
                case 3: 
                    String comida = "";
                    comida = sc.nextLine();
                    leon1.comer(comida);
                    break;
                    
                case 4: 
                    String nombreleon = "";
                    nombreleon = sc.nextLine();
                    leon1.reproducirse(nombreleon);
                    break;    
            
            }
        }while (eleccion != 0); 
    }
}
