package clases;

/**
 *
 * @author Cielito
 */
public class Recursividad {
    public void Imprimir(int x){
        if(x<=5){
            System.out.println(x + " ");
            Imprimir(x+1);
        }
    }
}
