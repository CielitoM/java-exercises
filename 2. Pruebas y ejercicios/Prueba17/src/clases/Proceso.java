package clases;

/**
 *
 * @author Cielito
 */
public class Proceso extends Thread{
    
    int num_int;
    
    @Override
    public void run(){
        for(int i = 0; i<= num_int; i++){
            System.out.println(i);
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;
    }
}
