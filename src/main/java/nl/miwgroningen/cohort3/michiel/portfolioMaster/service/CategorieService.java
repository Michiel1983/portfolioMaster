package nl.miwgroningen.cohort3.michiel.portfolioMaster.service;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> listAll() {
        return categorieRepository.findAll();
    }

    public void save(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    public Categorie get(int id) {
        return categorieRepository.findById(id).get();
    }

    public void delete(int id) {
        categorieRepository.deleteById(id);
    }
}
