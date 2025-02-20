package suma;

/**
 *
 * @author Cielito
 */
public class Suma {
    private int vUno, vDos, resultado;
    
    //Constructor      
    public Suma(int valorUno, int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    public void Operacion(){
    resultado = vUno + vDos;    
    
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: " + resultado);
            
    }
}
