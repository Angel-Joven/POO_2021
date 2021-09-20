package pkg2259hilos;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
       
        /*
        for (int i = 0; i < 10; i++){
            System.out.println("for 1, iteracion: " + i);
        } 
        
        for (int j = 0; j < 10; j++){
            System.out.println("for 2, iteracion: " + j);
        } 
        */
        
        HilosUno hilo1 = new HilosUno("Hilo 1");
        HilosUno hilo3 = new HilosUno("Hilo 3", 7);
        Thread hilo2 = new Thread(new HilosDos());
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        
    }
    
}
