/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Atributos_Metodos;

/**
 *
 * @author Cielito
 */
public class ClaseJavaDOs {
    public static void main(String[] args){
         Atributos_Metodos mensajero = new Atributos_Metodos();
         //No se puede acceder a ningun metodo, a no ser que se usen los metodos getter y setter
         mensajero.setValorUno(2);
         System.out.println(mensajero.getValorUno());
    }
}