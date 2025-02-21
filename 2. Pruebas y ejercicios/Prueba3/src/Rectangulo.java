/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cielito
 */
public class Rectangulo {
    private int base, altura, area;
    
    public Rectangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
    }
    
    public void CalculoArea(){
        area = base * altura;
    }
    
    public void Imprimir(){
        CalculoArea();
        System.out.println("El area es: " + area);
    }
    
}
