
package com.TP2.controller;

import com.TP2.Entites.Programmeur;
import com.TP2.services.ProgrammeurService;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


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
}
