package polimorfismo;

/**
 *
 * @author Cielito
 */
public class Resta_ClaseHija extends Operaciones_ClasePadre{
    
    //Sobreescribir el metodo
    @Override
    public void Operaciones(){
        resultado = valor1 - valor2;
    }
}
