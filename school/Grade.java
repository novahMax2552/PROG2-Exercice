package school;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student student;
    private Exam exam;
    private double valeurInitiale;
    private List<GradeChange> historique;

    public Grade(Student student, Exam exam, double valeurInitiale) {
        this.student = student;
        this.exam = exam;
        this.valeurInitiale = valeurInitiale;
        this.historique = new ArrayList<>();
    }

    public Student getStudent() { 
        return student; 
    }

    public Exam getExam() { 
        return exam;
    }
    public double getValeurInitiale() { 
        return valeurInitiale; 
    }
    public List<GradeChange> getHistorique() { 
        return historique; 
    }

    public void setValeurInitiale(double valeurInitiale) { 
        this.valeurInitiale = valeurInitiale; 
    }

    public void addChange(double nouvelleValeur, Instant date, String motif) {
        historique.add(new GradeChange(nouvelleValeur, date, motif));
    }

    public double getValeurAt(Instant t) {
        double valeur = valeurInitiale;
        for (GradeChange change : historique) {
            if (!change.getDate().isAfter(t)) {
                valeur = change.getNouvelleValeur();
            }
        }
        return valeur;
    }
}
