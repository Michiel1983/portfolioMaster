package nl.miwgroningen.cohort3.michiel.portfolioMaster.service;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Doel;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.repository.CategorieRepository;
import nl.miwgroningen.cohort3.michiel.portfolioMaster.repository.DoelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoelService {
    @Autowired
    private DoelRepository doelRepository;

    public List<Doel> listAll() {
        return doelRepository.findAll();
    }

    public void save(Doel doel) {
        doelRepository.save(doel);
    }

    public Doel get(int id) {
        return doelRepository.findById(id).get();
    }

    public void delete(int id) {
        doelRepository.deleteById(id);
    }
}
