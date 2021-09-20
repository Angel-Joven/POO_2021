package pkg2259sueldos;

public class Main {

    public static void main(String[] args) {
        Contador conta = new Contador();
        
        System.out.println(conta.calcularSueldo("Juan", 1, 0));
        System.out.println(conta.calcularSueldo("Pablo", 1, 1));
        System.out.println(conta.calcularSueldo("Ana", 1, 2));
        System.out.println(conta.calcularSueldo("Carlos", 2, 0));
        System.out.println(conta.calcularSueldo("Brenda", 2, 1));
        System.out.println(conta.calcularSueldo("Daniel", 2, 2));
        

    }
    
}
