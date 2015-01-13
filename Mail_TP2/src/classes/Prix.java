/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Guimove
 */
public class Prix {
    
    // Attributs
    
    
    private String nomPrix;
    private List<Acteur> listeVainqueursPrix;
    
   


    
    
    // Constructeur
    
    public Prix(String nomPrix) {
        this.nomPrix = nomPrix;
        this.listeVainqueursPrix = new ArrayList<Acteur>();
    }

    
    // Getter Setter
    
    public String getNomPrix() {
        return nomPrix;
    }

    public void setNomPrix(String nomPrix) {
        this.nomPrix = nomPrix;
    }

    public List<Acteur> getListeVainqueursPrix() {
        return listeVainqueursPrix;
    }

    public void setListeVainqueursPrix(List<Acteur> listeVainqueursPrix) {
        this.listeVainqueursPrix = listeVainqueursPrix;
    }
    
    
    
    // Méthode pour attributer un prix
    
    public void AttribuerPrix(Acteur unActeurGagnant)
    {
        // On vérifie que le prix n'est pas déjà attribué
        try
        {
            for  (Acteur unActeur : listeVainqueursPrix)
            {
                // On vérifie que l'acteur n'a pas remporté le prix
                if (unActeur.getNomActeur().equals(unActeurGagnant.getNomActeur()))
                {
                    System.out.println("Cet acteur a déjà gagné le prix");
                    throw new Exception();
                }   
            }
            listeVainqueursPrix.add(unActeurGagnant);
        }
        catch (Exception Ex)
        {
            Ex.getMessage();
        }
        
 
       
    }
    
    
    
}
