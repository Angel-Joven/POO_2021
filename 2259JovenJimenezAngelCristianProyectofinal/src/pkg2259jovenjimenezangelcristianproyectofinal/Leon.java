package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class Leon extends Animal {
    
    Scanner sc = new Scanner(System.in);
    
    /*En esta clase se escribe lo necesario (atributos y metodos, 
    constructores, getters & setters), 
    para lograr el funcionamiento de la clase Leon
    */    

    //Atributos
    private int numGarrasPata;
    private boolean melena;
    private boolean alfa;
    
    //Constructores
    public Leon(){
        super(0.5f, 11.3f, 4, "Amarillo", true); //AlturaM, PesoKg, numPatas, colorDominante, sexo(reproducir)
        this.numGarrasPata = 4;
        this.melena = false;
        this.alfa = false;
    }
    
    //Constructor sobrecargado
    public Leon(int numGarraspPata, boolean tieneMelena, boolean alfa,
            float alturaM, float pesoKg,int numPatas, String colorDominante,
            boolean sexo){
        super(alturaM, pesoKg, numPatas, colorDominante, sexo);
        this.numGarrasPata = numGarraspPata;
        this.melena = tieneMelena;
        this.alfa = alfa;
        
    }
    
    //Metodos
    public void rugir(){
        System.out.print("El animal rugue");
    } 
    
    public void atacar(){
        int molestar = 0;
        System.out.print("¿Quieres molestar al leon? (Si = 1; No = 0)");
        molestar = sc.nextInt();
        if(molestar == 1){
            System.out.print("El leon te mordio");
        }else{
            System.out.print("El leon te esta observando");
        }
    } 
    
    //Especializar metodos del padre en el hijo
    public void dormir(){
        System.out.print("El leon duerme como leon");
    }
    
    public void comer(String comida){
        System.out.print("¿Quieres alimentar al leon? (Le gusta comer carne)");
        sc.nextLine();
        comida = sc.nextLine();
        System.out.print("Alimentaste al leon con: " + comida);
        if(comida.compareToIgnoreCase("carne") == 0){
            System.out.print("El leon si se come la comida");
        }else{
            System.out.print("El leon no se come la comida");
        }
    }
        
    public void reproducirse(String nombreleon){
        int reproduccion = 0;
        System.out.print("¿Quieres reproducir al leon con alguna leona cerca? (Si = 1; No = 0)");
        reproduccion = sc.nextInt();
        if(reproduccion == 0){
            System.out.print("El leon no se logro reproducir");
        }else{
        System.out.print("Escribe el nombre de la leona con quien quieres que se reproduzca (Disponible: Nala)");
        sc.nextLine();
        nombreleon = sc.nextLine();
        System.out.print("El leon se va a reproducir con: " + nombreleon);
        if(nombreleon.compareToIgnoreCase("nala") == 0){
            System.out.print("El leon logro reproducirse con: " + nombreleon);
        }else{
            System.out.print("El leon no se logro reproducir");
            }
        }
    } 
    
    //Getters and setters
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public int getNumGarrasPata() {
        return numGarrasPata;
    }

    public void setNumGarrasPata(int numGarrasPata) {
        this.numGarrasPata = numGarrasPata;
    }

    public boolean isMelena() {
        return melena;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }

    public boolean getAlfa() {
        return alfa;
    }

    public void setAlfa(boolean alfa) {
        this.alfa = alfa;
    }
    
}
