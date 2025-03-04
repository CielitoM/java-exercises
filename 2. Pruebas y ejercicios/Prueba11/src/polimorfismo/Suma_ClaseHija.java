package polimorfismo;

/**
 *
 * @author Cielito
 */
public class Suma_ClaseHija extends Operaciones_ClasePadre{
    
    //Sobre escribir el metodo
    @Override
    public void Operaciones(){
        resultado = valor1 + valor2;
    }
}
