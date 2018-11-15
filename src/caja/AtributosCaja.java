/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caja;


public class AtributosCaja {

    int an, al, pro;
    

    
    public AtributosCaja(int ancho,  int alto, int profundidad) {
    this.an=ancho;
    this.al=alto;
    this.pro=profundidad;
    }
    
    int CalcularVolumen(){
        return an*al*pro;
    }
    
     int CalcularVolumen(int ancho,  int alto, int profundidad){
        return an*al*pro;
    }
    
}
