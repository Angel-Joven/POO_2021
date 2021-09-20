package pkg2259interfaz;

public class Coche implements Motor,Rueda{

    public boolean estadoCoche;
    
    public Coche (){
        estadoCoche = false;
    }
    
    @Override
    public void prender() {
        System.out.println("El coche ya prendio");
        estadoCoche = true;
    }

    
    @Override
    public void acelerar(float velocidad) {
        if(estadoCoche){
            System.out.println("El coche acelera a: "+ Math.abs(velocidad) + "KM/h");
            rodar(velocidad);
        }else{
            System.out.println("Primero prende el coche");
        }
    }

    
    @Override
    public void apagar() {
        System.out.println("El coche se apago");
        estadoCoche = false;
    }

    @Override
    public void rodar(float direccion) {
        if(direccion < 0){
            System.out.println("Ruedas girando hacia atras");
        }else if(direccion > 0){
            System.out.println("Ruedas girando hacia adelante");
        }else if(direccion == 0){
            System.out.println("Ruedas quietas");
        }
    }
    
}
