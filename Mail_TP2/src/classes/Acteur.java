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
import java.util.Scanner;


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
    
    // Méthode pour participer à une cérémonie
    public void demanderInvitation(Ceremonie uneCeremonie)
    {
        // Si LVT veut participer au festival de Cannes, il n'est pas ajouté
        if ("Von Trier".equals(this.nomActeur) && "Lars".equals(this.prenomActeur) && "Festival de Cannes".equals(uneCeremonie.getNomCeremonie()))
        {
            System.out.println("Vous êtes personna non grata au Festival de Cannes");
        }
        else
        {
            // On demande d'accepter la demande
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez accepter la demande en tapant oui");
            String str = sc.nextLine();
            
            // Si l'invitation est accordée, on ajoute la personne
            if (str.equals("oui"))
            {
                uneCeremonie.getListeActeursPresents().add(this);
            }
            // Sinon on l'informe
            else
            {
                System.out.println("Vous n'êtes pas invité à" + uneCeremonie.getNomCeremonie());
            }
        }
    }
    
}
