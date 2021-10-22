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
public class Refugio  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Adopcion adop = new Adopcion();
         Controller contro = new Controller(adop);
         contro.iniciar();
         adop.setVisible(true);  
       
         
    } 
}

