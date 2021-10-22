/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import view.Adopcion;
/**
 *
 * @author DELL
 */
public class Controller implements ActionListener  {
    
    private  Adopcion adopcion;
    private String matriz [][]= new String [0][5];
    private double promedio=0;
    private int suma=0;
    private int numeroMasco=0;
     
    ArrayList<Caninos> perro= new ArrayList<>();
     ArrayList<Felinos> gatos= new ArrayList<>();
    public Controller(){
        
    }
    public Controller(int suma){
        this.suma=suma;
    }
    public Adopcion getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(Adopcion adopcion) {
        this.adopcion = adopcion;
    }

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
    public String[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    } 
    public Controller(Adopcion adopcion){
       this.adopcion=adopcion;
       this.adopcion.btnAgregCan.addActionListener(this);
       this.adopcion.btnAgregarFel.addActionListener(this);
       this.adopcion.btnElimCan.addActionListener(this);
       this.adopcion.btnElimsulFel.addActionListener(this);
    }
    public void  iniciar (){
        adopcion.setTitle("Adopcion");
        adopcion.setLocationRelativeTo(null);
    }   
    @Override
    public void actionPerformed( ActionEvent evento )
    {     
        if(evento.getSource() .equals( adopcion.btnAgregCan ))
        {
                perro.add(new Caninos(adopcion.txtNomCan.getText(),adopcion.txtRazaCan.getText(),adopcion.txtColorCan.getText(),
                adopcion.txtEdadCan.getText(), adopcion.txtNivelCan.getText() ));
                llenaCan();
                //adopcion.tabla();
                numeroMasco++;
                suma+=Integer.parseInt(adopcion.txtEdadCan.getText());
                promedio=suma/numeroMasco; 
                System.out.println("El promedio de edad de los caninos es igual a   "+promedio);
                System.out.println("El numero de mascotas  "+numeroMasco); 
                System.out.println("");
                
               adopcion.txtCantiCan.setText(Integer.toString(numeroMasco));
              adopcion.txtPromedioEdadCan.setText(Integer.toString(suma/numeroMasco));
                
        }
        
        if(evento.getSource() .equals(adopcion.btnElimCan) ){
             perro.size();
             boolean existe = perro.contains(adopcion.txtNomCan);
             boolean existe1 = perro.contains(adopcion.txtRazaCan);
            if (existe && existe1) {   
                 for (int i = 0; i < perro.size() ;i++) {
                      matriz[i][0]=perro.get(i).getNombre();
                      matriz[i][1]=perro.get(i).getRaza();
                      matriz[i][2]=perro.get(i).getColor();
                      matriz[i][3]=perro.get(i).getEdad();
                      matriz[i][4]=perro.get(i).getNivelEntre();   
                      perro.remove(matriz[i][perro.size()]);
                      
                   }
           
            }  
            numeroMasco--;
             adopcion.txtCantiCan.setText(Integer.toString(numeroMasco));
             adopcion.txtPromedioEdadCan.setText(Integer.toString(suma/numeroMasco));
        }
        //Agrega el perro por medio del arraysList con constructor sobrecargado.
           if(evento.getSource().equals( adopcion.btnAgregarFel) ){ 
               
                    gatos.add(new Felinos(adopcion.txtNombreFel.getText(),adopcion.txtRazaFel.getText(),
                    adopcion.txtColorFel.getText(),adopcion.txtEdadFel.getText(),adopcion.txtLibreFel.getText()));
     
                llenaFel();
                 numeroMasco++;
                 suma+=Integer.parseInt(adopcion.txtEdadFel.getText());
                 promedio=suma/numeroMasco; 
                 System.out.println("El promedio de edad de los caninos es igual a   "+promedio);
                 System.out.println("El numero de mascotas  "+numeroMasco);
                
             adopcion.txtCantFel.setText(Integer.toString(numeroMasco));
             adopcion.txtPromeFel.setText(Integer.toString(suma/numeroMasco));
           }    
           if(evento.getSource().equals( adopcion.btnElimsulFel) ){
               gatos.size();
             boolean existe = gatos.contains(adopcion.txtNomCan);
             boolean existe1 = gatos.contains(adopcion.txtRazaCan);
                 if (existe && existe1) {   
                      for (int i = 0; i < gatos.size() ;i++) {
                         matriz[i][0]=gatos.get(i).getNombre();
                         matriz[i][1]=gatos.get(i).getRaza();
                         matriz[i][2]=gatos.get(i).getColor();
                         matriz[i][3]=gatos.get(i).getEdad();
                         matriz[i][4]=gatos.get(i).getToxoplasmosis();   
                        gatos.remove(matriz[i][gatos.size()]);
                       }
                   }  
                numeroMasco--;
                adopcion.txtCantFel.setText(Integer.toString(numeroMasco));
                adopcion.txtPromeFel.setText(Integer.toString(suma/numeroMasco));
           } 
}
    public void llenaCan(){
        
        matriz = new String [perro.size()][5];
        for (int i = 0; i < perro.size() ;i++) {
            matriz[i][0]=perro.get(i).getNombre();
            matriz[i][1]=perro.get(i).getRaza();
            matriz[i][2]=perro.get(i).getColor();
            matriz[i][3]=perro.get(i).getEdad();
            matriz[i][4]=perro.get(i).getNivelEntre();   
        }
    }
    public void llenaFel(){
        
        matriz = new String [perro.size()][5];
        for (int i = 0; i < perro.size() ;i++) {
            matriz[i][0]=perro.get(i).getNombre();
            matriz[i][1]=perro.get(i).getRaza();
            matriz[i][2]=perro.get(i).getColor();
            matriz[i][3]=perro.get(i).getEdad();
            matriz[i][4]=perro.get(i).getNivelEntre();   
        }
    }
}