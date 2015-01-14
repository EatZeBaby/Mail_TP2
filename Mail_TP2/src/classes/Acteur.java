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


public class Acteur {
    
    private String prenomActeur;
    private String nomActeur;
    private ArrayList<Film> listeFilms;

    /**
     * Constructor for objects of class Acteur
     */
    public Acteur()
    {
      this.prenomActeur = "Anne";
      this.nomActeur = "Dorval";
      this.listeFilms = new ArrayList<Film>();
    }
    public Acteur(String nom,String prenom)
    {
      this.prenomActeur = prenom;
      this.nomActeur = nom;
      this.listeFilms = new ArrayList<Film>();
    }
  
     // Getter
    public String getNomActeur()
    {
        return this.nomActeur;
    }
    
    
    public String getPrenomActeur()
    {
        return this.prenomActeur;
    }
    
    
    public List getListeFilms()
    {
        return this.listeFilms;
    }
    
    // Méthode pour ajouter un film à la liste de films
    public void ajouterFilm(Film unFilm)
    {
     
       this.listeFilms.add(unFilm);
       
       // On s'assure de la symétrie des objets
       unFilm.getListeActeurs().add(this);
       System.out.println("Le film a été ajouté");
       System.out.println("Liste des films :");
       
       // On affiche tous les films de l'acteur 
       for  (Film leFilm : this.listeFilms)
       {
           leFilm.infoFilms();
       }
    }
    
}
