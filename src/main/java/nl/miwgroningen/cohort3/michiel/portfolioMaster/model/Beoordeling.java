package nl.miwgroningen.cohort3.michiel.portfolioMaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beoordeling {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String beoordelingId;
    private String datum;
    private String beschrijving;
    private String gitCommit;
    private String prioriteit;

    public Beoordeling(String beoordelingId, String datum, String beschrijving, String gitCommit, String prioriteit) {
        this.beoordelingId = beoordelingId;
        this.datum = datum;
        this.beschrijving = beschrijving;
        this.gitCommit = gitCommit;
        this.prioriteit = prioriteit;
    }

    public Beoordeling() {
    }

    public String getBeoordelingId() {
        return beoordelingId;
    }

    public void setBeoordelingId(String id) {
        this.beoordelingId = id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getGitCommit() {
        return gitCommit;
    }

    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    public String getPrioriteit() {
        return prioriteit;
    }

    public void setPrioriteit(String prioriteit) {
        this.prioriteit = prioriteit;
    }
}
