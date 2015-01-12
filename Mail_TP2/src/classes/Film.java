/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Guimove
 */

import java.util.List;
import java.util.ArrayList;


public class Film {
    
    
     // instance variables - replace the example below with your own
    private String nomFilm;
    private int budgetFilm;
    private List<Acteur> listeActeurs;

    /**
     * Constructor for objects of class Film
     */
    public Film()
    {
       this.nomFilm = "Mommy";
       this.budgetFilm = 4900000;
       this.listeActeurs = new ArrayList<Acteur>();
    }

   
    public void testFixture()
    {
        System.out.println("Je suis une méthode");
    }
    
    // Getter
    public String getNomFilm()
    {
        return this.nomFilm;
    }
    
    public int getBudgetFilm()
    {
        return this.budgetFilm;
    }
    
   public List getListeActeurs()
    {
        return this.listeActeurs;
    }
    
    // Méthode retournant les informations générales du film
    public void infoFilms()
    {
        System.out.println("Titre : " + this.nomFilm + " Budget : " + this.budgetFilm);
    }
    
}
