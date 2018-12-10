
package com.TP2.controller;

import com.TP2.Entites.Programmeur;
import com.TP2.services.ProgrammeurService;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ProgrammeurController {
    
    private ProgrammeurService programmeurService;
    
    public void setProgrammeurService(ProgrammeurService programmeurService) {
        this.programmeurService = programmeurService;
    }
    
    //@ResponseBody
    @RequestMapping("/")
    public String welcome(ModelMap model) {
        List<Programmeur> liste = this.programmeurService.getProgrammeurs();
        model.addAttribute("programmeur", liste);
        return "index";
    }
    
    //@ResponseBody
    @RequestMapping(method = RequestMethod.POST, value="/", params={"rechercher"})
    public String welcome(@RequestParam("lgs") String l, ModelMap model) {
        //model.addAttribute("programmeur", this.programmeurService.getProgrammeur(courriel) );
        return "index";
    }
    
    //@ResponseBody
    @RequestMapping(method = RequestMethod.GET, value="/", params={"id"})
    public String profil(@RequestParam("id") String courriel, ModelMap model) {
        model.addAttribute("programmeur", this.programmeurService.getProgrammeur(courriel) );
        return "profil";
    }
    
    @RequestMapping(value = "ajouter", method = RequestMethod.GET)
    public String ajouter(ModelMap model) throws IOException
    { 
        return "ajouter";
    }
    
    @RequestMapping(value = "ajouter", method = RequestMethod.POST)
    public String ajouter(@RequestParam("nom") String n,@RequestParam("courriel") String c,@RequestParam("lang") String l)
    {
        Programmeur p = new Programmeur();
        p.setNom(n);
        p.setCourriel(c);
        p.setLangages(l);
        this.programmeurService.addProgrammeur(p);
        
        return "index";
    }
}
