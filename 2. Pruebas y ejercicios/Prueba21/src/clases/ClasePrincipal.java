package clases;

/**
 *
 * @author Cielito
 */
public class ClasePrincipal {
    public static void main(String[] args){
        
        SinConstructor mensajero1 = new SinConstructor();
        mensajero1.PedirNombre();
        mensajero1.Imprimir();
        
        ConConstructor mensajero2 = new ConConstructor();
        
    }
}
