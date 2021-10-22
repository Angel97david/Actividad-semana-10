/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import view.Adopcion;

/**
 *
 * @author DELL
 */
public class Caninos extends Caracteristicas{
    private String nivelEntre;
    private  Adopcion adopcion;
    
    public String getNivelEntre() {
        return nivelEntre;
    }

    public void setNivelEntre(String nivelEntre) {
        this.nivelEntre = nivelEntre;
    }
    public Caninos(){
      
    }
    public Caninos( String nombre, String raza, String color, String edad,String nivelEntre ) {
        super(nombre, raza, color, edad);  
        this.nivelEntre=nivelEntre;
    }
   
}
