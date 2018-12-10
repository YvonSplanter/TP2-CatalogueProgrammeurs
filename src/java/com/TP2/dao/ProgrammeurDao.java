
package com.TP2.dao;

import com.TP2.Entites.Programmeur;
import com.TP2.jdbc.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProgrammeurDao {
    
    private Connexion connexion;
    
    public boolean create(Programmeur p) {
        try {
            PreparedStatement stm = connexion.getInstance().prepareStatement("INSERT INTO programmeur VALUES (?,?,?) ");
            stm.setString(1, p.getNom());
            stm.setString(2, p.getCourriel());
            stm.setString(3, p.getLangages());
            return stm.executeUpdate()>0;
        } catch (SQLException ex) {
            Logger.getLogger(ProgrammeurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Programmeur> findAll() {
        List<Programmeur> liste = new ArrayList<>();
        Programmeur p;
        try {
            PreparedStatement stm = connexion.getInstance().prepareStatement("SELECT * FROM programmeur");
            ResultSet res = stm.executeQuery();
            while (res.next()){
                p = new Programmeur();
                p.setNom(res.getString("NOM"));
                p.setCourriel(res.getString("COURRIEL"));
                p.setLangages(res.getString("LANGAGES"));
                liste.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProgrammeurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }
    
    
    
    public void setConnexion(Connexion connexion) {
        this.connexion = connexion;
    }  
}
