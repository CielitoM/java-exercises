package ambito;

/**
 *
 * @author Cielito
 */
public class Los_Tres_Ambitos {
    /**
     *
     * Ejemplo donde aparecen los tres tipos de ámbito 
     */
    static int variableEstatica;
    
    int variableGlobal;
    
    void miMetodo(int parametro){
        int variableLocal = 0;
        //El parametro tambien es local dentro del metodo.
    }
}
