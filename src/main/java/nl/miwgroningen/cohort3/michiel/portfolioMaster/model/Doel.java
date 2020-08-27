package nl.miwgroningen.cohort3.michiel.portfolioMaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doelId;
    private String beschrijvingDoel;
    private String streefDatum;

    public Doel(int doelId, String beschrijvingDoel, String streefDatum) {
        this.doelId = doelId;
        this.beschrijvingDoel = beschrijvingDoel;
        this.streefDatum = streefDatum;
    }

    public Doel() {
    }

    public int getDoelId() {
        return doelId;
    }

    public void setDoelId(int idDoel) {
        this.doelId = idDoel;
    }

    public String getBeschrijvingDoel() {
        return beschrijvingDoel;
    }

    public void setBeschrijvingDoel(String beschrijvingDoel) {
        this.beschrijvingDoel = beschrijvingDoel;
    }

    public String getStreefDatum() {
        return streefDatum;
    }

    public void setStreefDatum(String streefDatum) {
        this.streefDatum = streefDatum;
    }
}
