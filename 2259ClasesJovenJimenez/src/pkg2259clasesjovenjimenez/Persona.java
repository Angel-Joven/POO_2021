package pkg2259clasesjovenjimenez;

public class Persona {
  
    //Atributos
    private float estaturaM;
    private int edad;
    private String sexo;
    private String nacionalidad;
    private String nombre;
    
    //Constructores
    
    //Constructor por default
    public Persona(){ 
     this.estaturaM = 1.68f;
     this.edad = 30;
     //......
     this.sexo = "Hombre";
     this.nacionalidad = "Mexico";
     this.nombre = "Angel";
        
    }
    
    public Persona(float estaturaM, int edad){
        this.estaturaM = estaturaM;
        this.edad = edad;
    }
    
    //Constructor sobrecargado con todos los atributos
    public Persona(float estaturaM, int edad,
            String sexo, String nacionalidad,
            String nombre){
        this.estaturaM = estaturaM;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        
    }
    
    //Metodos
    
    public String comer(){
        return "Comiendo como persona";
    }
    
    public void dormir(){
        System.out.println("Durmiendo como persona");
    }
    
    public void morir(){
        System.out.println("La persona se murio :(");
    }
    
    //gets and sets
    
    public float getEstaturaM(){
        return this.estaturaM;
    }
    
    public void setEstaturaM(float estaturaM){
        this.estaturaM = estaturaM;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Funciones especiales
    
}
