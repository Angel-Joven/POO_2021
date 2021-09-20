package pkg2259jovenjimenezangelcristianproyectofinal;

import java.util.Scanner;

public class Jirafa extends Animal {
    
    Scanner sc = new Scanner(System.in);
    
    /*En esta clase se escribe lo necesario (atributos y metodos, 
    constructores, getters & setters), 
    para lograr el funcionamiento de la clase Jirafa
    */ 
    
     //Atributos (La 'm' significa Metros)
    private float longitudCuellom;
    private float longitudPiernasm;
    private boolean melena;
    
    //Constructores
    public Jirafa(){
        super(4.0f, 1600.0f, 4, "Amarillo", false); //AlturaM, PesoKg, numPatas, colorDominante, sexo(reproducir)
        this.longitudCuellom = 2.0f;
        this.longitudPiernasm = 1.5f;
        this.melena = true;
            
    }
    
    //Constructor Sobrecargado
    public Jirafa(float longitudCuellom, float longitudPiernasm, boolean melena, float altura, float peso, int numPatas, String color, boolean sexo) {
        super(altura, peso, numPatas, color, sexo);
        this.longitudCuellom = longitudCuellom;
        this.longitudPiernasm = longitudPiernasm;
        this.melena = melena;
    }
    
    //Metodos
    public void observar(){
        System.out.println("La jirafa esta caminando");
    }
    
    public void comer(String comida){
        System.out.print("¿Quieres alimentar a la jirafa? (Le gusta comer hierbas)");
        comida = sc.nextLine();
        System.out.print("Alimentaste a la jirafa con: " + comida);
        if(comida.compareToIgnoreCase("hierbas") == 0 || comida.compareToIgnoreCase("plantas") == 0 || comida.compareToIgnoreCase("pasto") == 0){
            System.out.print("La jirafa si se come la comida");
        }else{
            System.out.print("La jirafa no se come la comida");
        }
    }
    
    public void reproducirse(String nombrejirafa){
        int reproduccion = 0;
        System.out.print("¿Quieres reproducir a la jirafa con alguna jirafa cerca? (Si = 1; No = 0)");
        reproduccion = sc.nextInt();
        if(reproduccion == 0){
            System.out.print("La jirafa no se logro reproducir");
        }else{
        System.out.print("Escribe el nombre de la jirafa con quien quieres que se reproduzca (Disponible: Zulai)");
        sc.nextLine();
        nombrejirafa = sc.nextLine();
        System.out.print("La jirafa se va a reproducir con: " + nombrejirafa);
        if(nombrejirafa.compareToIgnoreCase("zulai") == 0){
            System.out.print("La jirafa se logro reproducirse con: " + nombrejirafa);
        }else{
            System.out.print("La jirafa no se logro reproducir");
            }
        }
    } 
    
    public void atacar(){
        int molestar = 0;
        System.out.print("¿Quieres molestar a la jirafa? (Si = 1; No = 0)");
        molestar = sc.nextInt();
        if(molestar == 1){
            System.out.print("La jirafa te pateo");
        }else{
            System.out.print("La jirafa te esta observando");
        }
    }
    
    //Getters and Setters
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public float getLongitudCuellom() {
        return longitudCuellom;
    }

    public void setLongitudCuellom(float longitudCuellom) {
        this.longitudCuellom = longitudCuellom;
    }

    public float getLongitudPiernasm() {
        return longitudPiernasm;
    }

    public void setLongitudPiernasm(float longitudPiernasm) {
        this.longitudPiernasm = longitudPiernasm;
    }

    public boolean isMelena() {
        return melena;
    }

    public void setMelena(boolean melena) {
        this.melena = melena;
    }
    
    
}
