package school;

import java.time.Instant;

public class GradeChange {
    private double nouvelleValeur;
    private Instant date;
    private String motif;

    public GradeChange(double nouvelleValeur, Instant date, String motif) {
        this.nouvelleValeur = nouvelleValeur;
        this.date = date;
        this.motif = motif;
    }

    public double getNouvelleValeur() { 
        return nouvelleValeur; 
    }
    public Instant getDate() { 
        return date; 
    }
    public String getMotif() { 
        return motif; 
    }

    public void setNouvelleValeur(double nouvelleValeur) { 
        this.nouvelleValeur = nouvelleValeur; 
    }
    public void setDate(Instant date) { 
        this.date = date; 
    }
    public void setMotif(String motif) { 
        this.motif = motif; 
    }
}
