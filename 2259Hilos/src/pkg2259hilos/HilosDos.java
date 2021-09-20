package pkg2259hilos;

public class HilosDos implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("for implements, iteracion: " + i);
        }  
    }
    
}
