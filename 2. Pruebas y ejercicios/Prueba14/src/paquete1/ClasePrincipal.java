package paquete1;

/**
 *
 * @author Cielito
 */
public class ClasePrincipal {
    public static void main(String[] args){
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
    }
}
