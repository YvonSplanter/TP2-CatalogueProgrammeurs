
package com.TP2.Entites;

import java.util.ArrayList;

/**
 *
 * @author Moumene
 */
public class Programmeur implements Comparable<Programmeur> {
    private String courriel, nom;
    private ArrayList<String> langages = new ArrayList<>();

    public Programmeur() {
    }

    public Programmeur(String courriel, String nom,String s) {
        this.courriel = courriel;
        this.nom = nom;
        setLangages(s);
    }
    

    public Programmeur(String s) {
        this.courriel = "";
        this.nom = "";
        setLangages(s);
    }
    
    
    
    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setLangages(String s){
        String[] lgs = s.split(",");
        for (String l : lgs) {
            this.ajouterLangage(l);
        }
    }
    
    public String getLangages(){
        String strLangages="";
        for(String langue : this.langages){
            strLangages+=langue;
            strLangages+=",";
        }
        strLangages= strLangages.substring(0,strLangages.length()-1);
        strLangages.trim();
        return strLangages;
    }
    
    public boolean maitrise(String langage){
        return (langages.contains(langage.toUpperCase()));
        /*OU:
        if (langages.contains(langage))
            return true;
        return false;
        */
    }
    public boolean ajouterLangage(String langage){
        if (langages.contains(langage.trim().toUpperCase())) //le programmeur maitrise déjà ce langage
            return false;
        langages.add(langage.trim().toUpperCase());
        return true;
    }

    @Override
    public int compareTo(Programmeur t) {
        return this.courriel.compareToIgnoreCase(t.courriel);
    }

    @Override
    public String toString() {
        return "Nom: "+nom+" Courriel: "+courriel + ", langages : " + langages;
    }
}