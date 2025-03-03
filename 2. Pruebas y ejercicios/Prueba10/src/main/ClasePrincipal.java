package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

/**
 *
 * @author Cielito
 */
public class ClasePrincipal {
    public static void main(String args[]){
        ClaseHija_Suma mensajero1 = new ClaseHija_Suma();
        mensajero1.PedirDatos();
        mensajero1.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajero1.MostrarResultado();
        
        ClaseHija_Resta mensajero2 = new ClaseHija_Resta();
        mensajero2.PedirDatos();
        mensajero2.Restar();
        System.out.print("El resultado de la resta es: ");
        mensajero2.MostrarResultado();
    }
}
