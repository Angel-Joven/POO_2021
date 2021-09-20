package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class Hipopotamo extends Animal {
    
    Scanner sc = new Scanner(System.in);
    
    /*En esta clase se escribe lo necesario (atributos y metodos, 
    constructores, getters & setters), 
    para lograr el funcionamiento de la clase Hipopotamo
    */ 
    
    //Atributos
    private float longitudDientescm;
    private int numeroDientes;
    private boolean melena;
    
    //Constructores
    public Hipopotamo(){
        super(1.4f, 2500.0f, 4, "Gris", false); //AlturaM, PesoKg, numPatas, colorDominante, sexo(reproducir)
        this.longitudDientescm = 2.0f;
        this.numeroDientes = 45;
        this.melena = false;
    }

    //Constructor Sobrecargado
    public Hipopotamo(float longitudDientescm, int numeroDientes, boolean melena, float altura, float peso, int numPatas, String color, boolean sexo) {
        super(altura, peso, numPatas, color, sexo);
        this.longitudDientescm = longitudDientescm;
        this.numeroDientes = numeroDientes;
        this.melena = melena;
    }
    
    //Metodos
    public void atacar(){
        int molestar = 0;
        System.out.print("¿Quieres molestar al hipopotamo? (Si = 1; No = 0)");
        molestar = sc.nextInt();
        if(molestar == 1){
            System.out.print("El hipopotamo te mordio");
        }else{
            System.out.print("El hipopotamo te esta observando");
        }
    }
    
    public void comer(String comida){
        System.out.print("¿Quieres alimentar al hipopotamo? (Le gusta comer hierbas)");
        comida = sc.nextLine();
        System.out.print("Alimentaste al hipopotamo con: " + comida);
        if(comida.compareToIgnoreCase("hierbas") == 0 || comida.compareToIgnoreCase("plantas") == 0 || comida.compareToIgnoreCase("pasto") == 0){
            System.out.print("El hipopotamo si se come la comida");
        }else{
            System.out.print("El hipopotamo no se come la comida");
        }
    }
    
    public void nadar(){
        System.out.print("El hipopotamo esta nadando");
    }
    
    public void reproducirse(String nombrehipopotamo){
        int reproduccion = 0;
        System.out.print("¿Quieres reproducir al hipopotamo con algun hipopotamo cerca? (Si = 1; No = 0)");
        reproduccion = sc.nextInt();
        if(reproduccion == 0){
            System.out.print("El hipopotamo no se logro reproducir");
        }else{
        System.out.print("Escribe el nombre del hipopotamo con quien quieres que se reproduzca (Disponible: Gloria)");
        sc.nextLine();
        nombrehipopotamo = sc.nextLine();
        System.out.print("El hipopotamo se va a reproducir con: " + nombrehipopotamo);
        if(nombrehipopotamo.compareToIgnoreCase("gloria") == 0){
            System.out.print("El hipopotamo logro reproducirse con: " + nombrehipopotamo);
        }else{
            System.out.print("El hipopotamo no se logro reproducir");
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

    public float getLongitudDientescm() {
        return longitudDientescm;
    }

    public void setLongitudDientescm(float longitudDientescm) {
        this.longitudDientescm = longitudDientescm;
    }

    public int getNumeroDientes() {
        return numeroDientes;
    }

    public void setNumeroDientes(int numeroDientes) {
        this.numeroDientes = numeroDientes;
    }

    public boolean isMelena() {
        return melena;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }
    
}
