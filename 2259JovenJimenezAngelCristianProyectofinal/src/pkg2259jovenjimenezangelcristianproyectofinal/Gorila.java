package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class Gorila extends Animal {
    
    Scanner sc = new Scanner(System.in);
    
    /*En esta clase se escribe lo necesario (atributos y metodos, 
    constructores, getters & setters), 
    para lograr el funcionamiento de la clase Gorila
    */ 
    
    //Atributos
    private float fuerzakg;
    private int numBrazos;
    private boolean alfa;
    private boolean melena;
    
    //Constructores
    public Gorila(){
        super(1.5f, 150.0f, 2, "Gris", false); //AlturaM, PesoKg, numPatas, colorDominante, sexo(reproducir)
        this.fuerzakg = 850.0f;
        this.numBrazos = 2;
        this.alfa = true;
        this.melena = false;
    }
    
    //Constructor Sobrecargado
    public Gorila(float fuerzakg, int numBrazos, boolean alfa, boolean melena, float altura, float peso, int numPatas, String color, boolean sexo) {
        super(altura, peso, numPatas, color, sexo);
        this.fuerzakg = fuerzakg;
        this.numBrazos = numBrazos;
        this.alfa = alfa;
        this.melena = melena;
    }
    
    //Metodos
    public void interaccion(){
        int interactuar = 0;
        System.out.print("¿Quieres interactuar con el gorila?  (Si = 1; No = 0)");
        interactuar = sc.nextInt();
        if(interactuar == 1){
            System.out.print("El gorila te carga");
        }else{
            System.out.print("El gorila te esta observando");
        }
    }
    
    public void comer(String comida){
        System.out.print("¿Quieres alimentar al gorila? (Le gusta comer hierbas)");
        comida = sc.nextLine();
        System.out.print("Alimentaste al gorila con: " + comida);
        if(comida.compareToIgnoreCase("hierbas") == 0 || comida.compareToIgnoreCase("plantas") == 0 || comida.compareToIgnoreCase("pasto") == 0){
            System.out.print("El gorila si se come la comida");
        }else{
            System.out.print("El gorila no se come la comida");
        }
    }
    
    public void atacar(){
        int molestar = 0;
        System.out.print("¿Quieres molestar al gorila? (Si = 1; No = 0)");
        molestar = sc.nextInt();
        if(molestar == 1){
            System.out.print("El gorila te ataco");
        }else{
            System.out.print("El gorila te esta observando");
        }
    
    } 
    
    public void reproducirse(String nombregorila){
        int reproduccion = 0;
        System.out.print("¿Quieres reproducir al gorila con algun gorila cerca? (Si = 1; No = 0)");
        reproduccion = sc.nextInt();
        if(reproduccion == 0){
            System.out.print("El gorila no se logro reproducir");
        }else{
        System.out.print("Escribe el nombre del gorila con quien quieres que se reproduzca (Disponible: Gaika)");
        sc.nextLine();
        nombregorila = sc.nextLine();
        System.out.print("El gorila se va a reproducir con: " + nombregorila);
        if(nombregorila.compareToIgnoreCase("gaika") == 0){
            System.out.print("El gorila logro reproducirse con: " + nombregorila);
        }else{
            System.out.print("El gorila no se logro reproducir");
            }
        }    
    }
    
    //Getters and Setters
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public float getFuerzakg() {
        return fuerzakg;
    }

    public void setFuerzakg(float fuerzakg) {
        this.fuerzakg = fuerzakg;
    }

    public int getNumBrazos() {
        return numBrazos;
    }

    public void setNumBrazos(int numBrazos) {
        this.numBrazos = numBrazos;
    }

    public boolean isAlfa() {
        return alfa;
    }

    public void setAlfa(boolean alfa) {
        this.alfa = alfa;
    }

    public boolean isMelena() {
        return melena;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }
   
}
