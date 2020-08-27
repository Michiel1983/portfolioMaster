package nl.miwgroningen.cohort3.michiel.portfolioMaster.controller;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.repository.CategorieRepository;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/portfolio")
    public String beginscherm(Model model) {
        List<Categorie> listCategorien = categorieService.listAll();
        model.addAttribute("listCategorien", listCategorien);
        return "welkom";
    }


    @RequestMapping("/new")
    public String showNewCategorieForm(Model model) {
        Categorie categorie = new Categorie();
        model.addAttribute("categorie", categorie);
        return "new_categorie";
    }

    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    public String save(@ModelAttribute("categorie") Categorie categorie) {
        categorieService.save(categorie);
        return "redirect:/portfolio";
    }


}
