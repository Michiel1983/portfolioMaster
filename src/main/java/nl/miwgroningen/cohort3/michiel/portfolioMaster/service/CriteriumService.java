package nl.miwgroningen.cohort3.michiel.portfolioMaster.service;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Criterium;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.repository.CategorieRepository;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.repository.CriteriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CriteriumService {
    @Autowired
    private CriteriumRepository criteriumRepository;

    public List<Criterium> listAll() {
        return criteriumRepository.findAll();
    }

    public void save(Criterium criterium) {
        criteriumRepository.save(criterium);
    }

    public Criterium get(int id) {
        return criteriumRepository.findById(id).get();
    }

    public void delete(int id) {
        criteriumRepository.deleteById(id);
    }
}
