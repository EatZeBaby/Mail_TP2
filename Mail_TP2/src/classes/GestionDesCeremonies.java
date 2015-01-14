/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author Guimove
 */
public class GestionDesCeremonies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	
    	
    	try {
			@SuppressWarnings("deprecation")
			Ceremonie Cannes = new Ceremonie("Festival de Cannes", "Cannes", new Date(2015, 05, 19),new Date(2015, 05, 26));
			System.out.println(Cannes.getNomCeremonie());
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
      
    }
    
}
