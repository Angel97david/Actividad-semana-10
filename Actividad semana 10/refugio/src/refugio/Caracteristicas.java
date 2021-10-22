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
public class Caracteristicas {
    private String nombre="";
    private String raza="";
    private String color="";
    private String edad="";
    private double promedio=0;
    private int suma=0;
    private int numeroMasco=0;

    public int getNumeroMasco() {
        return numeroMasco;
    }

    public void setNumeroMasco(int numeroMasco) {
        this.numeroMasco = numeroMasco;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getSuma() {
        return suma;
    }
    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Caracteristicas() {
    }

    public Caracteristicas(String nombre, String raza, String color, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
   
}
