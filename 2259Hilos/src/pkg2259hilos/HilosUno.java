package pkg2259hilos;

public class HilosUno extends Thread{
    
    public int numIteracion;
    
    
    public HilosUno(){
        super("Hilo generico");
        this.setName("Hilo generico");
        numIteracion = 3;
    }

    public HilosUno(String nombre) {
        super(nombre);
        numIteracion = 5;
    }
    
    public HilosUno(String nombre, int numIteraciones){
        super(nombre);
        this.numIteracion = numIteraciones;
    }
    
    @Override
    public void run() {
       for (int i = 0; i < numIteracion; i++){
            System.out.println("for extends " + this.getName() +  ", iteracion: " + i);
        }  
    }
    
}
