
package com.TP2.services;

import com.TP2.Entites.Programmeur;
import com.TP2.dao.ProgrammeurDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class ProgrammeurService {
    
    private ProgrammeurDao dao;
    
    
    public void setDao(ProgrammeurDao dao){
        this.dao = dao;
    }
    
    public boolean addProgrammeur(Programmeur p){
        return dao.create(p);
    }
    
    public Programmeur getProgrammeur(String courriel) {
        Programmeur p = dao.findByCourriel(courriel);
        return p;
    }
    /*
    public List<Programmeur> rechercherP(String langages){
        resultats = new TreeSet<>();
        String[] t = langages.split("[,]");
        for (String langage:t) {
            langage = langage.trim().toUpperCase();
            if (catalogueProgrammeurs.containsKey(langage.trim())) {
                List<Programmeur> liste = catalogueProgrammeurs.get(langage.trim());
                /*iterateur = liste.listIterator();
                while (iterateur.hasNext()) {
                    resultats.add(iterateur.next());
                }*/ /*
                resultats.addAll(liste);
            }
        }
    } */
    
    public List<Programmeur> getProgrammeurs(){
        List<Programmeur> liste = new ArrayList<>();
        liste = dao.findAll();
        return liste;
    }  
    
    public Set<Programmeur> getProgrammeursByLangages(String langages){
        //Creation catalogue
        Map< String,List<Programmeur> > catalogueP = new HashMap<>();
        List<Programmeur> listeP = this.getProgrammeurs();
        for (Programmeur p : listeP){
            String[] lgs = p.getLangages().split(",");
            for (String l : lgs){
                l=l.trim().toUpperCase();
                if(!catalogueP.containsKey(l)){
                    catalogueP.put(l,new ArrayList());
                }
                catalogueP.get(l).add(p);
            }
        }
        
        //chercher les programmeur
        Set<Programmeur> resultats;
        resultats = new TreeSet<>();
        String[] t = langages.split(",");
        for (String langage:t){
            langage=langage.trim().toUpperCase();
            if(catalogueP.containsKey(langage.trim())){
                List<Programmeur> liste = catalogueP.get(langage.trim());
                resultats.addAll(liste);
            }
        }
        return resultats;
    }
}