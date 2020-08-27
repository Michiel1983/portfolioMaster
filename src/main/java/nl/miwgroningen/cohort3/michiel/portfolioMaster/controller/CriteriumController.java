package nl.miwgroningen.cohort3.michiel.portfolioMaster.controller;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Criterium;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.service.CategorieService;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.service.CriteriumService;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CriteriumController {

    @Autowired
    private CriteriumService criteriumService;

    @RequestMapping("/criterium/{categorieId}")
    public String showNewCriteriumForm(Model model) {
        Criterium criteria = new Criterium();
        model.addAttribute("criterium", criteria);
        return "new_criterium";
    }

    @GetMapping("/criterium")
    public String showCriteria(Model model) {
        List<Criterium> listCriteria = criteriumService.listAll();
        model.addAttribute("listCriteria", listCriteria);
        return "new_criterium";
    }

    @PostMapping("/saveCriterium")
    public String save(@ModelAttribute("criterium/{categorieId}") Criterium criterium) {
        criteriumService.save(criterium);
        return "redirect:/criterium/{categorieId}";
    }

}