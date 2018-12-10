
package com.TP2.services;

import com.TP2.Entites.Programmeur;
import com.TP2.dao.ProgrammeurDao;
import java.util.ArrayList;
import java.util.List;


public class ProgrammeurService {
    
    private ProgrammeurDao dao;
    
    
    public void setDao(ProgrammeurDao dao){
        this.dao = dao;
    }
    
    public boolean addProgrammeur(Programmeur p){
        return dao.create(p);
    }
    
    public List<Programmeur> getProgrammeurs(){
        List<Programmeur> liste = new ArrayList<>();
        liste = dao.findAll();
        return liste;
    }  
}