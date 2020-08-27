package nl.miwgroningen.cohort3.michiel.portfolioMaster.controller;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Doel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoelController {

    @RequestMapping("/doel/{categorieId}")
    public String showNewDoelForm(Model model) {
        Doel doel = new Doel();
        model.addAttribute("doel", doel);
        return "new_doel";
    }
}
