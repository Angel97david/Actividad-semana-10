/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;


/**
 *
 * @author DELL
 */
public class Felinos extends Caracteristicas{
    private String toxoplasmosis;

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    public Felinos() {
    }

    public Felinos( String nombre, String raza, String color, String edad,String toxoplasmosis) {
        super(nombre, raza, color, edad);
        this.toxoplasmosis=toxoplasmosis;
    }
    

    
    
}
