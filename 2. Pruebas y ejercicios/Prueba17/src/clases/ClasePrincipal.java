package clases;

/**
 *
 * @author Cielito
 */
public class ClasePrincipal {
    public static void main(String[] args){
        Proceso hilo1 = new Proceso();
        Proceso hilo2 = new Proceso();
        
        //pasar los paramtros
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        
        hilo1.start();
        hilo2.start();
    }
}
