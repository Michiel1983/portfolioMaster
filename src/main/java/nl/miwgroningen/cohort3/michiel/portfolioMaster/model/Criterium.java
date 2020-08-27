package nl.miwgroningen.cohort3.michiel.portfolioMaster.model;

import javax.persistence.*;

@Entity
public class Criterium {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer criteriumId;
    private int cijfer;
    private String beschrijving;
    @ManyToOne
    @JoinColumn(name = "categorieId", referencedColumnName = "categorieId", nullable = false)
    private Categorie categorie;

    public Criterium() {
    }

    public Integer getCriteriumId() {
        return criteriumId;
    }

    public void setCriteriumId(Integer criteriumId) {
        this.criteriumId = criteriumId;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
