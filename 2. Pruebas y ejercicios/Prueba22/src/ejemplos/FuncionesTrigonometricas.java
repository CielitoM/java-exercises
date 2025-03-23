package ejemplos;

/**
 *
 * @author Cielito
 */
public class FuncionesTrigonometricas {
    public static void main(String[] args){
        
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        //La clase math solamente acepta y devuelve valores en radianes
        
        //Funcion Seno
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + " = " + resultado);
        
        //Funcion cos
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de " + anguloEnGrados + " = " + resultado);
        
        //Funcion tan
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de " + anguloEnGrados + " = " + resultado);
        
        double valorIngresado = 0.707;
        
        //Funcion arcsin
        anguloEnRadianes = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco seno de : " + valorIngresado + " = " + anguloEnGrados + "°");
        
        //Funcion arccos
        anguloEnRadianes = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco coseno de : " + valorIngresado + " = " + anguloEnGrados + "°");
        
        //Funcion arctan
        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de : " + valorIngresado + " = " + anguloEnGrados + "°");
        
        
    }
}
