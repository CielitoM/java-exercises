/*
 Samsung solicita el desarrollo de una clase programada en Java, para el 
funcionamiento lógico de su nueva línea de lavadoras, misma que puedan implementar
sus programadores de manera sencilla en los programas desarrollados dentro de Samsung,
con las siguientes características:
    1. Debe recibir kilos de ropa y tipo de ropa a través de argumentos.
    2. Debe de realiar las funciones de llenado de agua, lavado y secado.
    3. La clase debe estar correctamente encapsulada, para evitar que los programadores
    de samsung utilicen métodos o variables que no son necesarios.
    4. El único método disponible para importar, debe ser CicloFinalizado()
 */

/**
 *
 * @author Cielito
 */
public class Lavadora {
    private int kilos = 0, llenadoCompleto = 0, tipo = 0, lavadoCompleto=0, SecadoCompleto=0;
    
    
    public Lavadora(int kilos, int tipo){
    this.kilos = kilos;
    this.tipo = tipo;
    }
    
    private void LlenadoDeAgua(){
        System.out.print("Se está haciendo el proceso: llenado de agua.");
    }
    
    private void Lavado(){
        System.out.print("Se está haciendo el proceso: lavado.");
    }
    
    private void Secado(){
        System.out.print("Se está haciendo el proceso: secado.");
    }
    
    public void CicloFinalizado(){
        System.out.print("Se ha finalizado el ciclo.");
    }
    
}
