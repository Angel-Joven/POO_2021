
package pkg2259sueldos;

public class Contador {
    
    //Atributos
    private int anhos;
    private int puesto;//gerente = 0, vendedor = 1 y asistente = 2
    private float sueldo;
    
    //Constructor
    public Contador() {
        String mensaje;
    }
    
    public Contador(int años, int puesto, float sueldo) {
        this.anhos = anhos;
        this.puesto = puesto;
        this.sueldo = sueldo;
        
    }
    
    //Funciones
    public String calcularSueldo(String nombre, int anhos, int puesto){
        
        String mensaje;

        //Validacion de sueldo;
        if(anhos >= 0 && anhos <=90){
            
            
                if(puesto >= 0 && puesto <= 2){
                    //Calculo del sueldo pendiente (tabla)
                    //sueldo = ;
                    sueldo = 1000 * anhos + (1000 * puesto);
                    mensaje = "Hola " + nombre + ", tu sueldo de esta quincena es de: " + sueldo;
                
                }else{
                    mensaje = "Error en el puesto, por favor ingrese bien los datos";
                }

            }else{
                mensaje = "Error en la antigüedad, por favor ingrese bien los datos";
                }
        
        return mensaje;
    }
}
