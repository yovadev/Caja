/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caja;


public class Caja {


    public static void main(String[] args) {
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        AtributosCaja proceso = new AtributosCaja(ancho, alto, profundo);
        System.out.println("El resultado es: "+proceso.CalcularVolumen());
        
        System.out.println("El resultado es: "+proceso.CalcularVolumen(ancho, alto, profundo));
    }

}
