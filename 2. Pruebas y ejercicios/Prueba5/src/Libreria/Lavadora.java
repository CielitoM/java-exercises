package Libreria;

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
    
    private void Llenado(){ //este metodo procesa el llenado de la lavadora
        if(kilos <=12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }
    
    private void Lavado(){ //este metodo sirve para lavar
        Llenado();
        if(llenadoCompleto == 1){
            if(tipo == 1){
                System.out.println("Ropa blanca / lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else if (tipo == 2){
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ripa de color/Lavado intenso");
                lavadoCompleto = 1;
            }
            
        }
    }
    
    private void Secado(){ //Este metodo realiza el secado.
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando...");
            SecadoCompleto = 1;
        }
    }
    
    public void CicloFinalizado(){ //Se ha finalizado el ciclo
        Secado();
        if(SecadoCompleto == 1) {
            System.out.println("Se ha finalizado el ciclo.");
        }
    }
    
    //Setter y Getter

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
