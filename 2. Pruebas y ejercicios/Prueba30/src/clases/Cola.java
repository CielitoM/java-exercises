package clases;

/**
 *
 * @author Cielito
 */
public class Cola {
    private Nodo inicioCola;
    private Nodo finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Metodo para saber si la cola está vacía
    public boolean ColaVacia(){
        if(inicioCola == null){
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para insertar a la cola
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    //Metodo para extraer de la cola
    public int Extraer(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    //Metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        
    }
}
