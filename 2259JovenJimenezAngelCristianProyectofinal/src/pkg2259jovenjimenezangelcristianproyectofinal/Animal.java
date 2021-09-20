package pkg2259jovenjimenezangelcristianproyectofinal;

public class Animal {
    
    /*En esta clase se escribe lo necesario (atributos y metodos, 
    constructores, getters & setters), 
    para lograr el funcionamiento de las clases hijas (ya que se hereda)
    */ 
    
    //Atributos (caracteristicas)
    
    private float alturaM;
    private float pesoKg;
    private int numPatas;
    private String colorDominante;
    boolean sexo;
    
    //Constructores
    
    public Animal() {
        alturaM = 0.01f;
        pesoKg = 0.01f;
        numPatas = 0;
        colorDominante = "Rosa clarito";
        sexo = true;
       }
    
    //Constructor sobrecargado
    
    public Animal (float altura, float peso, int numPatas, String color, boolean sexo){
        this.alturaM = altura;
        this.pesoKg = peso;
        this.numPatas = numPatas;
        this.colorDominante = color;
        this.sexo = sexo;
    }
          
    //Metodos (acciones)
    
    public void dormir(){
        System.out.println("El animal duerme zzz");
    }
    
    public void comer(String comida){
        System.out.println("El animal come: " + comida);
    }
    
    public void reproducirse(Animal pareja){
        if(sexo != pareja.getSexo()){
            System.out.println("Reproduciendose...");
        }else{
            System.out.println("No se dio la reproduccion");
        }
    }
    
    //Getters and Setters

    public float getAlturaM() {
        return alturaM;
    }

    public void setAlturaM(float alturaM) {
        if(alturaM >0 && alturaM <= 10){
            this.alturaM = alturaM;
        }else{
            System.out.println("Altura no valida");
        }
        
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getColorDominante() {
        return colorDominante;
    }

    public void setColorDominante(String colorDominante) {
        this.colorDominante = colorDominante;
    }

    public boolean getSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
        
}
