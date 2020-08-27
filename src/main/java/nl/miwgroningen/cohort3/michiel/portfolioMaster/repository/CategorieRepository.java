package nl.miwgroningen.cohort3.michiel.portfolioMaster.repository;

import nl.miwgroningen.cohort3.michiel.portfolioMaster.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository <Categorie, Integer> {
}
