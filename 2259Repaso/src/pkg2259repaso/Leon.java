package pkg2259repaso;

public class Leon extends Animal {
    
    //Atributos
    private int numGarrasPata;
    private boolean melena;
    private float alfa; //Solo por utilizar float como atributo
                        //0.0 No es el alfa pero si tiene lider
                        //-1.0 No es el alfa, no tiene lider
                        //1.0 es el Alfa
    
    //Constructores
    public Leon(){
        super(0.5f, 11.3f, 4, "Amarillo", true);
        this.numGarrasPata = 4;
        this.melena = false;
        this.alfa = -1.0f;
    }
    
    public Leon(int numGarraspPata, boolean tieneMelena, float esAlfa,
            float alturaM, float pesoKg,int numPatas, String colorDominante,
            boolean sexo){
        super(alturaM, pesoKg, numPatas, colorDominante, sexo);
        this.numGarrasPata = numGarraspPata;
        this.melena = tieneMelena;
        this.alfa = esAlfa;
        
    }
    
    //Metodos
    public void rugir(){
        System.out.print("El animal duerme zzz");
    } 
    
    public void atacar(){
        System.out.print("ataca como leon");
    } 
    
    //Especializar metodos del padre en el hijo
    public void dormir(){
        System.out.print("El leon duerme como leon");
    }
    
    public void comer(String comida){
        System.out.print("Alimentaste al leon con: " + comida);
        if(comida.compareToIgnoreCase("carne") == 0){
            System.out.print("El leon si se come la comida");
        }else{
            System.out.print("El leon se come al cuidador");
        }
    }
    
    //Getters & setters
    
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

    public float getAlfa() {
        return alfa;
    }

    public void setAlfa(float alfa) {
        this.alfa = alfa;
    }
    
    //Funciones extras
 
    
}
