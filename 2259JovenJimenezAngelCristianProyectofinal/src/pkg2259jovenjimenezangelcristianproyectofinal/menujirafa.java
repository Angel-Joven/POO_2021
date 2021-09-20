package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class menujirafa {
    
    Scanner sc = new Scanner(System.in);
    
    //Aqui esta el menu de la jirafa, se utiliza para poder interactuar con la jirafa
    
    //Creacion de Jirafa 1 y 2
    Jirafa Zulai = new Jirafa(1.5f, 1.2f, true, 450.0f, 126.0f, 4, "Amarillo", true); //longitudCuellom, longitudPiernasm, tieneMelena, alturaM, pesoKG, numPatas, colorDominante, sexo (puede reproducirse)
    Jirafa Melman = new Jirafa(2.0f, 1.5f, true, 500.0f, 160.0f, 4, "Amarillo", false);
    
    //Para el menu
    Jirafa jirafa1 = new Jirafa();
    Menuprincipal menup = new Menuprincipal();
    
    int eleccion = -1;
    
    public void menu2(){
        
    do{    
        System.out.println("**********Seccion: Jirafa**********");
        System.out.println("********¿Que quieres hacer?********");
        System.out.println("0 para regresar al menu principal");
        System.out.println("1 para observar a la jirafa");
        System.out.println("2 para molestar a la jirafa");
        System.out.println("3 para alimentar a la jirafa");
        System.out.println("4 para reproducir a la jirafa");
        System.out.println("***********************************");
   
    
        eleccion = Integer.parseInt(sc.next());
          
            
            switch(eleccion){
                
                case 0: menup.mainmenu();
                    break;
                    
                case 1: jirafa1.observar();
                    break;
                    
                case 2: jirafa1.atacar();
                    break;
                    
                case 3: 
                    String comida = "";
                    comida = sc.nextLine();
                    jirafa1.comer(comida);
                    break;
                    
                case 4: 
                    String nombrejirafa = "";
                    nombrejirafa = sc.nextLine();
                    jirafa1.reproducirse(nombrejirafa);
                    break;    
            
            }
        }while (eleccion != 0); 
    }
    
}
